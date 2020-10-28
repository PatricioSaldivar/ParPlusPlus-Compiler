const {ParPlusPlusListener} = require('./antlr4AutoGen/ParPlusPlusListener');
const virtualMemoryHandler = require('./virtualMemoryHandler');
const { memoryCtr } = require('./virtualMemoryHandler');
const Quadruple = require('./quadruples/quadruple');
const quadruplerHandler = require('./quadruples/quadrupleHandler');
const semanticCube = require('./semantics/semanticCube');
const semanticCubeHandler = require('./semantics/semanticCubeHandler');

const { push } = require('./semantics/semanticCube');
const { PilaO } = require('./quadruples/quadrupleHandler');

// Use virtual memory in order to process the quadruples.


let functionTable = new Map();

// The vars table saves the ID and the type.
functionTable.set("Global", {
    type: "void",
    vars: new Map(),
});

let constantTable = new Map();

let currentFunction = "Global";
let currentType = "";

class DefaultListener extends ParPlusPlusListener {
    
    enterProgram(ctx) {
        // console.log('children CTX');
        // console.log(ctx);
    }
    exitProgram(ctx){
        console.log(functionTable);
        console.log(constantTable);
        console.log(quadruplerHandler.listQuadruples);
    }

    // Function block
    enterFuncBlock(ctx){
        
        // Verify that function block is not empty
        if(ctx.children) {

        // Check if function ID already exists
        if(functionTable.get(ctx.ID().getText()) != undefined){
            console.log(`ERROR, ID ${ctx.ID().getText()} already exists`);
            return;
        }
        // Enter function to funtion table
        functionTable.set(ctx.ID().getText(), {
            type: ctx.type().getText(),
            vars: new Map(),
        });
        // Set current function to self so the variables cold be declare inside it.
        currentFunction = ctx.ID().getText();
        memoryCtr.deleteLocalMemory;
        }
    }

    // Enter variable creation block
    enterVars(ctx){
        // Set the type of variable or variables that will be declared.
        currentType = ctx.type().getText();
        currentType = currentType.toUpperCase();
    }

    //Declare a variable
    enterXvars(ctx){
        // Check if ID is duplicate
        if(functionTable.get(currentFunction).vars.get(ctx.ID().getText())){
            console.log(`ERROR, ID ${ctx.ID().getText()} already exists`);
            return;            
        }
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
        }
        // List or Matrix variable
        else {
            functionTable.get(currentFunction).vars.set(ctx.ID().getText(), newDir);
        }
    }


    // ========= Creacion de cuadroplus ====================
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
                    console.log("ERROR, a constant that is not a number can't be negative");
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
                console.log("---------------------------");
                console.log(" Entra STRING");
                console.log("---------------------------");
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
                    // throw new Error('Variable Not Found');
                    console.log('HERE');
                    console.log("ERROR, variable with ID: " + ctx.ID().getText() + " not found" );
                    console.log(functionTable.get("Global").vars);
                    console.log("-----------------");
                    console.log(typeof functionTable.get("Global").vars.get(ctx.ID().getText()));
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
        // TODO REFACTOR AND VERIFY BOOLEAN OPERATORS
        var result;
        //var exp_type = quadruplerHandler.PTypes.peek();
        //quadruplerHandler.PTypes.pop();
        console.log(quadruplerHandler.PTypes);
        /*
        if(exp_type !== 'BOOLEAN') {
            throw new Error('Type Mismatched: Expected a Boolean Expression on IF.');
        }
        else {
        */
          result = quadruplerHandler.PilaO.peek();
          quadruplerHandler.PilaO.pop();
          //  Generar Cuádruplo
          let quad = new Quadruple('GOTOF', result, null, -1);
          quadruplerHandler.listQuadruples.push(quad);
            // Test the -1
          let iCount = quadruplerHandler.listQuadruples.length - 1;
          quadruplerHandler.PJumps.push(iCount)

        //   quadruplerHandler.listQuadruples[iCount].fill(1)
        //}
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

    exitExpresion(ctx) {
        console.log('I have exited expresion');
    }

    makeQuadruple(){
        let operator = quadruplerHandler.POper.peek();
        quadruplerHandler.POper.pop();
        let right_operand = quadruplerHandler.PilaO.peek();
        let right_type = quadruplerHandler.PTypes.peek();
        quadruplerHandler.PilaO.pop();
        quadruplerHandler.PTypes.pop();
        let left_operand = quadruplerHandler.PilaO.peek();
        let left_type = quadruplerHandler.PTypes.peek();
        quadruplerHandler.PilaO.pop();
        quadruplerHandler.PTypes.pop();
        let result_type = semanticCubeHandler.getType(operator, left_type, right_type);
        
        if(result_type === "ERROR"){
            console.log("ERROR, cant do: " + left_operand + " " + operator + " " + right_operand);
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

            if(right_operand >= memoryCtr.temporalMemoryStartDir && right_operand <= memoryCtr.temporalMemoryEndDir){
                //Free left_operand memory
                memoryCtr.freeTemporalMemorySlot(right_operand);
            }
        }
    }
}
module.exports = DefaultListener;