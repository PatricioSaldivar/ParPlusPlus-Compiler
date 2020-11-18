
// TODO: Verify that a type cant change from one type to another.
const {ParPlusPlusListener} = require('./antlr4AutoGen/ParPlusPlusListener');
const virtualMemoryHandler = require('./virtualMemoryHandler');
const { memoryCtr } = require('./virtualMemoryHandler');
const Quadruple = require('./quadruples/quadruple');
const quadruplerHandler = require('./quadruples/quadrupleHandler');
const semanticCube = require('./semantics/semanticCube');
const semanticCubeHandler = require('./semantics/semanticCubeHandler');
var Stack = require('stackjs');

const DefaultListener = require('./defaultListener');

let executionCtr = {};
let currentQuadrupleIndex = 0;
let globalListQuadruples; 

// Tener un Stack que tenga memoria local
var localMemory = new Stack();
var jumps = new Stack();

executionCtr.startExecution = function(functionTable, constantTable, listQuadruples) {
    globalListQuadruples = listQuadruples;
    this.initGlobalMemory(functionTable, constantTable);
    this.initLocalMemorys(functionTable);
    this.initQuadrupleExecution()
/*
    console.log('=============== list quadruples   ==================');
    console.log(globalListQuadruples);

    console.log('=============== function table    ==================');
    console.log(functionTable);

    console.log('=============== locals table    ==================');
    console.log(localMemory);

    console.log('=============== constant table    ==================');
    console.log(constantTable);
*/

console.log('=============== GLOBAL TABLE  =============== ');
console.log(executionCtr.globalMap);


}

executionCtr.initLocalMemorys = function(functionTable){
    executionCtr.localFunctionMap = new Map();
     functionTable.forEach((value, key, map) => {
         if(key != "Global"){
             let localValue = value.temps;
             value.vars.forEach((key,value,map) =>{
                 localValue.set(key,this.getDefaultValue(key));
             });
             executionCtr.localFunctionMap.set(key, localValue);
         }
     });
}


// Esta función va a hacer un mapa para la variable global
executionCtr.initGlobalMemory = function(functionTable, constantTable) {
    //  Hacer un mapa de TODA la memoria, no de cada función
    executionCtr.globalMap = new Map();
    
    // Key es el nombre de la variable |  Value es la dirección de memoria, 
    functionTable.get('Global').vars.forEach( (value, key, map ) => {
        // Ver qué tipo es y asignarla al globalmap
        executionCtr.globalMap.set(value, this.getDefaultValue(value));
    })

    // Asignar las variables temporales
    functionTable.get('Global').temps.forEach( (value, key, map ) => {

        // Ver qué tipo es y asignarla al globalmap

        executionCtr.globalMap.set(key, value);
    })

    // Asignar las variables constantes
    constantTable.forEach( (value, key, map ) => {
        // Ver qué tipo es y asignarla al globalmap

        // Check if the key is a char or number        
            if(key.includes('\'') || key.includes('\"') ) {
                let str = key.slice(1);
                str = str.slice(0, str.length - 1)
                executionCtr.globalMap.set(value, str);
            } 
            else{
                executionCtr.globalMap.set(value, Number(key));
           }
    });
        
}


// This function will return the default value to store in the map (depending on the memory variable type)
executionCtr.getDefaultValue = function(memDir) {
    let type = memoryCtr.getType(memDir);
    if( type == "INT" || type == "FLOAT"){
        return 0;
    }
    // CHAR
    else {
        return '';
    }
}

executionCtr.initQuadrupleExecution = function() {
        this.processQuadruple(globalListQuadruples[0]);
}


executionCtr.parseToType = function(dir){
    let type = memoryCtr.getType(dir);
    if(!localMemory.isEmpty() && localMemory.peek().has(dir)){
        if(type == "INT"){
            localMemory.peek().set(dir,parseInt(executionCtr.globalMap.get(dir)));
        }else if (type == "FLOAT"){
            localMemory.peek().set(dir,parseFloat(executionCtr.globalMap.get(dir)));
        }
    }else{
        if(type == "INT"){
            executionCtr.globalMap.set(dir,parseInt(executionCtr.globalMap.get(dir)));
        }else if (type == "FLOAT"){
            executionCtr.globalMap.set(dir,parseFloat(executionCtr.globalMap.get(dir)));
        }
    }

}


executionCtr.operationTwoOperands = function(quadruple,operator) {
    // If we are not processing a function we are on the global scope
    if(localMemory.isEmpty()){
        // Solo global
        executionCtr.globalMap.set(quadruple.iDirThree, 
            ( 
                operator(
                    executionCtr.globalMap.get(quadruple.iDirOne), executionCtr.globalMap.get(quadruple.iDirTwo) 
                ) 
            ) 
        );
    }
    else
    {
        let local = localMemory.peek();
        localMemory.pop()
        local.has(quadruple.iDirThree) ? 
                local.set(quadruple.iDirThree, 
                    operator(
                        (
                            local.has(quadruple.iDirOne) ? local.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
                        )
                        // Operator
                            ,
                        (
                            local.has(quadruple.iDirTwo) ? local.get(quadruple.iDirTwo) : executionCtr.globalMap.get(quadruple.iDirTwo)
                        ) 
                    )
                ) 
            : 
                executionCtr.globalMap.set(quadruple.iDirThree, 
                    operator(
                        (
                            local.has(quadruple.iDirOne) ? local.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
                        )
                        // Operator
                        ,
                        (
                            local.has(quadruple.iDirTwo) ? local.get(quadruple.iDirTwo) : executionCtr.globalMap.get(quadruple.iDirTwo)
                        )
                    )
                );
        localMemory.push(local);
        //Agarramos en Local y si no esta checamos en global
    } 
    this.parseToType(quadruple.iDirThree);
}

