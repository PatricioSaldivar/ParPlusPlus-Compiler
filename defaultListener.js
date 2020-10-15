const {ParPlusPlusListener} = require('./antlr4AutoGen/ParPlusPlusListener');

let functionTable = new Map();
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

        //Single variable
        if(ctx.varDimensionsInit != undefined){
            functionTable.get(currentFunction).vars.set(ctx.ID().getText(), {
                type: currentType,
                value: undefined,
            } );
        }
        // List or Matrix variable
        else{
            functionTable.get(currentFunction).vars.set(ctx.ID().getText(), {
                type: currentType,
                value: undefined,
                // dimensions: un objeto dimensiones para saber si es matriz o arreglo y sus tamanos 
            } );
        }
    }
}


module.exports = DefaultListener;