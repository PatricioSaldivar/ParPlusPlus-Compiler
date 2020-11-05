const {ParPlusPlusListener} = require('./antlr4AutoGen/ParPlusPlusListener');
const virtualMemoryHandler = require('./virtualMemoryHandler');
const { memoryCtr } = require('./virtualMemoryHandler');
const Quadruple = require('./quadruples/quadruple');
const quadruplerHandler = require('./quadruples/quadrupleHandler');
const semanticCube = require('./semantics/semanticCube');
const semanticCubeHandler = require('./semantics/semanticCubeHandler');

const { push } = require('./semantics/semanticCube');
const { PilaO, listQuadruples } = require('./quadruples/quadrupleHandler');

// Use virtual memory in order to process the quadruples.
let functionTable = new Map();

// The vars table saves the ID and the type.
functionTable.set("Global", {
    type: "void",
    vars: new Map(),
    localVars: new Map(),
});

let constantTable = new Map();

let currentFunction = "Global";
let currentType = "";
let forLoopIDHelper;

let iCurrParamMap = 0;
let iCountParam = 0;

let currentFunctionCall = "";


class DefaultListener extends ParPlusPlusListener {
    
    enterProgram(ctx) {
        // console.log('children CTX');
        // console.log(ctx);
        let quad = new Quadruple('FuGOTO', null, null, -1);
        quadruplerHandler.listQuadruples.push(quad);
        quadruplerHandler.PJumps.push(0);
    }
    exitProgram(ctx){
        console.log(functionTable);
        console.log('———————————————————————————————————————');
        console.log(constantTable);
        console.log('');
        console.log('');
        console.log('———————————————————————————————————————');
        console.log(quadruplerHandler.listQuadruples);
    }

    enterMain(ctx){
        let startMain = quadruplerHandler.PJumps.peek();
        quadruplerHandler.PJumps.pop();
        let lastQuad = quadruplerHandler.listQuadruples.length;
        quadruplerHandler.listQuadruples[startMain].fillDestinationDir(lastQuad);

    }
    // Function block
    enterFuncBlock(ctx){
        // Verify that function block is not empty
        if(ctx.children) {

        // Check if function ID already exists
            if(functionTable.get(ctx.ID().getText()) != undefined){
                throw Error(`ERROR, ID ${ctx.ID().getText()} already exists`);
                return;
            }
            let type = !!ctx.type()? ctx.type().getText() : ctx.VOID().getText();
            // Enter function to funtion table
            functionTable.set(ctx.ID().getText(), {
                type: type,
                vars: new Map(),
                // NEW
                params: new Map(),
                localVars: new Map(),
                starts: quadruplerHandler.listQuadruples.length,
                iParams: 0,
                iLocalVars: 0
            });
            currentFunction = ctx.ID().getText(); 
        }
    }

    // Exit function.
    exitFuncEnd(ctx){
        // Step 1: Todo Release the current VarTable (local).
        /*
        let myCurrFunc = functionTable.get(currentFunction);
        myCurrFunc.vars = new Map();
        functionTable.set(currentFunction, myCurrFunc);
        */
        
        // Step 2: Generate an action to end the function (ENDFunc).
        let quad = new Quadruple('ENDFUNC', null, null, null);
        quadruplerHandler.listQuadruples.push(quad);
        
        // Step 3: Todo Insert into DirFunc the number of temporal vars used. **to calculate the workspace required for execution
    }

     // Return function.
     exitReturnFunc(ctx){
        // Step 1: Generate a return quadruple
        // TODO BUG: Return falla cuando pones solo return 1 o return 'c'.
        let returnMemDir = listQuadruples[listQuadruples.length - 1].iDirThree;
        let quad = new Quadruple('RETURN', returnMemDir, null, null);
        quadruplerHandler.listQuadruples.push(quad);
        // Add the return memory direction.
        functionTable.get("Global").vars.set(currentFunction, returnMemDir);
    }


    enterFuncCall(ctx) {
        currentFunctionCall = ctx.ID().getText();
         // Check if function ID already exists
         if(!functionTable.get(ctx.ID().getText())){
            throw Error(`ERROR, La función ${ctx.ID().getText()} no existe`);
        }
        // Generate the ERA Action
        let quad = new Quadruple('ERA', null, null, null);
        quadruplerHandler.listQuadruples.push(quad);
    }

