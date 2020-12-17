/*
    syntex for mx-start
    reference: antlr c.g4, MasterJH5574's repo
*/

grammar mx;

program : compoundStatement*;
compoundStatement :
      funcDefStatement
    | classDefStatement
    | varDefStatement
    | ';';

funcDefStatement : (Type | Void) Identifier '(' argList ')' block;
arg : Type Identifier;
argList : arg*;
classDefStatement : Class Identifier '{'(funcDefStatement | constructFuncDefStatement | varDefStatement)'}' ';';
varDefStatement : Type varDefList;
varDefList : varDef+;
varDef : Identifier ('=' expression)?;
constructFuncDefStatement : Identifier '(' ')' block;

block : '{' statement* '}';
statement :
      If '(' expression ')' block (Else block) ?                                #ifStatement
    | While '(' expression ')' block                                            #whileStatement
    | For '(' statement ';' expressionList ';' statement ')' block              #forStatement
    | Return expression?                                                        #returnStatement
    | Break ';'                                                                 #breakStatement
    | Continue ';'                                                              #continueStatement
    | expression ';'                                                            #expressionStatement
    | block ';'                                                                 #blockStatement
    | varDefStatement ';'                                                       #varStatement
    | ';'                                                                       #emptyStatement
    ;

expression:
      expression op=('++' | '--')                                     #postfixExpression
    | <assoc=right> New creator                                       #newExpression
    | expression '.' Identifier                                       #memberExpression
    | expression '(' expressionList? ')'                              #funcCallExpression
    | expression '[' expression ']'                                   #subscriptExpression
    | <assoc=right> op=('++' | '--') expression                       #prefixExpression
    | <assoc=right> op=( '+' | '-' ) expression                       #prefixExpression
    | <assoc=right> op=( '!' | '~' ) expression                       #prefixExpression
    | src1=expression op=('*' | '/' | '%') src2=expression            #binaryExpression
    | src1=expression op=('+' | '-') src2=expression                  #binaryExpression
    | src1=expression op=('<<' | '>>') src2=expression                #binaryExpression
    | src1=expression op=('<' | '>' | '<=' | '>=') src2=expression    #binaryExpression
    | src1=expression op=('==' | '!=') src2=expression                #binaryExpression
    | src1=expression op='&' src2=expression                          #binaryExpression
    | src1=expression op='^' src2=expression                          #binaryExpression
    | src1=expression op='|' src2=expression                          #binaryExpression
    | src1=expression op='&&' src2=expression                         #binaryExpression
    | src1=expression op='||' src2=expression                         #binaryExpression
    | <assoc=right> src1=expression op='=' src2=expression            #binaryExpression
    | '(' expression ')'                                              #subExpression
    | This                                                            #thisExpression
    | Constant                                                        #constExpression
    | Identifier                                                      #idExpression
    ;

creator :
    BasicType                                                         #basicCreator
    | BasicType '(' ')'                                               #classCreator
    | BasicType ('[' expression? ']')+                                #arrayCreator
    ;

expressionList : expression (',' expression)*;


Int : 'int';
Bool : 'bool';
String: 'string';
Null : 'null';
Void : 'void';
True : 'true';
False : 'False';
If : 'if';
Else : 'else';
For : 'for';
While : 'while';
Break : 'break';
Continue : 'continue';
Return : 'return';
New: 'new';
Class: 'class';
This: 'this';

fragment Digit : [0-9];
fragment NonZeroDigit : [1-9];
fragment EscapeCharacters : '\\\n' | '\\\\' | '\\"';
fragment PrintableCharacters : [ -~];
fragment Characters : EscapeCharacters | PrintableCharacters;
fragment IdentifierCharacters : [a-z] | [A-Z] | [0-9] | '_';


Constant : LogicConstant | IntConstant | StringConstant | Null;
LogicConstant : True | False;
IntConstant : '0' | (NonZeroDigit Digit*);
StringConstant : '"' Characters* '"';
Identifier : IdentifierCharacters+;
BasicType : (Int | Bool | String | Identifier);
Type : (BasicType'[' ']') | BasicType;

Whitespace : [ \t]+ -> skip;
Newline : ('\r''\n'?|'\n') -> skip;
BlockComment : '/*' .*? '*/' -> skip;
LineComment : '//' ~[\r\n]*-> skip;
