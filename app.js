// https://tomassetti.me/antlr-mega-tutorial/#htmlchatlistener.js
const http = require('http');
const antlr4 = require('antlr4');
const ParPlusPlusLexer = require('./antlr4AutoGen/ParPlusPlusLexer');
const ParPlusPlusParser = require('./antlr4AutoGen/ParPlusPlusParser');


const ParPlusPlusListener = require('./antlr4AutoGen/ParPlusPlusListener');
// Usar llaves porque se usa exports y no module.exports
const DefaultListener = require('./defaultListener');

var input = "program Ejemplo; var int i, j, p; int arreglo[10]; float valor; int matriz[3][8]; main() {}";
// var input = "main() {}";
var chars = new antlr4.InputStream(input);
var lexer = new ParPlusPlusLexer.ParPlusPlusLexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);
var parser = new ParPlusPlusParser.ParPlusPlusParser(tokens);
parser.buildParseTrees = true;   
// Poner llamar la primer regla
var tree = parser.program();
var ParPlusListener = new DefaultListener();
antlr4.tree.ParseTreeWalker.DEFAULT.walk(ParPlusListener, tree);