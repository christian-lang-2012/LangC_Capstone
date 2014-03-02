grammar ALCombinedGrammar;

//Parser Rules
program
    :
        programHeader
        variableHeader
        variableDeclarators*
        methodHeader
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

 constantlyDeclaration
      :
          'constantly'
      ;
 variableDeclarators
    : 'let' primitiveType variableDeclarator  (',' variableDeclarator)*
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
      |   expression '.' (variableIdentifier | Identifier)
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
    
    expressionList
      :   expression (',' expression)*
      ;
    
    primary
      :   '(' expression ')'
      |   literal
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
       
 
    
//Lexer Rules
       
ALPROJECT: ':' 'alproject' ':';
BOOLEAN : 'boolean';
BYTE : 'byte';
CHAR : 'char';
CONSTANTLY: 'constantly';
DOUBLE : 'double';
FLOAT: 'float';
INT : 'int';
LET: 'let';
LONG: 'long';
METHODHEADER: ':''methods'':';
PROGRAM: 'program';
SHORT : 'short';
STRING : 'string';
THIS : 'this';
VARIABLEHEADER : ':' 'variables' ':';

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