grammar ALCombinedGrammar;

//Parser Rules
program
    :
        programHeader
        variableHeader
        variableDeclarators*
        methodHeader
        methodDeclaration*
        mainProgram
    ;

programHeader
    :
        ALPROJECT
    ;

  variableHeader
      :   VARIABLEHEADER
      ;

  methodHeader
      :
          METHODHEADER
      ;
  
 mainProgram
     :
         ':begin program:'
         blockStatement*
         ':end program:'
     ;

 constantlyDeclaration
      :
          'constantly'
      ;
 variableDeclarators
    : 'let' primitiveType variableDeclarator  (',' variableDeclarator)* ';'
    ;
 
 variableDeclarator
    :   variableDeclaratorId constantlyDeclaration? ('=' variableInitializer)?
    ;
 
 variableDeclaratorId
    :   variableIdentifier ('[' ']')*
    ;

 variableInitializer
    :   arrayInitializer
    |   expression
    ;
 
 arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

      variableIdentifier
      :
          '#' Identifier
      ;
    
    expression
    :   primary
    |   expression '.' Identifier
    |   expression '.' 'this'
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   '(' type ')' expression
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   expression
        (   '='<assoc=right>
        |   '+='<assoc=right>
        |   '-='<assoc=right>
        |   '*='<assoc=right>
        |   '/='<assoc=right>
        |   '&='<assoc=right>
        |   '|='<assoc=right>
        |   '^='<assoc=right>
        |   '>>='<assoc=right>
        |   '>>>='<assoc=right>
        |   '<<='<assoc=right>
        |   '%='<assoc=right>
        )
        expression
    ;
    
    expressionList
      :   expression (',' expression)*
      ;
    
    primary
      :   '(' expression ')'
      |   literal
      |   variableIdentifier
      |   methodCall
      ;

    methodCall
        :
            Identifier arguments
        ;
    
    arguments
    :   '(' expressionList? ')'
    ;
    
     literal
      :   IntegerLiteral
      |   FloatingPointLiteral
      |   CharacterLiteral
      |   StringLiteral
      |   BooleanLiteral
      |   NullLiteral
      ;
     
     type
      :   primitiveType ('[' ']')*
      ;
     
       primitiveType
      :   'boolean'
      |   'string'
      |   'char'
      |   'byte'
      |   'short'
      |   'int'
      |   'long'
      |   'float'
      |   'double'
      ;
       
methodDeclaration
    :   'function' (type|'void') Identifier formalParameters ('[' ']')*
        (methodBody | ';')
    ;

methodBody
    :   block
    ;

block
    :   'begin' blockStatement* 'end'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration
    ;

localVariableDeclaration
    :   variableDeclarators
    ;
 
formalParameters
    :   '(' formalParameterList? ')'
    ;
      
formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    |   lastFormalParameter
    ;
      
formalParameter
    :  type variableDeclaratorId
    ;

lastFormalParameter
    :   type '...' variableDeclaratorId
    ;

statement
    :   block
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    |   'return' expression? ';'
    |   'break' variableIdentifier? ';'
    |   'continue' variableIdentifier? ';'
    |   ';'
    |   statementExpression ';'
    |   variableIdentifier ':' statement
    ;

parExpression
    :   '(' expression ')'
    ;

forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   type variableIdentifier ':' expression
    ;

forUpdate
    :   expressionList
    ;

switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   'case' constantExpression ':'
    |   'default' ':'
    ;

constantExpression
    :   expression
    ;

statementExpression
    :   expression
    ;

    
//Lexer Rules
       
