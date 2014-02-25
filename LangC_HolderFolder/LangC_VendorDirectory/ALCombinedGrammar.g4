grammar ALCombinedGrammar;


program 
      : 
          programHeader? programDeclaration 
          variableHeader? variableDeclaration* 
          methodHeader? methodDeclaration* 
          mainProgram
          EOF
      ;

  programHeader
      :
          ALPROJECT
      ;
  
  programDeclaration 
      :   'this' 'program'  '"' Identifier '"'
      ;
  
  
  variableHeader
      :   VARIABLEHEADER
      ;
  
  methodHeader
      :   METHODHEADER
      ;
  
  METHODHEADER: ':' 'methods' ':';
  
  mainProgram
      :
          STARTPROGRAM
          blockStatement*
          ENDPROGRAM
      ;
  
  STARTPROGRAM: ':'' start' 'program' ':';
  ENDPROGRAM: ':' 'end' 'program' ':';
  
  methodDeclaration
      :
          FUNCTION (type|VOID) Identifier formalParameters
          (methodBody | ';')
      ;
  
  methodBody
      : 
          block ';'
      ;
  
  block
      :   
          'begin' 
              blockStatement* 
          'end'
      ;
  
  blockStatement
      :   variableDeclaration ';'
      |   statement
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
  
  //For Controls && Switch Statement Controls
  switchBlockStatementGroup
      :   switchLabel+ blockStatement+
      ;
  
  switchLabel
      :   'case' constantExpression ':'
      |   'default' ':'
      ;
  
  DEFAULT: 'default';
  
  forControl
      :   enhancedForControl
      |   forInit? ';' expression? ';' forUpdate?
      ;
  
  forInit
      :   variableDeclaration
      |   expressionList
      ;
  
  enhancedForControl
      :   type variableIdentifier ':' expression
      ;
  
  forUpdate
      :   expressionList
      ;
  
  // EXPRESSIONS
  
  parExpression
      :   '(' expression ')'
      ;
  
  expressionList
      :   expression (',' expression)*
      ;
  
  statementExpression
      :   expression
      ;
  
  constantExpression
      :   expression
      ;
  
  //Formal parameter stuff
  
  formalParameters
      :   '(' formalParameterList? ')'
      ;
  
  formalParameterList
      :   formalParameter (',' formalParameter)*
      ;
  
  formalParameter
      :   type variableIdentifier
      ;
  
  
  //Variable
  variableDeclarators
      :
          variableDeclaration (',' variableDeclaration)*
      ;
  
  variableDeclaration
      : 'let' type variableDeclarationID  ('=' variableInitialization)? ';'
      ;
  
  variableDeclarationID
      : variableIdentifier
      ;
  
  variableInitialization
      : expression
      ;
  
  expression
      :   primary
      |   expression '.' (variableIdentifier | Identifier)
      |   expression '[' expression ']'
      |   expression '(' expressionList? ')'
      |   '(' type ')' expression
      |   expression ('++' | '  ')
      |   ('+'|' '|'++'|'  ') expression
      |   ('~'|'!') expression
      |   expression ('*'|'/'|'%') expression
      |   expression ('+'|' ') expression
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
          |   ' ='<assoc=right>
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
  
  
  primary
      :   '(' expression ')'
      |   literal
      |   Identifier
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
      |   'char'
      |   'byte'
      |   'short'
      |   'int'
      |   'long'
      |   'float'
      |   'double'
      ;
  
  variableIdentifier
      :
          '#' Identifier
      ;
  
  
  // Lexer portion
  
  BOOLEAN         : 'boolean';
  CHAR            : 'char';
  BYTE            : 'byte';
  SHORT           : 'short';
  INT             : 'int';
  LONG            : 'long';
  FLOAT           : 'float';
  DOUBLE          : 'double';
  RETURN          : 'return';
  LEFTCURLY       : '{';
  RIGHTCURLY      : '}';
  VARIABLEHEADER  : ':'' variables' ':';
  VARIABLESYMBOL  : '#';
  
  //KeyWords
  AND             : 'and';
  ARRAY           : 'array';
  AS              : 'as';
  BEGIN           : 'begin';
  BREAK           : 'break';
  CASE            : 'case';
  CATCH           : 'catch';
  CONSTANTLY      : 'constantly';
  CONTINUE        : 'continue';
  DO              : 'do';
  ELSE            : 'else';
  END             : 'end';
  EXIT            : 'exit';
  FILE            : 'file';
  FINALLY         : 'finally';
  FOR             : 'for';
  FUNCTION        : 'function';
  IF              : 'if';
  IN              : 'in';
  IS              : 'is';
  LET             : 'let';
  OR              : '||';
  PROGRAM         : 'program';
  SET             : 'set';
  SWITCH          : 'switch';
  THIS            : 'this';
  TRY             : 'try';
  UNIMPLEMENTED   : 'unimplemented';
  VOID            : 'void';
  WHILE           : 'while';
  ANDAND: '&&';
  
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
      :   [1 9]
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
      :   [0 9a fA F]
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
      :   [0 7]
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
      :   [+ ]
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
  
  //Separators
  LPAREN          : '(';
  RPAREN          : ')';
  LBRACK          : '[';
  RBRACK          : ']';
  SEMI            : ';';
  COMMA           : ',';
  DOT             : '.';
  
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
  DEC             : '  ';
  ADD             : '+';
  SUB             : ' ';
  MUL             : '*';
  DIV             : '/';
  BITAND          : '&';
  BITOR           : '|';
  CARET           : '^';
  MOD             : '%';
  QUOTE          : '"';
  
  ADD_ASSIGN      : '+=';
  SUB_ASSIGN      : ' =';
  MUL_ASSIGN      : '*=';
  DIV_ASSIGN      : '/=';
  AND_ASSIGN      : '&=';
  OR_ASSIGN       : '|=';
  XOR_ASSIGN      : '^=';
  MOD_ASSIGN      : '%=';
  LSHIFT_ASSIGN   : '<<=';
  RSHIFT_ASSIGN   : '>>=';
  URSHIFT_ASSIGN  : '>>>=';
  ALPROJECT       : ':' 'alproject' ':';
  
  //Defining identifiers and letters and digits
  
Identifier
      : AL_Letter AL_LetterOrDigit*
      ;
  
  AL_Letter
      : [a-zA-z$_]
      | ~[\u0000\u00FF\uD800\uDBFF]
      |  [\uD800\uDBFF][\uDC00\uDFFF]
      ;
  
  AL_LetterOrDigit
      : [a-zA-Z0-9$_]
      | ~[\u0000 \u00FF\uD800 \uDBFF]
      | [\uD800 \uDBFF] [\uDC00 \uDFFF]
      ;
  
  //Whitespace and comments
  WS
      : 
          ( '\t'
          |'\r\n'
          |'\u000C')+ -> skip
      ;
  
  COMMENT
      : '/*' .*? '*/' -> skip
      ;
  
  LINE_COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;