    exitFuncCall(ctx) {
       // Generate the ERA Action
       let quad = new Quadruple('GOSUB', ctx.ID().getText(), null, functionTable.get(ctx.ID().getText()).starts );
       quadruplerHandler.listQuadruples.push(quad);
   }

   enterArguments(ctx) {
    iCurrParamMap = functionTable.get(currentFunctionCall).params.entries();
    iCountParam = 0;
   }

   exitArguments(ctx) {
    iCurrParamMap = 0;
    iCountParam = 0;
   }

    // We have an argument
    enterRarguments(ctx) {
        // k is an array, [0] is parameter name, [1] is parameter dir.
        let k = iCurrParamMap.next().value
        iCountParam++;

        let argument = quadruplerHandler.PilaO.peek();
        quadruplerHandler.PilaO.pop();

        let argumentType = quadruplerHandler.PTypes.peek();
        quadruplerHandler.PTypes.pop();

        // Verify ArgumentType against current Parameter (#k) in ParameterTable.
        if (argumentType == memoryCtr.getType(k[1])) {
            // Generate action PARAMETER, Argument, Argument#k
            let quad = new Quadruple('PARAMETER', argument, k[1], null);
            quadruplerHandler.listQuadruples.push(quad);
        }
        else {
            throw Error("Incompatible argument type.");
        }
   }


    // Ejecuta después de leer los parámetros.
    enterVarBlock(ctx){
        let value = functionTable.get(currentFunction);
        value.iParams = functionTable.get(currentFunction).vars.size;
        functionTable.set(currentFunction, value);
    }

     // Ejecuta después de leer las variables.
    exitVarBlock(ctx){
        let value = functionTable.get(currentFunction);
        value.iLocalVars = value.vars.size - value.iParams;
        functionTable.set(currentFunction, value);
    }

    // Enter variable creation block
    enterVars(ctx){
        // Set the type of variable or variables that will be declared.
        currentType = ctx.type().getText();
        currentType = currentType.toUpperCase();
    }

    enterParams(ctx){
        if(ctx.children){
            currentType = ctx.type().getText();
            currentType = currentType.toUpperCase();
            // Check any variable direction overflow in the memory
            let newDir = memoryCtr.setDirection(currentType, currentFunction);
            if (newDir === -1)
            {
                console.log('ERROR, Variable declaration overflow');
            }
            // Single Variable
            else if (ctx.varDimensionsInit != undefined)
            {
                // FLAG
                functionTable.get(currentFunction).vars.set(ctx.ID().getText(),newDir);

                // Insert params
                functionTable.get(currentFunction).params.set(ctx.ID().getText(), newDir);

            }
            // List or Matrix variable
            else {
                functionTable.get(currentFunction).vars.set(ctx.ID().getText(), newDir);

                // Insert params
                functionTable.get(currentFunction).params.set(ctx.ID().getText(), newDir);
            }
        }

    }

    //Declare a variable
    enterXvars(ctx){
        // Check if ID is duplicate
        if(functionTable.get(currentFunction).vars.get(ctx.ID().getText())){
           throw Error(`ERROR, ID ${ctx.ID().getText()} already exists`);
            return;            
        }
        // Check any variable direction overflow in the memory
        let newDir = memoryCtr.setDirection(currentType, currentFunction);
        if (newDir === -1)
        {
            throw Error('ERROR, Variable declaration overflow');
        }

        // Single Variable
        else if (ctx.varDimensionsInit != undefined)
        {
            // FLAG
            functionTable.get(currentFunction).vars.set(ctx.ID().getText(),newDir);

            // Insert local vars
            if(currentFunction != "Global")
            {
                functionTable.get(currentFunction).localVars.set(ctx.ID().getText(), newDir);
            }
        }
        // List or Matrix variable
        else {
            functionTable.get(currentFunction).vars.set(ctx.ID().getText(), newDir);
             // Insert local vars
            if(currentFunction != "Global")
            {
                functionTable.get(currentFunction).localVars.set(ctx.ID().getText(), newDir);
            }
        }
    }


    // ========= Creacion de cuadroplus ====================
    exitExpresion(ctx){
        if(!quadruplerHandler.POper.isEmpty()){
            if(quadruplerHandler.POper.peek() === ">" 
            || quadruplerHandler.POper.peek() === "<" 
            || quadruplerHandler.POper.peek() === "<=" 
            || quadruplerHandler.POper.peek() === ">=" 
            || quadruplerHandler.POper.peek() === "=="
            || quadruplerHandler.POper.peek() === "!="
            || quadruplerHandler.POper.peek() === "&&"
            || quadruplerHandler.POper.peek() === "||"
            || quadruplerHandler.POper.peek() === "!"){
                this.makeQuadruple();
            }
        }
    }


