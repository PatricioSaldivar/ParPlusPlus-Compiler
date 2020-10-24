const {ParPlusPlusListener} = require('./antlr4AutoGen/ParPlusPlusListener');
const virtualMemoryHandler = require('./virtualMemoryHandler');
const { memoryCtr } = require('./virtualMemoryHandler');
const Quadruple = require('./quadruples/quadruple');
const quadruplerHandler = require('./quadruples/quadrupleHandler');
const semanticCube = require('./semantics/semanticCube')

// Use virtual memory in order to process the quadruples.


let functionTable = new Map();

// The vars table saves the ID and the type.
functionTable.set("Global", {
    type: "void",
    vars: new Map(),
});


let currentFunction = "Global";
let currentType = "";

// Declare Stacks to develop quadruples







class DefaultListener extends ParPlusPlusListener {
    
    enterProgram(ctx) {
        console.log('children CTX');
        // console.log(ctx);
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
        currentType = ctx.type().getText;
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
            functionTable.get(currentFunction).vars.set(ctx.ID().getText(), 
                {
                    type: currentType,
                    dir: newDir,
                }
            );
        }
        // List or Matrix variable
        else {
            functionTable.get(currentFunction).vars.set(ctx.ID().getText(), {
                type: currentType,
                dir: newDir,
            } );
        }
    }


    // ========= Creacion de cuadroplus ====================
    enterExp(ctx){
        console.log("ENTER EXP");
        if(ctx.PLUS())
        {
            console.log(ctx.exp().getText() + "+" + ctx.termino().getText());
            // exp + termino
        
        }
        else if(ctx.MINUS())
        {
            console.log(ctx.exp().getText() + "-" + ctx.termino().getText());
            // exp - termino
        }
        else
        {
            // termino
        }
    }


 
    exitTermino(ctx){
        if(quadruplerHandler.POper.peek() === "*" || quadruplerHandler.POper.peek() === "/"){
            let operator = quadruplerHandler.POper.peek();
            quadruplerHandler.POper.pop();
            let right_operand = quadruplerHandler.PilaO.peek();
            let right_type = quadruplerHandler.PTypes.peek();
            quadruplerHandler.PilaO.pop();
            quadruplerHandler.PTypes.pop();
            let left_operand = quadruplerHandler.PilaO.peek();
            let left_type = quadruplerHandler.PTypes.peek();
            
            // To Do.
            let result_Type = semanticCube(left_type, right_type, operator);
            
            if(result_Type === "ERROR"){
                console.log("ERROR, cant do: " + left_operand + " " + operator + " " + right_operand);
            }
            else
            {
                
                let result = dirTemporal;
                dirTemproral++;
                // operator, iDirOne, iDirTwo, iDirThree, bGoTo
                let quad = new Quadruple(operator, );
                // result <-  AVAIL.next()    // 
                 
                // Concepto de AVAIL:
                /*
                    1 + 2 + 3 + 4
                    + 1 2 t1
                    + t1 3 t2
                    + t2 4 t3
                */
            }
        }
        
            
        if(ctx.MULT())
        {
           
        
        }
        else if(ctx.DIV())
        {
            // termino / factor

        }else if(ctx.MOD()){
            // termino % factor
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

    enterCte(ctx){
        if(ctx.INT())
        {
            quadruplerHandler.PTypes.push('INT');
            quadruplerHandler.PilaO.push(parseInt(ctx.INT().getText()) )
        }
        else if(ctx.FLOAT())
        {
            quadruplerHandler.PTypes.push('FLOAT');
            quadruplerHandler.PilaO.push(parseFloat(ctx.FLOAT().getText()) )
        }
        else if(ctx.CHAR())
        {
            quadruplerHandler.PTypes.push('CHAR');
            quadruplerHandler.PilaO.push(ctx.CHAR().getText())
        }
        else if(ctx.STRING())
        {
            quadruplerHandler.PTypes.push('STRING');
            quadruplerHandler.PilaO.push(ctx.STRING().getText())
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
                
                console.log("ID encontrodado" + ctx.ID().getText());
            }
        }
    }




}


module.exports = DefaultListener;