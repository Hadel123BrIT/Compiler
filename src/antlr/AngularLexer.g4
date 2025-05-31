lexer grammar AngularLexer;


// Tokens
SEMI             : ';' ;
LET              : 'let' ;
CONST            : 'const' ;
FUNCTION         : 'function' ;
CLASS            : 'class' ;
CONSTRUCTOR      : 'constructor' ;
INTERFACE        : 'interface' ;
IMPORT           : 'import' ;
FROM             : 'from' ;
EXPORT           : 'export' ;
AT               : '@' ;
TRUE             : 'true' ;
FALSE            : 'false' ;

// Angular-specific Tokens
AT_COMPONENT      : '@Component' ;
SELECTOR          : 'selector' ;
TEMPLATE          : 'template' ;
STANDALONE      : 'standalone' ;          // تعريف كلمة 'standalone'

IMPORTS         : 'imports' ;
STYLES            : 'styles' ;
BINDING           : '[' Identifier ']' ;
TWO_WAY_BINDING   : '[(' Identifier ')]' ;
PROPERTY_BINDING  : '{{' .*? '}}' ;



STYLE             : 'style' ;
Alt               : 'alt';
Src               : 'src';



// Angular Directives & Events
NG_FOR            : '*ngFor' ;
NG_IF             : '*ngIf' ;
CLICK_EVENT       : '(click)' ;



// Literals
StringLiteral     : '"' .*? '"' | '\'' .*? '\'' ;
NumberLiteral : [0-9]+ ('.' [0-9]+)? ;
BooleanLiteral    : TRUE | FALSE ;



// Identifiers and Types
Identifier : [a-zA-Z_$][a-zA-Z0-9_$]* ;



// Whitespace and Comments
WHITESPACE        : [ \t\r\n]+ -> skip ;
COMMENT           : '//' ~[\r\n]* -> skip;

// Symbols



DOT           : '.' ;
ARRAY_START    : '[' ;
ARRAY_END      : ']' ;
LBRACE            : '{' ;
RBRACE            : '}' ;
LPAREN            : '(' ;
RPAREN            : ')' ;
COLON             : ':' ;
COMMA             : ',' ;
EQUAL             : '=' ;
BACKTICK          : '`' ;



DIRECTIVE         : '\\*[a-zA-Z][a-zA-Z0-9_]*' ; // مثل *ngFor
EVENT_BINDING     : '\\([a-zA-Z][a-zA-Z0-9_]*\\)' ; // مثل (click)




// HTML Symbols
HTML_TAG_OPEN     : '<' ;
HTML_TAG_CLOSE    : '>' ;
HTML_TAG_END      : '</' ;
HTML_SELF_CLOSING : '/>' ;




// HTML Tags
DIV_TAG           : 'div' ;
P_TAG             : 'p' ;
IMG_TAG           : 'img' ;
H2_TAG            : 'h2' ;

THIS            : 'this';
//HTML_TEXT
//    : ~[<>{}]+ ;
