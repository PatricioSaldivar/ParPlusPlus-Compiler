#!/bin/sh
antlr -Dlanguage=JavaScript ParPlusPlus.g4
mv -f ParPlusPlus.interp /antlr4AutoGen
mv -f ParPlusPlus.tokens /antlr4AutoGen
mv -f ParPlusPlusLexer.interp /antlr4AutoGen
mv -f ParPlusPlusLexer.tokens /antlr4AutoGen
mv -f ParPlusPlusListener.js /antlr4AutoGen
mv -f ParPlusPlusParser.js /antlr4AutoGen