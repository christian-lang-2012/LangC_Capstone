/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar AL_CombinedGrammar;
program 
    : ProgramHeader ProgramDeclaration ;

ProgramHeader 
    : ':alproject:';

ProgramDeclaration 
    : 'this program' '"' expr '"';

stat
    : expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr
    : expr op=(MUL|DIV)expr
    | expr op=(ADD|SUB)expr
    | INT
    | ID
    | '(' expr ')'
    ;

ID
    : [a-zA-z]+;
INT
    : [0-9]+;
NEWLINE
    : '\r'? '\n';
WS
    : [ \t]+ -> skip;