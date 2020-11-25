
// TODO: Verify that a type cant change from one type to another.
const {ParPlusPlusListener} = require('./antlr4AutoGen/ParPlusPlusListener');
const virtualMemoryHandler = require('./virtualMemoryHandler');
const { memoryCtr } = require('./virtualMemoryHandler');
const Quadruple = require('./quadruples/quadruple');
const quadruplerHandler = require('./quadruples/quadrupleHandler');
const semanticCube = require('./semantics/semanticCube');
const semanticCubeHandler = require('./semantics/semanticCubeHandler');
var Stack = require('stackjs');
const prompt = require('prompt-sync')({sigint: true});

const DefaultListener = require('./defaultListener');

let executionCtr = {};
let currentQuadrupleIndex = 0;
let globalListQuadruples; 

// Tener un Stack que tenga memoria local
var localMemory = new Stack();
var jumps = new Stack();
var output = "";
var prepareLocal = new Stack();

// Funcion que comienza la memoria virtual y corre los cuadruplos.
executionCtr.startExecution = function(functionTable, constantTable, listQuadruples) {
    // Se inicializan las estructuras de datos y lista de cuadruplos.
    globalListQuadruples = listQuadruples;
    this.initGlobalMemory(functionTable, constantTable);
    this.initLocalMemorys(functionTable);
    // Comienzan a correr los cuadruplos.
    this.initQuadrupleExecution()
  /* 
    console.log('=============== list quadruples   ==================');
    console.log(globalListQuadruples);

    console.log('=============== constant table    ==================');
    console.log(constantTable);

    console.log('=============== function table    ==================');
    console.log(functionTable);

    console.log('=============== locals table    ==================');
    console.log(executionCtr.localFunctionMap);


  
    console.log('=============== GLOBAL TABLE  =============== ');
    console.log(executionCtr.globalMap);
 */

}

