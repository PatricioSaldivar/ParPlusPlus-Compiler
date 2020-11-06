// https://tomassetti.me/antlr-mega-tutorial/#htmlchatlistener.js
const antlr4 = require('antlr4/index');
const ParPlusPlusLexer = require('./antlr4AutoGen/ParPlusPlusLexer');
const ParPlusPlusParser = require('./antlr4AutoGen/ParPlusPlusParser');
const fs = require('fs');


// Usar llaves porque se usa exports y no module.exports
const DefaultListener = require('./defaultListener');



var inputFile = '';
let ParPlusListener = new DefaultListener();
fs.readFile('./input/input.txt', 'utf8', function(err, data) {
    if (err) {
        // throw new Error(err);
    }
    inputFile = data;
    var chars = new antlr4.InputStream(inputFile);
    var lexer = new ParPlusPlusLexer.ParPlusPlusLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new ParPlusPlusParser.ParPlusPlusParser(tokens);
    parser.buildParseTrees = true;   

    // Poner llamar la primer regla
    var tree = parser.program();
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(ParPlusListener, tree);
});


// console.log('———————————————————————————————');
// console.log('input data');
// console.log(inputFile);
