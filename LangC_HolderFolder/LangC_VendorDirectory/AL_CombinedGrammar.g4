/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar AL_CombinedGrammar;
rule : HEADER;
HEADER          : ':alproject:' ;
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
FALSE           : 'false';
FILE            : 'file';
FINALLY         : 'finally';
FUNCTION        : 'function'; 
IF              : 'if';
IN              : 'in';
IS              : 'is';
LOOPS           : 'loops';
NULL            : 'null';
NOT             : 'not';
OR              : 'or';
PROGRAM         : 'program';
SET             : 'set';
SWITCH          : 'switch';
TIMES           : 'times';
TO              : 'to';
TRUE            : 'true';
TRY             : 'try';
UNIMPLEMENTED   : 'unimplemented';
WHILE           : 'while';
WS : [ \t\r\n] + -> skip ;