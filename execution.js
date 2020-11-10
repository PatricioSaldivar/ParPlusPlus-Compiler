
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



// Tener un Stack que tenga memoria local
var localMemory = new Stack();
var localMemoryLimit = 100;

executionCtr.startExecution = function(functionTable, constantTable, listQuadruples) {
    this.initGlobalMemory(functionTable);
    this.initQuadrupleExecution(listQuadruples)
}

// Esta función va a hacer un mapa para la variable global
executionCtr.initGlobalMemory = function(functionTable) {
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

    // console.log('————————— FUNCTION TABLE  ————————— ');
    // console.log(functionTable);
    // console.log('');
    // console.log('————————— GLOBAL TABLE  ————————— ');
    // console.log(executionCtr.globalMap);
}


// This function will return the default value to store in the map (depending on the memory variable type)
executionCtr.getDefaultValue = function(memDir) {
    if(memoryCtr.getType(memDir) == "INT"){
        return 0;
    }
    else if(memoryCtr.getType(memDir) == "FLOAT") {
        return 10;
    }
    // CHAR
    else {
        return '';
    }
}

executionCtr.initQuadrupleExecution = function(listQuadruples) {
    listQuadruples.forEach( (quadruple) => {

        this.processQuadruple(quadruple);

    })
}

// Procesar los cuádruplos
executionCtr.processQuadruple = function(quadruple) {
    if(quadruple.operator == '+')
    {
        console.log('ENTERED PLUS');
    }
    else if (quadruple.operator == '-') 
    {
        console.log('ENTERED MINUS');
    }
    else if (quadruple.operator == '*') 
    {
        console.log('ENTERED MULTIPLICATION');
    }
    else if (quadruple.operator == '/') 
    {
        console.log('ENTERED DIVISION');
    }
    else if (quadruple.operator == '%') 
    {
        console.log('ENTERED MODULO');
    }
    else if (quadruple.operator == '==') 
    {
        console.log('ENTERED ==');
    }
    else if (quadruple.operator == '>=') 
    {
        console.log('ENTERED >=');
    }
    else if (quadruple.operator == '<=') 
    {
        console.log('ENTERED <=');
    }
    else if (quadruple.operator == '!=') 
    {
        console.log('ENTERED !=');
    }
    else if (quadruple.operator == '!') 
    {
        console.log('ENTERED !');
    }
    else if (quadruple.operator == '||') 
    {
        console.log('ENTERED OR');
    }
    else if (quadruple.operator == '&&') 
    {
        console.log('ENTERED AND');
    }
    else if (quadruple.operator == '>') 
    {
        console.log('ENTERED Greater Than');
    }
    else if (quadruple.operator == '<') 
    {
        console.log('ENTERED Less Than');
    }
    else if (quadruple.operator == '=') 
    {
        console.log('ENTERED =');
    }
    // Other Quadruple Operators
    else if (quadruple.operator == 'FuGOTO') 
    {
        console.log('Enter Function Go To');
    }
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
    }
    else if (quadruple.operator == 'GOTO') 
    {
        console.log('Enter Go To' );
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