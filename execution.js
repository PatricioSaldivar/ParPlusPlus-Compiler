
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
var localMemoryLimit = 100;

executionCtr.startExecution = function(functionTable, constantTable, listQuadruples) {
    globalListQuadruples = listQuadruples;
    this.initGlobalMemory(functionTable, constantTable);
    
    this.initQuadrupleExecution()
    console.log('=============== list quadruples   ==================');
    console.log(globalListQuadruples);

    console.log('=============== function table    ==================');
    console.log(functionTable);

    console.log('=============== constant table    ==================');
    console.log(constantTable);

    console.log('=============== GLOBAL TABLE  =============== ');
    console.log(executionCtr.globalMap);

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
    
    //console.log('————————— FUNCTION TABLE  ————————— ');
    //console.log(functionTable);
    //console.log('');
    //console.log('————————— GLOBAL TABLE  ————————— ');
    //console.log(executionCtr.globalMap);
    //console.log('————————— Debe de ser 2  ————————— ');
    //console.log(1 + parseInt(executionCtr.globalMap.get(9000)));
    
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
    if(type == "INT"){
        executionCtr.globalMap.set(dir,parseInt(executionCtr.globalMap.get(dir)));
    }else if (type == "FLOAT"){
        executionCtr.globalMap.set(dir,parseFloat(executionCtr.globalMap.get(dir)));
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
        local.vars.has(quadruple.iDirThree) ? 
                local.vars.set(quadruplength.iDirThree, 
                    operator(
                        (
                            local.vars.has(quadruple.iDirOne) ? local.vars.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
                        )
                        // Operator
                            ,
                        (
                            local.vars.has(quadruple.iDirTwo) ? local.vars.get(quadruple.iDirTwo) : executionCtr.globalMap.get(quadruple.iDirTwo)
                        ) 
                    )
                ) 
            : 
                executionCtr.globalMap.set(quadruple.iDirThree, 
                    operator(
                        (
                            local.vars.has(quadruple.iDirOne) ? local.vars.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
                        )
                        // Operator
                        ,
                        (
                            local.vars.has(quadruple.iDirTwo) ? local.vars.get(quadruple.iDirTwo) : executionCtr.globalMap.get(quadruple.iDirTwo)
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
        local.vars.has(quadruple.iDirThree) ? 
                local.vars.set(quadruplength.iDirThree, 
                    operator(
                        (
                            local.vars.has(quadruple.iDirOne) ? local.vars.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
                        )
                    )
                ) 
            : 
                executionCtr.globalMap.set(quadruple.iDirThree, 
                    operator(
                        (
                            local.vars.has(quadruple.iDirOne) ? local.vars.get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne)
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

// Procesar los cuádruplos
executionCtr.processQuadruple = function(quadruple) {
    // OPERATOR +
    if(quadruple.operator == '+')
    {
        console.log('ENTERED PLUS');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a + b; })
        this.nextProcess();
    }
    else if (quadruple.operator == '-') 
    {
        console.log('ENTERED MINUS');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a - b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '*') 
    {
        console.log('ENTERED MULTIPLICATION');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a * b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '/') 
    {
        console.log('ENTERED DIVISION');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a / b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '%') 
    {
        console.log('ENTERED MODULO');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a % b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '==') 
    {
        console.log('ENTERED ==');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a == b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '>=') 
    {
        console.log('ENTERED >=');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a >= b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '<=') 
    {
        console.log('ENTERED <=');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a <= b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '!=') 
    {
        console.log('ENTERED !=');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a != b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '!') 
    {
        console.log('ENTERED !');
        executionCtr.operationOneOperand(quadruple , function(a) { return (a < 1) ? 1 : 0; })
        this.nextProcess();
    }
    else if (quadruple.operator == '||') 
    {
        console.log('ENTERED OR');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a || b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '&&') 
    {
        console.log('ENTERED AND');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a && b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '>') 
    {
        console.log('ENTERED Greater Than');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a > b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '<') 
    {
        console.log('ENTERED Less Than');
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a < b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '=') 
    {
        // Diferent
        executionCtr.operationOneOperand(quadruple , function(a) { return a; })
        console.log("EQUAL OPERATION");
        console.log(`Made ${quadruple.iDirThree} equal to ${quadruple.iDirOne}`);
        console.log(`${quadruple.iDirOne} = ${executionCtr.globalMap.get(quadruple.iDirOne)}`)
        console.log(`${quadruple.iDirThree} = ${executionCtr.globalMap.get(quadruple.iDirThree)}`)


        this.nextProcess();
    }
    // Other Quadruple Operators
    else if (quadruple.operator == 'ENDFUNC') 
    {
        console.log('Enter End Function' );
    }
    else if (quadruple.operator == 'RETURN') 
    {
        console.log('Enter Return' );
    }
    else if (quadruple.operator == 'ERA') 
    {
        console.log('Enter Era' );
    }
    else if (quadruple.operator == 'GOSUB') 
    {
        console.log('Enter Go Sub' );
    }
    else if (quadruple.operator == 'PARAMETER') 
    {
        console.log('Enter Parameter' );
    }
    else if (quadruple.operator == 'GOTOF') 
    {
        console.log('Enter Go To False' );

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
        console.log('Enter Go To' );
        currentQuadrupleIndex = quadruple.iDirThree - 1;
        this.nextProcess();
    }

}

    // Hacer un stack y sobre esa stack agregar un mapa de cada función.

    
    /*
    + 1  4  7001
    {
        0        
        1        0
        2
        3
        4
        1000    : 0.0
        1001    : 0.0
        2000    : ''
        7001    : 0
        7002    : 0
        7003    : 0
    }

[GlobaleMemory]
inMain = false;


currentMemory = init Local(function);
currentMemory = [GlobalMemory].peek()
[GlobalMemory] = [];


    dos
    {
        3000: 0
    }

    */



// Verificar si es un int o un float para guardar decimales

// Hacer un for each de cada Cuádruplo.


// If para ver el operador del cuádruplo.

// ERA  localMemory.push( mapa de funcion   )


module.exports = executionCtr;