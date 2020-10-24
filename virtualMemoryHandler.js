let memoryCtr = {};

const globalIntStartDir = 0;
const globalFloatStartDir = 1000;
const globalCharStartDir = 2000;

const localIntStartDir = 3000;
const localFloatStartDir = 4000;
const localCharStartDir = 5000;


// Temporal Memory. (no separar por tipos)
const temporalMemory = 7000;

// Constant Memory. (no separar por tipos)
const constMemory = 9000;



const endMemory = 6000;


// Initialize the global virtual memory. Separate by data types.
memoryCtr.iGlobalIntCount = globalIntStartDir;      
memoryCtr.iGlobalFloatCount = globalFloatStartDir;    
memoryCtr.iGlobalCharCount = globalCharStartDir;

// Create a local memory and reset it after function execution. Separate by data types.
memoryCtr.iLocalIntCount = localIntStartDir;      
memoryCtr.iLocalFloatCount = localFloatStartDir;    
memoryCtr.iLocalCharCount = localCharStartDir;

// Create temproal memory
memoryCtr.iTemporalCount = temporalMemory;

// Create constant memory
memoryCtr.iConstantCount = constMemory;


// Faltan metodos de push y pop

// t1 t2 t3 t4
// + 2 3 T1
// + 1 T1 T2

// Reset the Local Memory.
memoryCtr.deleteLocalMemory = function() {
    memoryCtr.iLocalIntCount = localIntStartDir;      
    memoryCtr.iLocalFloatCount = localFloatStartDir;    
    memoryCtr.iLocalCharCount = localCharStartDir;
}

// =============== GLOBAL Handler ===========================
// Add a new Global Int memory slot.
memoryCtr.addGlobalIntMemorySlot = function() {
    if(memoryCtr.iGlobalIntCount >= globalIntStartDir){
        memoryCtr.iGlobalIntCount += 1;
        if(memoryCtr.iGlobalIntCount > globalFloatStartDir){   
            memoryCtr.iGlobalIntCount = -1;
        }
    }   
}

// Add a new Global Float memory slot.
memoryCtr.addGlobalFloatMemorySlot = function() {
    if(memoryCtr.iGlobalFloatCount >= globalFloatStartDir){
        memoryCtr.iGlobalFloatCount += 1;
        if(memoryCtr.iGlobalFloatCount > globalCharStartDir){   
            memoryCtr.iGlobalFloatCount = -1;
        }
    }     
}

// Add a new Global Char memory slot.
memoryCtr.addGlobalCharMemorySlot = function() {
    if(memoryCtr.iGlobalCharCount >= globalCharStartDir){
        memoryCtr.iGlobalCharCount += 1;
        if(memoryCtr.iGlobalCharCount > localIntStartDir){   
            memoryCtr.iGlobalCharCount = -1;
        }
    }      
}

// =============== End Handler ===========================


// =============== LOCAL Handler ===========================
// Add a new Local Int memory slot.
memoryCtr.addLocalIntMemorySlot = function() {
    if(memoryCtr.iLocalIntCount >= localIntStartDir ){
        memoryCtr.iLocalIntCount += 1;
        if(memoryCtr.iLocalIntCount > localFloatStartDir){   
            memoryCtr.iLocalIntCount = -1;
        }
    } 
}

// Add a new Local Float memory slot.
memoryCtr.addLocalFloatMemorySlot = function() {
    if(memoryCtr.iLocalFloatCount >= localFloatStartDir){
        memoryCtr.iLocalFloatCount += 1;
        if(memoryCtr.iLocalFloatCount > localCharStartDir){   
            memoryCtr.iLocalFloatCount = -1;
        }
    }      
}

// Add a new Local Char memory slot.
memoryCtr.addLocalCharMemorySlot = function() {
    if(memoryCtr.iLocalCharCount >= localCharStartDir){
        memoryCtr.iLocalCharCount += 1;
        if(memoryCtr.iLocalCharCount > endMemory){   
            memoryCtr.iLocalCharCount = -1;
        }
    }    
}

// =============== END Handler ===========================

// =============== Assign Handler ===========================

memoryCtr.setMemoryDirection = function(type, currentF) {
    let iDir = -1;
    switch (type)
    {
        case 'int' : {
            if (currentFunction == "Global") {
                iDir = memoryCtr.iGlobalIntCount;
                memoryCtr.addGlobalIntMemorySlot();
                return iDir;
            }
            else {
                iDir = memoryCtr.iLocalIntCount;
                memoryCtr.addLocalCharMemorySlot();
                return iDir;
            }
        }
        case 'float' : {
            if (currentFunction == "Global") {
                iDir = memoryCtr.iGlobalFloatCount;
                memoryCtr.addGlobalFloatMemorySlot();
                return iDir;
            } 
            else {
                iDir = memoryCtr.iLocalFloatCount;
                memoryCtr.addLocalFloatMemorySlot();
                return iDir;
            }
        }
        case 'char' : {
            if (currentFunction == "Global") {
                iDir = memoryCtr.iGlobalCharCount;
                memoryCtr.addGlobalCharMemorySlot();
                return iDir;
            }
            else {
                iDir = memoryCtr.addLocalCharMemorySlot;
                memoryCtr.addLocalCharMemorySlot();
                return iDir;
            }
        }
    }
}

memoryCtr.setDirection = function(type, currentScope){
    let dir = -1;
    if(type === "int"){
        if(currentScope === "Global"){
            dir = memoryCtr.iGlobalIntCount;
            memoryCtr.addGlobalIntMemorySlot();
            return dir;
        }else{
            dir = memoryCtr.iLocalIntCount;
            memoryCtr.addLocalIntMemorySlot();
            return dir;
        }
    }else if(type === "char"){
        if(currentScope === "Global"){
            dir = memoryCtr.iGlobalCharCount;
            memoryCtr.addGlobalCharMemorySlot();
            return dir;
        }else{
            dir = memoryCtr.iLocalCharCount;
            memoryCtr.addLocalCharMemorySlot();
            return dir;
        }

    }else{
        if(currentScope === "Global"){
            dir = memoryCtr.iGlobalFloatCount;
            memoryCtr.addGlobalFloatMemorySlot();
            return dir;
        }else{
            dir = memoryCtr.iLocalFloatCount;
            memoryCtr.addLocalFloatMemorySlot();
            return dir;
        }

    }
}



module.exports = {
    memoryCtr: memoryCtr
};