    exitExp(ctx){
        if(!quadruplerHandler.POper.isEmpty()){
            if(quadruplerHandler.POper.peek() === "+" || quadruplerHandler.POper.peek() === "-"){
                this.makeQuadruple();
            }
        }
    }

    exitPlus(ctx){
        quadruplerHandler.POper.push("+");
    }
    exitMinus(ctx){
        quadruplerHandler.POper.push("-");
    }
 
    exitTermino(ctx){
        if(!quadruplerHandler.POper.isEmpty()){
            if(quadruplerHandler.POper.peek() === "*" || quadruplerHandler.POper.peek() === "/"){
                this.makeQuadruple();
            }
        }
    }

    exitMod(ctx){
        quadruplerHandler.POper.push("%");
    }
    exitMult(ctx){
        quadruplerHandler.POper.push("*");
    }
    exitDiv(ctx){
        quadruplerHandler.POper.push("/");
    }
    exitLessThanOrEqualExp(ctx){
        quadruplerHandler.POper.push("<=");
    }
    exitGreaterThanOrEqualExp(ctx){
        quadruplerHandler.POper.push(">=");
    }
    exitEqualsExp(ctx){
        quadruplerHandler.POper.push("==");
    }
    exitDifferentExp(ctx){
        quadruplerHandler.POper.push("!=");
    }
    exitAndExp(ctx){
        quadruplerHandler.POper.push("&&");
    }
    exitOrExp(ctx){
        quadruplerHandler.POper.push("||");
    }
    exitLessThan(ctx){
        quadruplerHandler.POper.push("<");
    }
    exitGreaterThan(ctx){
        quadruplerHandler.POper.push(">");
    } 
    exitNotExp(ctx){
        quadruplerHandler.POper.push("!");
    }
    exitAsignation(ctx){
        let result;
        let result_type;
        if(ctx.varDimensions().children)
        {
            //Assign value to array
            console.log("ID CON DIMS encontrodado" + ctx.ID().getText() + ctx.varDimensions().getText());
        }
        else
        {
            //Searches for the id, and then inserts its memory allocation and type to the stacks. 
            if(functionTable.get(currentFunction).vars.has(ctx.ID().getText())){
               result = functionTable.get(currentFunction).vars.get(ctx.ID().getText());
               result_type = memoryCtr.getType(result);

            }else if(functionTable.get("Global").vars.has(ctx.ID().getText())){
                result = functionTable.get("Global").vars.get(ctx.ID().getText());
                result_type = memoryCtr.getType(result);

            }else{
                console.log('HERE');
                console.log("ERROR, variable with ID: " + ctx.ID().getText() + " not found" );
                console.log(functionTable.get("Global").vars);
                console.log("-----------------");
                console.log(typeof functionTable.get("Global").vars.get(ctx.ID().getText()));
            }
            let left_operand = quadruplerHandler.PilaO.peek();
            let left_type = quadruplerHandler.PTypes.peek();
            quadruplerHandler.PilaO.pop();
            quadruplerHandler.PTypes.pop();
            result_type = semanticCubeHandler.getType("=", result_type, left_type);
            if(result_type === "ERROR"){
                throw Error("Assignation Error");
            }else{
            let quad = new Quadruple("=",left_operand,null, result, false, false, false);
            quadruplerHandler.listQuadruples.push(quad);
            }
        }
    }

    enterFactor(ctx){
        // TODO Flag: function call 
        if(ctx.cte())
        {
            // ctx.cte() no es undefined, por ende Si existe.
            if(ctx.MINUS()){
                // regresar -ctx
                if (quadruplerHandler.PTypes.peek() == "INT" || quadruplerHandler.PTypes.top() == "FLOAT"){
                    let myNum = quadruplerHandler.PilaO.peek();
                    myNum *= -1;
                    quadruplerHandler.PilaO.pop();
                    quadruplerHandler.PilaO.push(myNum);
                }else{
                    throw Error("ERROR, a constant that is not a number can't be negative");
                } 
            
            }
        }else if(ctx.LP()){
            quadruplerHandler.POper.push("(");
        }
    }

