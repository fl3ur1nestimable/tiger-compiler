grammar tiger;
@header{
    package parser;
}

//min regles
program : expr EOF;

expr : STRING|integer|'nil'|lvalue|assignement|negation|expr BINARY expr|assignement|ifthenelse|ifthen|whiledo|for_|'break'|functionCall|'('expr_seq')'|
       type_IDF'{'field_list*'}'|type_IDF' [ 'expr' ] of 'expr|let_in_end|stdlib;

negation :'- 'expr ;

expr_seq : expr | expr_seq';'expr;

expr_list : expr | expr_list' , 'expr;

field_list : IDF' = 'expr|field_list' , 'IDF' = 'expr;

lvalue : IDF | lvalue'.'IDF|lvalue'['expr']';

functionCall : IDF'('expr_list*')';

assignement : lvalue':= 'expr;

ifthenelse : 'if 'expr' then 'expr'else 'expr;
ifthen : 'if 'expr' then 'expr;
whiledo : 'while 'expr'do'expr;
for_:'for 'IDF' := 'expr' to 'expr'do'expr;

let_in_end : 'let ' declaration_list' in ' expr_seq' end';

declaration_list :  declaration | declaration_list declaration;
declaration : type_declaration | variable_declaration | function_declaration;

type_declaration : 'type 'type_IDF' = 'type;
type : type_IDF|'{'type_fields*'}'|'array of 'type_IDF;
type_fields : type_field | type_fields' , 'type_field;
type_field : IDF':'type_IDF;
type_IDF : 'int'|'string'|'intArray'|'stringArray';

variable_declaration : 'var 'IDF' := 'expr |'var 'IDF' : 'type_IDF' := 'expr;

function_declaration : 'function 'IDF '(' type_fields* ') =' expr | 'function 'IDF '(' type_fields') : 'type_IDF ' = ' expr;

stdlib : noreturn | returnString | returnInt;
noreturn : print_|printi|flush_|exit_;
returnString : getchar_|chr_|substring_|concat_;
returnInt :  ord_|size_|not_|ifthen|ifthenelse;

print_ : 'print('(STRING|returnString)')';
printi : 'printi('(integer|returnInt)')';
flush_ : 'flush()';
exit_ : 'exit('(integer|returnInt)')';
getchar_ : 'getchar()';
chr_ : 'chr('(integer|returnInt)')';
substring_ : 'substring('(STRING|returnString)','(integer|returnInt)','(integer|returnInt)')';
concat_ : 'concat('(STRING|returnString)','(STRING|returnString)')';
ord_ : 'ord('(STRING|returnString)')';
size_ : 'size('(STRING|returnString)')';
not_ : 'not('(integer|returnInt)')';

// maj
BINARY : '+'| '-'| '*'| '/' |'=' |'<>' |'<' |'>' |'<=' |'>=' |'&'| '|';
IDF : ('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|'_'|INT)*) ;
INT : '0'..'9';
integer : INT+;
ESC : 'n'|'t'|'"'|'\\';
ESCAPE_SEQ : '\\'ESC;
STRING : '"'([ -~]|ESCAPE_SEQ)*'"';
COMMENT : '/*'.*?'*/';
WS : ('\n'|'\t'|' '|'\r'|'\f'|COMMENT)+ -> skip ; 