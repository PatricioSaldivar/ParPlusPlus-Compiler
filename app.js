// https://tomassetti.me/antlr-mega-tutorial/#htmlchatlistener.js
const antlr4 = require('antlr4/index');
const ParPlusPlusLexer = require('./antlr4AutoGen/ParPlusPlusLexer');
const ParPlusPlusParser = require('./antlr4AutoGen/ParPlusPlusParser');

// Usar llaves porque se usa exports y no module.exports
const DefaultListener = require('./defaultListener');

var input = "program Ejemplo; var int i, j, p; int arreglo[10]; float valor; int matriz[3][8]; main() { 1+2-3-4.0; \"hola\" + 'a'; b; b[1][2]; }";
var chars = new antlr4.InputStream(input);
var lexer = new ParPlusPlusLexer.ParPlusPlusLexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);
var parser = new ParPlusPlusParser.ParPlusPlusParser(tokens);
parser.buildParseTrees = true;   

// Poner llamar la primer regla
var tree = parser.program();
var ParPlusListener = new DefaultListener();
antlr4.tree.ParseTreeWalker.DEFAULT.walk(ParPlusListener, tree);