grammar AL_CombinedGrammar;

program 
    : ProgramHeader? ProgramDeclaration? VariableHeader? variable* MethodHeader?
    ;

ProgramHeader 
    : ':alproject:'
    ;

ProgramDeclaration 
    : 'this program "' Words+ '"'
    ;

VariableHeader
    : ':variables:'
    ;

MethodHeader
    : ':methods:'
    ;

method
    :
    ;

variable
    : 'let #' Words AssignmentOperator (Words|INT) ';'
    ;

AssignmentOperator
    : '='
    ;

INT
    : [0-9]+
    ;

Words 
    : [a-zA-z_]+
    ;

WS
    : [ \t\n\r]+ -> skip
    ;