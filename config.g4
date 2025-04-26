grammar config;

// Parser rules
program: 'program' 'var' description 'begin' operator (';' operator)* 'end';

description: 'dim' ID (',' ID)* type;

type: 'int' | 'float' | 'bool';

operator: compound | assignment | conditional | fixedLoop | conditionalLoop | input | output;

compound: 'begin' operator (';' operator)* 'end';

assignment: ID ':=' expression;

conditional: 'if' '(' expression ')' operator ('else' operator)?;

fixedLoop: 'for' assignment 'to' expression ('step' expression)? operator 'next';

conditionalLoop: 'while' '(' expression ')' operator;

input: 'readln' ID (',' ID)*;

output: 'writeln' expression (',' expression)*;

expression: operand (relOp operand)*;

operand: term (addOp term)*;

term: factor (mulOp factor)*;

factor: ID | number | boolConst | '~' factor | '(' expression ')';

number: integer | real;

boolConst: 'true' | 'false';

integer: binary | octal | decimal | hexadecimal;

binary: (BINARY_DIGIT)+ ('B' | 'b');

octal: (OCTAL_DIGIT)+ ('O' | 'o');

decimal: (DIGIT)+ ('D' | 'd')?;

hexadecimal: (HEX_DIGIT)+ ('H' | 'h');

real: numericString exponent | (numericString)? '.' numericString (exponent)?;

numericString: (DIGIT)+;

exponent: ('E' | 'e') ('+' | '-')? numericString;

// Lexer rules
relOp: NE | EQ | LT | LE | GT | GE;

addOp: PLUS | MIN | OR;

mulOp: MULT | DIV | AND;

NE: 'NE';
EQ: 'EQ';
LT: 'LT';
LE: 'LE';
GT: 'GT';
GE: 'GE';

PLUS: 'plus';
MIN: 'min';
OR: 'or';

MULT: 'mult';
DIV: 'div';
AND: 'and';

ID: LETTER (LETTER | DIGIT)*;

fragment LETTER: [A-Za-z];
fragment DIGIT: [0-9];
fragment BINARY_DIGIT: [01];
fragment OCTAL_DIGIT: [0-7];
fragment HEX_DIGIT: [0-9A-Fa-f];

WS: [ \t\r\n]+ -> skip;