    exitFactor(ctx){
        // TODO Flag: function call 
        if(ctx.LP()){
            quadruplerHandler.POper.pop();
        }
    }


    // TODO: Optimize clarity by creating functions.
    enterCte(ctx) {
        if(ctx.INT())
        {
            quadruplerHandler.PTypes.push('INT');
            // Ver si ya existe
            if(!constantTable.has(ctx.INT().getText())){
                 // si no existe lo agrega
                constantTable.set(ctx.INT().getText(), memoryCtr.iConstantCount);
                memoryCtr.addConstantMemorySlot();
            }
            quadruplerHandler.PilaO.push(constantTable.get(ctx.INT().getText()));
        }
        else if(ctx.FLOAT())
        {
            quadruplerHandler.PTypes.push('FLOAT');
            // Verifica si la constante existe en la tabla
            if(!constantTable.has(ctx.FLOAT().getText())){
                // si no existe lo agrega
                constantTable.set(ctx.FLOAT().getText(), memoryCtr.iConstantCount);
                memoryCtr.addConstantMemorySlot();
            }
            quadruplerHandler.PilaO.push(constantTable.get(ctx.FLOAT().getText()));
            
        }
        else if(ctx.CHAR())
        {
            quadruplerHandler.PTypes.push('CHAR');
            // Verifica si la constante existe en la tabla
            if (!constantTable.has(ctx.CHAR().getText())){
                // si no existe lo agrega 
                constantTable.set(ctx.CHAR().getText(), memoryCtr.iConstantCount);
                memoryCtr.addConstantMemorySlot();
            }
            quadruplerHandler.PilaO.push(constantTable.get(ctx.CHAR().getText()));
            
        }
        else if(ctx.STRING())
        {
            quadruplerHandler.PTypes.push('STRING');
            // Verifica si la constante existe en la tabla
            if (!constantTable.has(ctx.STRING().getText())){
                // FLAG: Strings are not getting stored.
                // si no existe lo agrega 
                constantTable.set(ctx.STRING().getText(), memoryCtr.iConstantCount);
                memoryCtr.addConstantMemorySlot();
            }
            
                quadruplerHandler.PilaO.push(constantTable.get(ctx.STRING().getText()));
            
        }
        else if(ctx.ID()){
            // For arrays and matrices.
            if(ctx.varDimensions().children)
            {
                //Arreglos
                console.log("ID CON DIMS encontrodado" + ctx.ID().getText() + ctx.varDimensions().getText());
            }
            else
            {
                //Searches for the id, and then inserts its memory allocation and type to the stacks. 
                if(functionTable.get(currentFunction).vars.has(ctx.ID().getText())){
                    quadruplerHandler.PilaO.push(functionTable.get(currentFunction).vars.get(ctx.ID().getText()));
                    quadruplerHandler.PTypes.push(memoryCtr.getType(quadruplerHandler.PilaO.peek()));

                }else if(functionTable.get("Global").vars.has(ctx.ID().getText())){
                    quadruplerHandler.PilaO.push(functionTable.get("Global").vars.get(ctx.ID().getText()));
                    quadruplerHandler.PTypes.push(memoryCtr.getType(quadruplerHandler.PilaO.peek()));

                }else{
                    // TODO: Stop execution when there is an error.
                    throw Error("ERROR, variable with ID: " + ctx.ID().getText() + " not found" );
                }
            }
        }
    }

    exitSemicolon(ctx) {
        // Restarts Quadruple Stacks and Temporal Memory.
        memoryCtr.restartTemporalMemorySlot();

        while(quadruplerHandler.PilaO.size() > 0)
        {
            quadruplerHandler.PilaO.pop();
        }
        while(quadruplerHandler.PTypes.size() > 0)
        {
            quadruplerHandler.PTypes.pop();
        }
        while(quadruplerHandler.POper.size() > 0)
        {
            quadruplerHandler.POper.pop();
        }
        
    }

    // DO IFs.
    enterDecisiontwo(ctx) {
        // TODO REFACTOR
        var result;
        var exp_type = quadruplerHandler.PTypes.peek();
        quadruplerHandler.PTypes.pop();
        
        if(exp_type === 'CHAR' || exp_type === 'STRING') {
            throw new Error('Type Mismatched: Expected a Boolean Expression on IF.');
        }
        else {
        
          result = quadruplerHandler.PilaO.peek();
          quadruplerHandler.PilaO.pop();
          //  Generar Cuádruplo
          let quad = new Quadruple('GOTOF', result, null, -1);
          quadruplerHandler.listQuadruples.push(quad);
            // Test the -1
          let iCount = quadruplerHandler.listQuadruples.length - 1;
          quadruplerHandler.PJumps.push(iCount)
        }
    }

