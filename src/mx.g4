grammar mx;


primaryExpression : '(' expression ')';
postfixExpression : primaryExpression | postfixExpression '[' expression ']' | postfixExpression '(' argumentExpressionList? ')' | postfixExpression '++' | postfixExpression '--';
argumentExpressionList : assignmentExpression | argumentExpressionList ',' assignmentExpression;
unaryExpression : postfixExpression | '++' unaryExpression | '--' unaryExpression | unaryOperator castExpression;
unaryOperator : '&' | '*' | '+' | '-' | '~' | '!';
castExpression : unaryExpression;
multiplicativeExpression : castExpression | multiplicativeExpression '*' castExpression | multiplicativeExpression '/' castExpression | multiplicativeExpression '%' castExpression;
additiveExpression : multiplicativeExpression | additiveExpression '+' multiplicativeExpression | additiveExpression '-' multiplicativeExpression;
shiftExpression : additiveExpression | shiftExpression '<<' additiveExpression | shiftExpression '>>' additiveExpression;
relationalExpression : shiftExpression | relationalExpression '<' shiftExpression | relationalExpression '>' shiftExpression | relationalExpression '<=' shiftExpression | relationalExpression '>=' shiftExpression;
equalityExpression : relationalExpression | equalityExpression '==' relationalExpression | equalityExpression '!=' relationalExpression;
andExpression : equalityExpression | andExpression '&' equalityExpression;
exclusiveOrExpression : andExpression | exclusiveOrExpression '^' andExpression;
inclusiveOrExpression : exclusiveOrExpression | inclusiveOrExpression '|' exclusiveOrExpression;
logicalAndExpression : inclusiveOrExpression | logicalAndExpression '&&' inclusiveOrExpression;
logicalOrExpression : logicalAndExpression | logicalOrExpression '||' logicalAndExpression;
assignmentExpression : unaryExpression assignmentOperator assignmentExpression;
assignmentOperator: '=';
expression: assignmentExpression | expression ',' assignmentExpression;

designatorList : designator | designatorList designator;
designator : '[' constantExpression ']' | '.' Identifier;

statement : compoundStatement |expressionStatement | selectionStatement | iterationStatement | jumpStatement;

compoundStatement : '{' blockItemList? '}';
blockItemList : blockItem*;
blockItem : statement | declaration;

expressionStatement : expression? ';';
selectionStatement : 'if' '(' expression ')' statement ('else' statement)?;
iterationStatement : While '(' expression ')' statement | For '(' forCondition ')' statement;
forCondition : forDeclaration ';' forExpression? ';' forExpression? | expression? ';' forExpression? ';' forExpression?;
forDeclaration : declarationSpecifiers initDeclaratorList | declarationSpecifiers;
forExpression : assignmentExpression | forExpression ',' assignmentExpression;
jumpStatement : 'continue' ';' | 'break' ';' | 'return' expression? ';';

functionDefinition : declarationSpecifiers? declarator declarationList? compoundStatement;
declarationList : declaration | declarationList declaration;

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

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Semi : ';';
Comma : ',';

Assign : '=';
Equal : '==';
NotEqual : '!=';

Dot : '.';

fragment Digit : [0-9];
fragment NonZeroDigit : [1-9];
fragment EscapeCharacters : '\\\n' | '\\\\' | '\\"';
fragment PrintableCharacters : [ -~];
fragment Characters : EscapeCharacters | PrintableCharacters;
fragment Zero: '0';
fragment IdentifierCharacters : [a-z] | [A-Z] | [0-9] | '_';


LogicConstant : True | False;
IntConstant: Zero | (NonZeroDigit Digit*);
StringConstant: '"' Characters* '"';

Identifier : IdentifierCharacters+;

Whitespace: [ \t]+ -> skip;
Newline: ('\r''\n'?|'\n') -> skip;
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~[\r\n]*-> skip;