executionCtr.initLocalMemorys = function(functionTable){
    executionCtr.localFunctionMap = new Map();
     functionTable.forEach((value, key, map) => {
         if(key != "Global"){
             let localValue = value.temps;
             value.vars.forEach((key,value,map) =>{
                if(key.start){
                    for(let i = key.start; key.dims >1 ? i< key.start + key.max1 * key.max2 :  i< key.start + key.max1 ; i++){
                        localValue.set(i, this.getDefaultValue(i));
                    }
                }else{
                    localValue.set(key,this.getDefaultValue(key));
                }
                 
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
        if(value != null && value.start > -1){
            for(let i = value.start; value.dims >1 ? i< value.start + value.max1 * value.max2 : i < value.start + value.max1 ; i++){
                executionCtr.globalMap.set(i, this.getDefaultValue(i));
            }
        }else{
            executionCtr.globalMap.set(value, this.getDefaultValue(value));
        }
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
// Funcion que corre todos los cuadruplos para el programa.
executionCtr.initQuadrupleExecution = function() {
        while(currentQuadrupleIndex < globalListQuadruples.length)
        {
        this.processQuadruple(globalListQuadruples[currentQuadrupleIndex]);
        }
}

// Funcion que parsea un valor de una direccion al valor correspondiente.
executionCtr.parseToType = function(dir){
    if(dir != null && dir.sum){
        let value = (!localMemory.isEmpty() && localMemory.peek().has(dir.sum ))? localMemory.peek().get(dir.sum ) : executionCtr.globalMap.get(dir.sum );
        dir = dir.start + value;
    }

    let type = memoryCtr.getType(dir);
    if(!localMemory.isEmpty() && localMemory.peek().has(dir)){
        if(type == "INT"){
            localMemory.peek().set(dir,parseInt(localMemory.peek().get(dir)));
        }else if (type == "FLOAT"){
            localMemory.peek().set(dir,parseFloat(localMemory.peek().get(dir)));
        }
    }else if(!prepareLocal.isEmpty()  && prepareLocal.peek().has(dir)){
        if(type == "INT"){
            prepareLocal.peek().set(dir,parseInt(prepareLocal.peek().get(dir)));
        }else if (type == "FLOAT"){
            prepareLocal.peek().set(dir,parseFloat(prepareLocal.peek().get(dir)));
        }
    }else{
        if(type == "INT"){
            executionCtr.globalMap.set(dir,parseInt(executionCtr.globalMap.get(dir)));
        }else if (type == "FLOAT"){
            executionCtr.globalMap.set(dir,parseFloat(executionCtr.globalMap.get(dir)));
        }
    }

}

// funcion que corre cuando se evalua un a operacion con dos direcciones y dan resultado a la tercera.
executionCtr.operationTwoOperands = function(quadruple,operator) {
    
    // Se verifican los valores de las direcciones en dado caso de que sean dimensionadas se accesa a su memoriapara realizar las operaciones.
    let value = quadruple.iDirThree;
    let value1 = quadruple.iDirOne;
    let value2 = quadruple.iDirTwo;

    if(quadruple.iDirThree != null && quadruple.iDirThree.sum){
        value = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirThree.sum ))? localMemory.peek().get(quadruple.iDirThree.sum ) : executionCtr.globalMap.get(quadruple.iDirThree.sum );
        value = quadruple.iDirThree.start + value;
    }
    if(quadruple.iDirOne != null && quadruple.iDirOne.sum){
        value1 = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne.sum ))? localMemory.peek().get(quadruple.iDirOne.sum ) : executionCtr.globalMap.get(quadruple.iDirOne.sum );
        value1 = quadruple.iDirOne.start + value1;
    }
    if(quadruple.iDirTwo != null && quadruple.iDirTwo.sum){
        value2 = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirTwo.sum ))? localMemory.peek().get(quadruple.iDirTwo.sum ) : executionCtr.globalMap.get(quadruple.iDirTwo.sum );
        value2 = quadruple.iDirTwo.start + value2;
    }
    // Verificamos el alcanze para saber si existe un alcanze global o se hara la operacion en el alcanze global.
    if(localMemory.isEmpty()){
        // Solo global
            executionCtr.globalMap.set(value , 
                ( 
                    operator(
                        executionCtr.globalMap.get(value1), executionCtr.globalMap.get(value2) 
                    ) 
                ) 
            );
    }
    else
    {
        let local = localMemory.peek();
        localMemory.pop();
            local.has(value) ? 
            local.set(value , 
                operator(
                    (
                        local.has(value1) ? local.get(value1) : executionCtr.globalMap.get(value1)
                    )
                    // Operator
                        ,
                    (
                        local.has(value2) ? local.get(value2) : executionCtr.globalMap.get(value2)
                    ) 
                )
            ) 
        : 
            executionCtr.globalMap.set(value , 
                operator(
                    (
                        local.has(value1) ? local.get(value1) : executionCtr.globalMap.get(value1)
                    )
                    // Operator
                    ,
                    (
                        local.has(value2) ? local.get(value2) : executionCtr.globalMap.get(value2)
                    )
                )
            );

        localMemory.push(local);
        //Agarramos en Local y si no esta checamos en global
    } 
    // Se transfroma en valor a su tipo correspondiente.
    this.parseToType(quadruple.iDirThree);
}

// Funcion que corre cuando se evalua un a operacion una direcion y da resultado a otra.
executionCtr.operationOneOperand = function(quadruple, operator) {
    // Se verifican los valores de las direcciones en dado caso de que sean dimensionadas se accesa a su memoriapara realizar las operaciones.
        let value = quadruple.iDirThree;
        let value1 = quadruple.iDirOne;
        if(quadruple.iDirThree != null && quadruple.iDirThree.sum){
            value = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirThree.sum ))? localMemory.peek().get(quadruple.iDirThree.sum ) : executionCtr.globalMap.get(quadruple.iDirThree.sum );
            value = quadruple.iDirThree.start + value;
        }
        if(quadruple.iDirOne != null && quadruple.iDirOne.sum){
            value1 = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne.sum ))? localMemory.peek().get(quadruple.iDirOne.sum ) : executionCtr.globalMap.get(quadruple.iDirOne.sum );
            value1 = quadruple.iDirOne.start + value1;
        }
    if(value != null){
        // Verificamos el alcanze para saber si se hara en un alcanze global o local.
        if(localMemory.isEmpty()){
            // Solo global
                executionCtr.globalMap.set(value , 
                    ( 
                        operator(
                            executionCtr.globalMap.get(value1)
                        )  
                    )  
                );
        }
        else
        {
            let local = localMemory.peek();
            localMemory.pop();
                local.has(value) ? 
                local.set(value , 
                    operator(
                        (
                            local.has(value1) ? local.get(value1) : executionCtr.globalMap.get(value1)
                        )
                    )
                ) 
            :   //Agarramos en Local y si no esta checamos en global
                executionCtr.globalMap.set(value , 
                    operator(
                        (
                            local.has(value1) ? local.get(value1) : executionCtr.globalMap.get(value1)
                        )
                    )
                );
 
            localMemory.push(local);

        } 
        this.parseToType(quadruple.iDirThree);
    }
}
// Se hace la operacion de verificacion para ver si el acceso a un arreglo o matriz es correcto
executionCtr.verify = function(quadruple){
    let value = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne))? localMemory.peek().get(quadruple.iDirOne) : executionCtr.globalMap.get(quadruple.iDirOne);
    if(value < quadruple.iDirTwo || value >= quadruple.iDirThree ){
        throw Error("Index out of range");
    }
}
// Se transforma un valor dependiendo del tipo.
executionCtr.parseValue = function(data,type){
    if( type == 'INT'){
        return parseInt(data);

    }else if (type == 'FLOAT'){
        return parseFloat(data);
    }else{
        return data[0];
    }
}