    // Se acaba el IF
    exitDecision(ctx) {
        // New Code
        let endJump = quadruplerHandler.PJumps.peek();
        quadruplerHandler.PJumps.pop();
        let currListSize = quadruplerHandler.listQuadruples.length
        quadruplerHandler.listQuadruples[endJump].fillDestinationDir(currListSize);   
    }

    enterXdecision(ctx){
        // New Code.
        let quad = new Quadruple('GOTO', null, null, -1);
        quadruplerHandler.listQuadruples.push(quad);
        
        let iCount = quadruplerHandler.listQuadruples.length - 1;
        let ifFalse = quadruplerHandler.PJumps.peek();
        quadruplerHandler.PJumps.pop();
        quadruplerHandler.PJumps.push(iCount); // count - 1
        quadruplerHandler.listQuadruples[ifFalse].fillDestinationDir(iCount + 1); // count 
    }


    // ======== WHILE LOOPS ==============

    enterWhilelooptwo(ctx) {
        // push a la pila de saltos
        let iCount = quadruplerHandler.listQuadruples.length;
        quadruplerHandler.PJumps.push(iCount);
    }

    enterWhileloopthree(ctx) {
        // TODO REFACTOR AND VERIFY BOOLEAN OPERATORS
        var result;
        var exp_type = quadruplerHandler.PTypes.peek();
        quadruplerHandler.PTypes.pop();
        
        if(exp_type === 'CHAR' || exp_type === 'STRING') {
            throw new Error('Type Mismatched: Expected a Boolean Expression on IF.');
        }
        else {
        result = quadruplerHandler.PilaO.peek();
        quadruplerHandler.PilaO.pop();
        //  Generar Cuádruplo
        let quad = new Quadruple('GOTOF', result, null, -1);
        quadruplerHandler.listQuadruples.push(quad);
        // Test the -1
        let iCount = quadruplerHandler.listQuadruples.length - 1;
        quadruplerHandler.PJumps.push(iCount)
        }
    }

    exitWhileloop(ctx) {
        // New Code
        let endJump = quadruplerHandler.PJumps.peek();
        quadruplerHandler.PJumps.pop();

        let returnJump = quadruplerHandler.PJumps.peek();
        quadruplerHandler.PJumps.pop();

        //  Generar Cuádruplo GOTO
        let quad = new Quadruple('GOTO', null, null, returnJump);
        quadruplerHandler.listQuadruples.push(quad);

        let currListSize = quadruplerHandler.listQuadruples.length
        quadruplerHandler.listQuadruples[endJump].fillDestinationDir(currListSize);   
    }

    // ================== FOR LOOP ===========================

    enterForloop(ctx){
        if(functionTable.get(currentFunction).vars.has(ctx.asignation().ID().getText())){
            forLoopIDHelper = functionTable.get(currentFunction).vars.get(ctx.asignation().ID().getText());

        }else if(functionTable.get("Global").vars.has(ctx.asignation().ID().getText())){
            forLoopIDHelper = functionTable.get("Global").vars.get(ctx.asignation().ID().getText());
        }
    }

    enterForlooptwo(ctx){
                // push a la pila de saltos
                let iCount = quadruplerHandler.listQuadruples.length;
                quadruplerHandler.PJumps.push(iCount);
    }

    enterForloopthree(ctx){
        quadruplerHandler.POper.push("==");
        quadruplerHandler.PilaO.push(forLoopIDHelper);
        quadruplerHandler.PTypes.push(memoryCtr.getType(quadruplerHandler.PilaO.peek()));
        this.makeQuadruple();
        var result;
        var exp_type = quadruplerHandler.PTypes.peek();
        quadruplerHandler.PTypes.pop();
        
        if(exp_type === 'CHAR' || exp_type === 'STRING') {
            throw new Error('Type Mismatched: Expected a Boolean Expression on IF.');
        }
        else {
        result = quadruplerHandler.PilaO.peek();
        quadruplerHandler.PilaO.pop();
        //  Generar Cuádruplo
        let quad = new Quadruple('GOTOF', result, null, -1);
        quadruplerHandler.listQuadruples.push(quad);
        // Test the -1
        let iCount = quadruplerHandler.listQuadruples.length - 1;
        quadruplerHandler.PJumps.push(iCount)
        }
    }