ALPROJECT           : ':' 'alproject' ':';
BEGIN               : 'begin';
BEGINPROGRAM        : ':begin program:';
BOOLEAN             : 'boolean';
BREAK               : 'break';
BYTE                : 'byte';
CASE                : 'case';
CHAR                : 'char';
CONSTANTLY          : 'constantly';
CONTINUE            : 'continue';
DEFAULT             : 'default';
DO                  : 'do';
DOUBLE              : 'double';
ELSE                : 'else';
END                 : 'end';
ENDPROGRAM          : ':end program:';
FLOAT               : 'float';
FOR                 : 'for';
FUNCTION            : 'function';
IF                  : 'if';
INT                 : 'int';
LET                 : 'let';
LONG                : 'long';
METHODHEADER        : ':''methods'':';
PROGRAM             : 'program';
RETURN              : 'return';
SHORT               : 'short';
STRING              : 'string';
SWITCH              : 'switch';
THIS                : 'this';
VARIABLEHEADER      : ':' 'variables' ':';
VOID                : 'void';
WHILE               : 'while';

  //Separators
  LPAREN          : '(';
  RPAREN          : ')';
  LCURLY          : '{';
  RCURLY          : '}';
  LBRACK          : '[';
  RBRACK          : ']';
  SEMI            : ';';
  COMMA           : ',';
  DOT             : '.';
  ELLIPSES        : '...';
  

  //Operators
  ASSIGN          : '=';
  GT              : '>';
  LT              : '<';
  BANG            : '!';
  TILDE           : '~';
  QUESTION        : '?';
  COLON           : ':';
  EQUAL           : '==';
  LE              : '<=';
  GE              : '>=';
  NOTEQUAL        : '!=';
  INC             : '++';
  DEC             : '--';
  ADD             : '+';
  SUB             : '-';
  MUL             : '*';
  DIV             : '/';
  BITAND          : '&';
  BITOR           : '|';
  CARET           : '^';
  MOD             : '%';
  QUOTE           : '"';
  HASHTAG         : '#';
  OR              : '||';
  AND             : '&&';
  
  ADD_ASSIGN      : '+=';
  SUB_ASSIGN      : '-=';
  MUL_ASSIGN      : '*=';
  DIV_ASSIGN      : '/=';
  AND_ASSIGN      : '&=';
  OR_ASSIGN       : '|=';
  XOR_ASSIGN      : '^=';
  MOD_ASSIGN      : '%=';
  LSHIFT_ASSIGN   : '<<=';
  RSHIFT_ASSIGN   : '>>=';
  URSHIFT_ASSIGN  : '>>>=';

  //Literals
  IntegerLiteral
      :   DecimalIntegerLiteral
      |   HexIntegerLiteral
      |   OctalIntegerLiteral
      |   BinaryIntegerLiteral
      ;
  
  fragment
  DecimalIntegerLiteral
      :   DecimalNumeral IntegerTypeSuffix?
      ;
  
  fragment
  HexIntegerLiteral
      :   HexNumeral IntegerTypeSuffix?
      ;
  
  fragment
  OctalIntegerLiteral
      :   OctalNumeral IntegerTypeSuffix?
      ;
  
  fragment
  BinaryIntegerLiteral
      :   BinaryNumeral IntegerTypeSuffix?
      ;
  
  fragment
  IntegerTypeSuffix
      :   [lL]
      ;
  
  fragment
  DecimalNumeral
      :   '0'
      |   NonZeroDigit (Digits? | Underscores Digits)
      ;
  
  fragment
  Digits
      :   Digit (DigitOrUnderscore* Digit)?
      ;
  
  fragment
  Digit
      :   '0'
      |   NonZeroDigit
      ;
  
  fragment
  NonZeroDigit
      :   [1-9]
      ;
  
  fragment
  DigitOrUnderscore
      :   Digit
      |   '_'
      ;
  
  fragment
  Underscores
      :   '_'+
      ;
  
  fragment
  HexNumeral
      :   '0' [xX] HexDigits
      ;
  
  fragment
  HexDigits
      :   HexDigit (HexDigitOrUnderscore* HexDigit)?
      ;
  
  fragment
  HexDigit
      :   [0-9a-fA-F]
      ;
  
  fragment
  HexDigitOrUnderscore
      :   HexDigit
      |   '_'
      ;
  
  fragment
  OctalNumeral
      :   '0' Underscores? OctalDigits
      ;
  
  fragment
  OctalDigits
      :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
      ;
  
  fragment
  OctalDigit
      :   [0-7]
      ;
  
  fragment
  OctalDigitOrUnderscore
      :   OctalDigit
      |   '_'
      ;
  
  fragment
  BinaryNumeral
      :   '0' [bB] BinaryDigits
      ;
  
  fragment
  BinaryDigits
      :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
      ;
  
  fragment
  BinaryDigit
      :   [01]
      ;
  
  fragment
  BinaryDigitOrUnderscore
      :   BinaryDigit
      |   '_'
      ;
  
  // Floating Point Literals
  
  FloatingPointLiteral
      :   DecimalFloatingPointLiteral
      |   HexadecimalFloatingPointLiteral
      ;
  
  fragment
  DecimalFloatingPointLiteral
      :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
      |   '.' Digits ExponentPart? FloatTypeSuffix?
      |   Digits ExponentPart FloatTypeSuffix?
      |   Digits FloatTypeSuffix
      ;
  
  fragment
  ExponentPart
      :   ExponentIndicator SignedInteger
      ;
  
  fragment
  ExponentIndicator
      :   [eE]
      ;
  
  fragment
  SignedInteger
      :   Sign? Digits
      ;
  
  fragment
  Sign
      :   [+-]
      ;
  
  fragment
  FloatTypeSuffix
      :   [fFdD]
      ;
  
  fragment
  HexadecimalFloatingPointLiteral
      :   HexSignificand BinaryExponent FloatTypeSuffix?
      ;
  
  fragment
  HexSignificand
      :   HexNumeral '.'?
      |   '0' [xX] HexDigits? '.' HexDigits
      ;
  
  fragment
  BinaryExponent
      :   BinaryExponentIndicator SignedInteger
      ;
  
  fragment
  BinaryExponentIndicator
      :   [pP]
      ;
  
  // Boolean Literals
  
  BooleanLiteral
      :   'true'
      |   'false'
      ;
  
  // Character Literals
  
  CharacterLiteral
      :   '\'' SingleCharacter '\''
      |   '\'' EscapeSequence '\''
      ;
  
  fragment
  SingleCharacter
      :   ~['\\]
      ;
  
  // String Literals
  
  StringLiteral
      :   '"' StringCharacters? '"'
      ;
  
  fragment
  StringCharacters
      :   StringCharacter+
      ;
  
  fragment
  StringCharacter
      :   ~["\\]
      |   EscapeSequence
      ;
  
  // Escape Sequences for Character and String Literals
  
  fragment
  EscapeSequence
      :   '\\' [btnfr"'\\]
      |   OctalEscape
      |   UnicodeEscape
      ;
  
  fragment
  OctalEscape
      :   '\\' OctalDigit
      |   '\\' OctalDigit OctalDigit
      |   '\\' ZeroToThree OctalDigit OctalDigit
      ;
  
  fragment
  UnicodeEscape
      :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
      ;
  
  fragment
  ZeroToThree
      :   [0-3]
      ;
  
  NullLiteral
      :   'null'
      ;
  
Identifier
    :
        Letter LetterOrDigit*
    ;

Letter
    : [a-zA-Z$_];

LetterOrDigit
    : [a-zA-Z0-9$_];

 WS
      : 
          [ \t\r\n\u000C]+ -> skip
      ;