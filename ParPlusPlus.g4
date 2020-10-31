// Definicion de gramatica
grammar ParPlusPlus;

program //Initial rule to start of program
: PROGRAM ID SEMICOLON varBlock funcBlock main; 

main // Main function
: MAIN LP RP LCB statues RCB;

varBlock //Declare variables block
: VAR vars rvars
| ;

vars //Declare 1 variable
: type xvars SEMICOLON;

rvars //Make more variabes
:vars rvars
| ; 

xvars //Name of variable
: ID yvars
| ID varDimensionsInit yvars;

yvars //Continuation of another variable of same type
: COMMA xvars
| ;

funcBlock // Declare a function
: type MODULE ID LP params RP varBlock LCB statues RCB funcBlock
| VOID MODULE ID LP params RP varBlock LCB statues RCB funcBlock
| ;

params // Declare parameters
: type ID rparams
| type ID varDimensionsInit rparams
| ;

rparams // Continuation of parameters
: COMMA params
| ;

varDimensionsInit // Define dimensions of a variable
: LB INT RB
| LB INT RB LB INT RB
| ;

statues // Define 0 or more statues
:statue statues
| ;

statue // Define a statue
: asignation semicolon
| funcCall semicolon
| returnFunc semicolon
| read semicolon
| write semicolon
| decision
| whileloop
| forloop
| expresion semicolon;

semicolon
: SEMICOLON;

varDimensions // Get acces to a dimension of a variable
: LB expresion RB
| LB expresion RB LB expresion RB
| ;

asignation // Statue of assignation
: ID varDimensions ASSIGN expresion;

funcCall // Statue of calling a function
: ID LP arguments RP;

returnFunc // Statue of return function
: RETURN LP expresion RP;

read // Statue of read function
: READ LP xvars RP;

write // Statue of write function
: WRITE LP xwrite RP;

xwrite // Values to use in write function
: expresion ywrite
| STRING ywrite;

ywrite // Continuation of expresions or strings in write function
: COMMA xwrite
| ;

decision // Statue of decision functioon
: IF LP expresion RP decisiontwo;

decisiontwo // Statue of decision functioon
: THEN LCB statues RCB xdecision;

xdecision // Else function
: ELSE LCB statues RCB
| ;

forloop // La variable debe ser declarada en el for loop
: FOR asignation forlooptwo;

forlooptwo
:TO expresion forloopthree; 

forloopthree
:DO LCB statues RCB;

whileloop // Statue of while function
: WHILE whilelooptwo;

whilelooptwo
: LP expresion RP whileloopthree;

whileloopthree
: DO LCB statues RCB;

arguments // Possible arguments in a function
:expresion rarguments;

rarguments // Continuation of more arguments
: COMMA arguments
| ;

expresion // Statue of expresion
: exp
| exp lessThanOrEqualExp exp
| exp greaterThanOrEqualExp exp
| exp equalsExp exp
| exp differentExp exp
| exp andExp exp
| exp orExp exp
| exp lessThan exp
| exp greaterThan exp
| notExp expresion;

lessThanOrEqualExp
: LTEQ;

greaterThanOrEqualExp
: GTEQ;

equalsExp
: EQ;

differentExp
: NEQ;

andExp
: AND;

orExp
: OR;

lessThan
: LT;

greaterThan
: GT;

notExp
: NOT;

exp // A exp
: exp plus termino
| exp minus termino
| termino
;

plus
: PLUS;

minus
: MINUS;

termino // A term
: termino mult factor
| termino div factor
| termino mod factor
| factor;

mult
: MULT;

div
: DIV;

mod
: MOD;


factor // A factor
: funcCall
| LP expresion RP
| cte
| MINUS cte;

type // Define types
: 'int' 
| 'float' 
| 'char';  

cte // Define constants
: ID varDimensions
| INT
| FLOAT
| STRING
| CHAR;
    
VOID: 'void';
PROGRAM: 'program';
MODULE: 'module';
VAR: 'var';
MAIN: 'main';



IF: 'if';
ELSE: 'else';
RETURN: 'return';
READ: 'read';
WRITE: 'write';
THEN: 'then';
TO: 'to';

SEMICOLON: ';';
COMMA: ',';
LB: '[';
RB: ']';
LCB: '{';
RCB: '}';
LP: '(';
RP: ')';


PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';

EQ: '==';
GTEQ: '>=';
LTEQ: '<=';
NEQ: '!=';
NOT: '!';
OR: '||';
AND: '&&';
GT: '>';
LT: '<';
ASSIGN: '=';


FOR: 'for';
WHILE: 'while';
DO: 'do';


ID : ('A'..'Z' | 'a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9')*; 
INT: ('0' .. '9') +;
FLOAT: ('0' .. '9') + ('.' ('0' .. '9') +)?;
STRING: '"' (~[\t\r\n] )* '"'; 
CHAR: ['] (~[\t\r\n]) ['];

WHITESPACE : [ \t\r\n]+ -> skip ;