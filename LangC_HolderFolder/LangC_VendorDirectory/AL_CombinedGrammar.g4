/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar AL_CombinedGrammar;
r : 'hello' ID;
ID : [a-z]+ ;
WS : [ \t\r\n] + -> skip ;