grammar AL_CombinedGrammar;
program 
    : ProgramHeader ProgramDeclaration VariableHeader 
      VariableDeclaration* Variable* MethodHeader MethodDeclaration* ;

ProgramHeader 
    : ':alproject:'
    ;

ProgramDeclaration 
    : 'this program' '"' ID '"'
    ;

VariableHeader
    : ':variables:'
    ;

Variable
    : 'let #' ID '=' expr 
    ;

MethodHeader
    : ':methods:'
    ;

Method
    : function
    ;

function
    : 'function'
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
    | Variable
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