// Funcion para avanzar al siguiente cuadruplo.
executionCtr.nextProcess = function(){
    currentQuadrupleIndex++;  
}

// funcion para inicialiar algun parametro de una funcion.
executionCtr.initParam = function(quadruple, operator) {
    let value = quadruple.iDirThree;
    let value1 = quadruple.iDirOne;
    if(quadruple.iDirThree != null && quadruple.iDirThree.sum){
    value = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirThree.sum ))? localMemory.peek().get(quadruple.iDirThree.sum ) : executionCtr.globalMap.get(quadruple.iDirThree.sum );
    value = quadruple.iDirThree.start + value;
    }
    if(quadruple.iDirOne != null && quadruple.iDirOne.sum){
        value1 = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne.sum ))? localMemory.peek().get(quadruple.iDirOne.sum ) : executionCtr.globalMap.get(quadruple.iDirOne.sum );
        value1 = quadruple.iDirOne.start + value1;
    } 
        prepareLocal.peek().set(value , 
            operator(
                (
                    (!localMemory.isEmpty() && localMemory.peek().has(value1)) ? localMemory.peek().get(value1) : executionCtr.globalMap.get(value1)
                )
            )
        );
        this.parseToType(quadruple.iDirThree);

          

}

// Procesar los cuádruplos
executionCtr.processQuadruple = function(quadruple) {
    if(quadruple.operator == '+')
    {
        // Se ejecuta la operacion de suma
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a + b; })
        this.nextProcess();
    }
    else if (quadruple.operator == '-') 
    {
        // Se ejecuta la operacion de resta
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a - b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '*') 
    {
        // Se ejecuta la operacion de multiplicacion
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a * b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '/') 
    {
        // Se ejecuta la operacion de division
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a / b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '%') 
    {
        // Se ejecuta la operacion de modulo
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a % b; });
        this.nextProcess();
    }
    else if (quadruple.operator == '==') 
    {
        // Se ejecuta la operacion de igualdad
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a == b ? 1 : 0;; });
        this.nextProcess();
    }
    else if (quadruple.operator == '>=') 
    {
        // Se ejecuta la operacion de mayor igual
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a >= b ? 1 : 0;; });
        this.nextProcess();
    }
    else if (quadruple.operator == '<=') 
    {
        // Se ejecuta la operacion de menor igual
        
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a <= b ? 1 : 0;; });
       
        this.nextProcess();
    }
    else if (quadruple.operator == '!=') 
    {
        // Se ejecuta la operacion de difernte
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a != b ? 1 : 0;; });
        this.nextProcess();
    }
    else if (quadruple.operator == '!') 
    {
        // Se ejecuta la operacion de negacion
        executionCtr.operationOneOperand(quadruple , function(a) { return (a < 1) ? 1 : 0; })
        this.nextProcess();
    }
    else if (quadruple.operator == '||') 
    {
        // Se ejecuta la operacion de OR
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a || b ? 1 : 0; });
        this.nextProcess();
    }
    else if (quadruple.operator == '&&') 
    {
        // Se ejecuta la operacion de AND
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a && b ? 1 : 0; });
        this.nextProcess();
    }
    else if (quadruple.operator == '>') 
    {
        // Se ejecuta la operacion de mayor
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a > b ? 1 : 0; });
        this.nextProcess();
    }
    else if (quadruple.operator == '<') 
    {
        // Se ejecuta la operacion de menor
        executionCtr.operationTwoOperands(quadruple , function(a, b) { return a < b ? 1 : 0; });
        this.nextProcess();
    }
    else if (quadruple.operator == '=') 
    {
        // Se ejecuta la operacion de asignacion
        executionCtr.operationOneOperand(quadruple , function(a) { return a; })
        this.nextProcess();
    }
    else if (quadruple.operator == 'ENDFUNC') 
    {
        // Se ejecuta la operacion de fin de funcion
        if(!localMemory.isEmpty()){            
            localMemory.pop();
            currentQuadrupleIndex = jumps.peek()
            jumps.pop();
        }
        this.nextProcess();

    }
    else if (quadruple.operator == 'RETURN') 
    {
        // Se ejecuta la operacion de retorno
        executionCtr.operationOneOperand(quadruple , function(a) { return a; });
        this.nextProcess();
    }
    else if (quadruple.operator == 'ERA') 
    {
        //Se ejecuta la operacion de ERA
        prepareLocal.push(new Map(executionCtr.localFunctionMap.get(quadruple.iDirOne)));
        this.nextProcess();
    }
    else if (quadruple.operator == 'GOSUB') 
    {
        // Se ejecuta la operacion de acceder a la subdireccion.
        localMemory.push(prepareLocal.peek());
        prepareLocal.pop();
        jumps.push(currentQuadrupleIndex);
        currentQuadrupleIndex = quadruple.iDirThree - 1;
        this.nextProcess();
        

        
    }
    else if (quadruple.operator == 'PARAMETER') 
    {
        // Se ejecuta la operacion de inicializar un parametro
        executionCtr.initParam(quadruple , function(a) { return a; });
        this.nextProcess();
    }
    else if (quadruple.operator == 'GOTOF') 
    {
        // Se ejecuta la operacion de ir a una direccion en falso.

        //Checamos alcnaze local
        if(!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne) ){

            if(localMemory.peek().get(quadruple.iDirOne) < 1 ){
                currentQuadrupleIndex = quadruple.iDirThree - 1;
            }
        }
        // Alcanze global.
        else {
            if(executionCtr.globalMap.get(quadruple.iDirOne) < 1 ){
                currentQuadrupleIndex = quadruple.iDirThree - 1;
            }
        }
        this.nextProcess();
    }
    else if (quadruple.operator == 'GOTO') 
    {
        // Se ejecuta la operacion de ir a una direccion.
        currentQuadrupleIndex = quadruple.iDirThree - 1;
        this.nextProcess();
    }

    else if (quadruple.operator == 'VERIFY'){
        //Se ejecuta la operacion de verificar
        executionCtr.verify(quadruple);
        this.nextProcess();
    }else if (quadruple.operator == 'WRITE'){
        //Se ejecuta la operacion de esribir.
        let value = 0;
        let text;
        if(quadruple.iDirOne != null && quadruple.iDirOne.sum){
            value = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne.sum ))? localMemory.peek().get(quadruple.iDirOne.sum ) : executionCtr.globalMap.get(quadruple.iDirOne.sum );
            text = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne.start + value))? localMemory.peek().get(quadruple.iDirOne.start + value) : executionCtr.globalMap.get(quadruple.iDirOne.start + value);
        }else{
            text = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne ))? localMemory.peek().get(quadruple.iDirOne ) : executionCtr.globalMap.get(quadruple.iDirOne );
        }

        output = output + text;
        this.nextProcess();
    } else if(quadruple.operator == 'ENDLINE'){
        //Se ejecuta la operacion de impresion en la consola.
        console.log(output);
        output = '';
        this.nextProcess();
    }else if (quadruple.operator == 'READ'){
        //Se ejecuta la operacion de leer un dato.
        let type = memoryCtr.getType(quadruple.iDirOne);
        let data = prompt();
        let result = this.parseValue(data,type);
        if(!result){
            result = this.getDefaultValue(quadruple.iDirOne);
        }
        let value = -1;
        if(quadruple.iDirOne != null && quadruple.iDirOne.sum){
            value = (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne.sum ))? localMemory.peek().get(quadruple.iDirOne.sum ) : executionCtr.globalMap.get(quadruple.iDirOne.sum );
            value = quadruple.iDirOne.start + value;
        }
        if(value > -1){
            (!localMemory.isEmpty() && localMemory.peek().has(value ))? localMemory.peek().set(value,result) : executionCtr.globalMap.set(value, result);

        }else{
            (!localMemory.isEmpty() && localMemory.peek().has(quadruple.iDirOne ))? localMemory.peek().set(quadruple.iDirOne,result) : executionCtr.globalMap.set(quadruple.iDirOne, result);
        }
       ;
        this.nextProcess();
    }else {
        throw new Error('Error: No se encontró el operador del quádruplo.')
    }
}


module.exports = executionCtr;