const antlr4 = require('antlr4');
const ParPlusPlusLexer = require('./antlr4AutoGen/ParPlusPlusLexer');
const ParPlusPlusParser = require('./antlr4AutoGen/ParPlusPlusParser');
var ParPlusPlusListener = require('./antlr4AutoGen/ParPlusPlusListener').ParPlusPlusListener;

htmlListener = function(res) {
    this.Res = res;    
    ParPlusPlusListener.call(this); // inherit default listener
    return this;
};

// inherit default listener
htmlListener.prototype = Object.create(ParPlusPlusListener.prototype);
htmlListener.prototype.constructor = htmlListener;

// override default listener behavior
htmlListener.prototype.enterProgram = function(ctx) {          
    this.Res.write("<strong> hello </strong>");    
};


exports.htmlListener = htmlListener;