    exitForloop(ctx){
        let endJump = quadruplerHandler.PJumps.peek();
        quadruplerHandler.PJumps.pop();        
        let returnJump = quadruplerHandler.PJumps.peek();
        quadruplerHandler.PJumps.pop();

        //  Generar Cuádruplo GOTO
        if(!constantTable.has("1")){
            // si no existe lo agrega
           constantTable.set("1");
           memoryCtr.addConstantMemorySlot();
        }

        if(functionTable.get(currentFunction).vars.has(ctx.asignation().ID().getText())){
            quadruplerHandler.PilaO.push(functionTable.get(currentFunction).vars.get(ctx.asignation().ID().getText()));
            quadruplerHandler.PilaO.push(functionTable.get(currentFunction).vars.get(ctx.asignation().ID().getText()));

        }else if(functionTable.get("Global").vars.has(ctx.asignation().ID().getText())){
            quadruplerHandler.PilaO.push(functionTable.get("Global").vars.get(ctx.asignation().ID().getText()));
            quadruplerHandler.PilaO.push(functionTable.get("Global").vars.get(ctx.asignation().ID().getText()));
        }
        quadruplerHandler.PTypes.push(memoryCtr.getType(quadruplerHandler.PilaO.peek()));
        quadruplerHandler.PTypes.push(memoryCtr.getType(quadruplerHandler.PilaO.peek()));

        quadruplerHandler.POper.push("=");
        quadruplerHandler.POper.push("+");

        quadruplerHandler.PTypes.push("INT");
        quadruplerHandler.PilaO.push(constantTable.get("1"));

        this.makeQuadruple();
        this.makeQuadruple();
        let quad = new Quadruple('GOTO', null, null, returnJump);
        quadruplerHandler.listQuadruples.push(quad);

        let currListSize = quadruplerHandler.listQuadruples.length
        quadruplerHandler.listQuadruples[endJump].fillDestinationDir(currListSize);  
    }



    makeQuadruple(){
        let operator = quadruplerHandler.POper.peek();
        quadruplerHandler.POper.pop();
        let right_operand = quadruplerHandler.PilaO.peek();
        let right_type = quadruplerHandler.PTypes.peek();
        quadruplerHandler.PilaO.pop();
        quadruplerHandler.PTypes.pop();
        if(operator === "!"){
            if(right_type === "STRING" || right_type === "CHAR" ){
                throw Error("ERROR, cant do ! to a CHAR or a STRING");
            }else{
                let result = memoryCtr.getTemporalMemorySlot();
                let quad = new Quadruple(operator, right_operand, null, result, false, false, false);
                quadruplerHandler.listQuadruples.push(quad);
                quadruplerHandler.PilaO.push(result);
                let result_type = semanticCubeHandler.getType(operator, right_type, right_type);
                quadruplerHandler.PTypes.push(result_type);
            }
        }else{
            let left_operand = quadruplerHandler.PilaO.peek();
            let left_type = quadruplerHandler.PTypes.peek();
            quadruplerHandler.PilaO.pop();
            quadruplerHandler.PTypes.pop();
            let result_type = semanticCubeHandler.getType(operator, left_type, right_type);
            
            if(result_type === "ERROR"){
                throw Error("ERROR, cant do: " + left_operand + " " + operator + " " + right_operand);
            }
            else
            {
                // Result is equal to a tempral 
                let result = memoryCtr.getTemporalMemorySlot();
    
                let quad = new Quadruple(operator, left_operand, right_operand, result, false, false, false);
                quadruplerHandler.listQuadruples.push(quad);
                quadruplerHandler.PilaO.push(result);
                quadruplerHandler.PTypes.push(result_type);
                //If left operand or right operand are temporals, that memory should be free
                                    
                if(left_operand >= memoryCtr.temporalMemoryStartDir && left_operand <= memoryCtr.temporalMemoryEndDir){
                    //Free left_operand memory
                    memoryCtr.freeTemporalMemorySlot(left_operand);
                }
            }
        }
        
        if(right_operand >= memoryCtr.temporalMemoryStartDir && right_operand <= memoryCtr.temporalMemoryEndDir){
            //Free left_operand memory
            memoryCtr.freeTemporalMemorySlot(right_operand);
        }
    }
}
module.exports = DefaultListener;