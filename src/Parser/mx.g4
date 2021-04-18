/*
    syntex for mx-start
    reference: antlr c.g4, MasterJH5574's repo
*/

grammar mx;

program : compoundStatement*;
compoundStatement :
      funcDefStatement
    | classDefStatement
    | varDefStatement ';'
    | ';';

funcDefStatement : (type | Void) Identifier '(' argList ')' block;
arg : type Identifier;
argList : arg? (',' arg)*;
classDefStatement : Class Identifier '{' (funcDefStatement | constructFuncDefStatement | (varDefStatement ';') | ';')* '}' ';';
varDefStatement : type varDef (','varDef)*;
varDef : Identifier ('=' expression)?;
constructFuncDefStatement : Identifier '(' ')' block;

block : '{' statement* '}';

simpleStatement:
    Return expression?                                                          #returnStatement
    | Break                                                                     #breakStatement
    | Continue                                                                  #continueStatement
    | expression                                                                #expressionStatement
    | block                                                                     #blockStatement
    | varDefStatement                                                           #varStatement
    ;

statement :
      If '(' expression ')' statement (Else statement) ?                                            #ifStatement
    | While '(' expression? ')' statement                                                           #whileStatement
    | For '(' stmt1=simpleStatement? ';' expressionList ';' stmt2=simpleStatement? ')' statement    #forStatement
    | simpleStatement ';'                                                                           #containSimpleStatement
    ;

expression:
      expression op=('++' | '--')                                     #postfixExpression
    | <assoc=right> New creator                                       #newExpression
    | expression '.' Identifier                                       #memberExpression
    | expression '(' expressionList? ')'                              #funcCallExpression
    | array=expression '[' index=expression ']'                       #subscriptExpression
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
    | constant                                                        #constExpression
    | Identifier                                                      #idExpression
    ;

creator :
    basicType                                                         #basicCreator
    | basicType '(' ')'                                               #classCreator
    | basicType ('[' expression? ']')+                                #arrayCreator
    ;

expressionList : expression (',' expression)*;


Int : 'int';
Bool : 'bool';
String: 'string';
Null : 'null';
Void : 'void';
True : 'true';
False : 'false';
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


constant : logicConstant | IntConstant | StringConstant | Null;
logicConstant : True | False;
IntConstant : '0' | (NonZeroDigit Digit*);
StringConstant : '"' Characters* '"';
Identifier : IdentifierCharacters+;
basicType : Int | Bool | String | Identifier;
type : (basicType(LeftBracket RightBracket)+)  #arrayType
       | basicType                             #simpleType
       ;

LeftBracket : '[';
RightBracket: ']';
Whitespace : [ \t]+ -> skip;
Newline : ('\r''\n'?|'\n') -> skip;
BlockComment : '/*' .*? '*/' -> skip;
LineComment : '//' ~[\r\n]*-> skip;
