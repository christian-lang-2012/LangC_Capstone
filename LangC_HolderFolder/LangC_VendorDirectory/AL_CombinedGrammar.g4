grammar AL_CombinedGrammar;
program 
    : ProgramHeader ProgramDeclaration VariableHeader 
      VariableDeclaration* MethodHeader MethodDeclaration* ;

ProgramHeader 
    : ':alproject:'
    ;

ProgramDeclaration 
    : 'this program' '"' ID '"'
    ;

VariableHeader
    : ':variables:'
    ;


MethodHeader
    : ':methods:'
    ;

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


MUL
    : 'MUL'
    ;

DIV
    : 'DIV'
    ;

ADD
    : 'ADD'
    ;

SUB
    : 'SUB'
    ;

ID
    : [a-zA-z]+;
INT
    : [0-9]+;
NEWLINE
    : '\r'? '\n';
WS
    : [ \t]+ -> skip;