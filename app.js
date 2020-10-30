// https://tomassetti.me/antlr-mega-tutorial/#htmlchatlistener.js
const antlr4 = require('antlr4/index');
const ParPlusPlusLexer = require('./antlr4AutoGen/ParPlusPlusLexer');
const ParPlusPlusParser = require('./antlr4AutoGen/ParPlusPlusParser');
const fs = require('fs');


// Usar llaves porque se usa exports y no module.exports
const DefaultListener = require('./defaultListener');

// var input = 'program Ejemplo; var int i, j, p; int arreglo[10]; float valor; int matriz[3][8]; main() { 1+2-3-4.0; \"hola\" + 'a'; i + 1; }';
var input = `program Ejemplo; var int i, j, p, myLoop; int arreglo[10]; float f, fl; char c; int matriz[3][8]; main() { 1+2-3-4.0; "hola" + "a"; 1 + 2 - (4-1);  i + j; if (1 >= 2)  then { i * 5; 2+2;}  4-4;  while (myLoop > 5) { myLoop = myLoop + 1;} }`;
var inputFile = '';
fs.readFile('./input/input.txt', 'utf8', function(err, data) {
    if (err) {
        // throw new Error(err);
    }
    inputFile = data;
    var chars = new antlr4.InputStream(input);
    var lexer = new ParPlusPlusLexer.ParPlusPlusLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new ParPlusPlusParser.ParPlusPlusParser(tokens);
    parser.buildParseTrees = true;   

    // Poner llamar la primer regla
    var tree = parser.program();
    var ParPlusListener = new DefaultListener();
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(ParPlusListener, tree);
})
// console.log('———————————————————————————————');
// console.log('input data');
// console.log(inputFile);