executionCtr.operationOneOperand = function(quadruple, operator) {
    // If we are not processing a function we are on the global scope
    if(localMemory.isEmpty()){
        // Solo global
        executionCtr.globalMap.set(quadruple.iDirThree, 
            ( 
                operator(
                    executionCtr.globalMap.get(quadruple.iDirOne)
                )  
            )  
        );
    }
    else
    {
        let local = localMemory.peek();
        localMemory.pop()
        local.has(quadruple.iDirThree) ? 
                local.set(quadruple.iDirThree, 
                    operator(
                        (
                            local.has(quadruple.iDirOne) ? local.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
                        )
                    )
                ) 
            : 
                executionCtr.globalMap.set(quadruple.iDirThree, 
                    operator(
                        (
                            local.has(quadruple.iDirOne) ? local.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
                        )
                    )
                );
        localMemory.push(local);
        //Agarramos en Local y si no esta checamos en global
    } 
    this.parseToType(quadruple.iDirThree);
}

executionCtr.nextProcess = function(){
    currentQuadrupleIndex++;
    if (currentQuadrupleIndex >= globalListQuadruples.length)
    {
        return;
    }
    executionCtr.processQuadruple(globalListQuadruples[currentQuadrupleIndex]);   
}

executionCtr.createLocalMemory = function(funcName){
    DefaultListener.functionTable
}

// Procesar los cuádruplos
executionCtr.processQuadruple = function(quadruple) {
    // OPERATOR +
    if(quadruple.operator == '+')
    {
        // console.log('ENTERED PLUS');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a + b; })
        this.nextProcess();
    }
    else if (quadruple.operator == '-') 
    {
        // console.log('ENTERED MINUS');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a - b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '*') 
    {
        // console.log('ENTERED MULTIPLICATION');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a * b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '/') 
    {
        // console.log('ENTERED DIVISION');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a / b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '%') 
    {
        // console.log('ENTERED MODULO');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a % b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '==') 
    {
        // console.log('ENTERED ==');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a == b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '>=') 
    {
        // console.log('ENTERED >=');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a >= b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '<=') 
    {
        // console.log('ENTERED <=');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a <= b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '!=') 
    {
        // console.log('ENTERED !=');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a != b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '!') 
    {
        // console.log('ENTERED !');
        executionCtr.operationOneOperand(quadruple , function(a) { return (a < 1) ? 1 : 0; })
        this.nextProcess();
    }
    else if (quadruple.operator == '||') 
    {
        // console.log('ENTERED OR');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a || b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '&&') 
    {
        // console.log('ENTERED AND');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a && b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '>') 
    {
        // console.log('ENTERED Greater Than');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a > b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '<') 
    {
        // console.log('ENTERED Less Than');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a < b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '=') 
    {
        // Diferent
        executionCtr.operationOneOperand(quadruple , function(a) { return a; })
        // console.log("EQUAL OPERATION");
        this.nextProcess();
    }
    // Other Quadruple Operators
    else if (quadruple.operator == 'ENDFUNC') 
    {
        // console.log('Enter End Function' );
        localMemory.pop();
        currentQuadrupleIndex = jumps.peek()
        this.nextProcess();
    }
    else if (quadruple.operator == 'RETURN') 
    {
        // console.log('Enter Return' );
        executionCtr.operationOneOperand(quadruple , function(a) { return a; });
        this.nextProcess();
    }
    else if (quadruple.operator == 'ERA') 
    {
        localMemory.push(new Map(executionCtr.localFunctionMap.get(quadruple.iDirOne)));
        // console.log('Enter Era' );
        this.nextProcess();
    }
    else if (quadruple.operator == 'GOSUB') 
    {
        // console.log('Enter Go Sub' );
        jumps.push(currentQuadrupleIndex);
        currentQuadrupleIndex = quadruple.iDirThree - 1;
        this.nextProcess();
    }
    else if (quadruple.operator == 'PARAMETER') 
    {
        // console.log('Enter Parameter' );
        executionCtr.operationOneOperand(quadruple , function(a) { return a; });
        this.nextProcess();
    }
    else if (quadruple.operator == 'GOTOF') 
    {
        // console.log('Enter Go To False' );

        // Check if var is in the local memory first
        if(!localMemory.isEmpty() && localMemory.peek().vars.has(quadruple.iDirOne) ){
            // If the condition is false then do the GOTO.
            if(localMemory.peek().vars.get(quadruple.iDirOne) < 1 ){
                currentQuadrupleIndex = quadruple.iDirThree - 1;
            }
        }
        // Global Var.
        else {
            if(executionCtr.globalMap.get(quadruple.iDirOne) < 1 ){
                currentQuadrupleIndex = quadruple.iDirThree - 1;
            }
        }
        this.nextProcess();
    }
    else if (quadruple.operator == 'GOTO') 
    {
        // console.log('Enter Go To' );
        currentQuadrupleIndex = quadruple.iDirThree - 1;
        this.nextProcess();
    }
    else {
        throw new Error('Error: No se encontró el operador del quádruplo.')
    }

}


module.exports = executionCtr;