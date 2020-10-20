const {ParPlusPlusListener} = require('./antlr4AutoGen/ParPlusPlusListener');
const virtualMemoryHandler = require('./virtualMemoryHandler');
const objects = require('./objects');
const { memoryCtr } = require('./virtualMemoryHandler');

// Use virtual memory in order to process the quadruples.


let functionTable = new Map();

// The vars table saves the ID and the type.
functionTable.set("Global", {
    type: "void",
    vars: new Map(),
});


let currentFunction = "Global";
let currentType = "";

class DefaultListener extends ParPlusPlusListener {
    
    // Function block
    enterFuncBlock(ctx){
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


}


module.exports = DefaultListener;