    grammar AL_CombinedGrammar;

program 
    : ProgramHeader? 
      ProgramDeclaration? 
      VariableHeader? 
      variable* 
      MethodHeader? method* 
      mainProgram?
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

mainProgram
    : StartProgram EndProgram
    ;

StartProgram
    :':start program:'
    ;

EndProgram
    :':end program:'
    ;

method
    : Function Words FirstParenthases SecondParenthases Begin block End
    ;

block
    :   blockStatement*
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   variableModifier* type variableDeclarators
    ;

statement
    :   block
    |   ASSERT expression (':' expression)? ';'
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'try' block (catchClause+ finallyBlock? | finallyBlock)
    |   'try' resourceSpecification block catchClause* finallyBlock?
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    |   'synchronized' parExpression block
    |   'return' expression? ';'
    |   'throw' expression ';'
    |   'break' Identifier? ';'
    |   'continue' Identifier? ';'
    |   ';'
    |   statementExpression ';'
    |   Identifier ':' statement
    ;


FirstParenthases
    :'('
    ;

SecondParenthases
    :')'
    ;

Begin
    :'begin'
    ;
End
    :'end;'
    ;

Function
    : 'function'
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