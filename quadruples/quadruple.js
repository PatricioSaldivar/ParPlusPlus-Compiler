// Declare an object for the quadruple.
// Create a Quadruple.
class Quadruple {
    // operator;
    // iDirOne;      // Ptr to First Operand.
    // iDirTwo;      // Ptr to Second Operand.
    // iDirThree;    // Ptr to Response. 
    // bGoTo;
    constructor (operator, iDirOne, iDirTwo, iDirThree, bGoTo) {
        this.operator = operator;
        this.iDirOne = iDirOne;
        this.iDirTwo = iDirTwo;
        this.iDirThree = iDirThree;
        this.bGoTo = bGoTo;
    }
}