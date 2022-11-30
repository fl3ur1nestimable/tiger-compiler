grammar tiger;
@header{
    package parser;
}

//min regles
program : expr EOF;

expr : or;

or : and ('|' and)*;
and : compare ('&'compare)*;
compare : plus (('<>' | '=' | '>=' | '<=' | '>' | '<') plus)*;
plus : mult (('+' | '-') mult)*;
mult : value (('*' | '/') value)*;

value : STRING
        |INT
        |'nil'
        |lvalue
        |assignement
        |negation
        |ifthenelse
        |whiledo
        |for_
        |'break'
        |functionCall
        |'('expr_seq?')'
        |type_IDF('{'field_list?'}'|'['expr'] of 'expr)
        |let_in_end
        |stdlib ;

negation :'-'expr ;
expr_seq : expr | expr_seq';'expr;
expr_list : expr | expr_list','expr;
field_list : IDF'='expr|field_list','IDF'='expr;
lvalue : IDF | lvalue'.'IDF|lvalue'['expr']';
functionCall : IDF'('expr_list?')';
assignement : lvalue':='expr;
ifthenelse : 'if 'expr'then'expr('else'expr)?;
whiledo : 'while'expr'do'expr;
for_:'for'IDF':='expr'to'expr'do'expr;
let_in_end : 'let'declaration_list'in'expr_seq?'end';

declaration_list :  declaration | declaration_list declaration;
declaration : type_declaration | variable_declaration | function_declaration;

type_declaration : 'type 'type_IDF'='type;
type : type_IDF|'{'type_fields*'}'|'array of 'type_IDF;
type_fields : type_field | type_fields','type_field;
type_field : IDF':'type_IDF;
type_IDF : IDF;

variable_declaration : 'var 'IDF':='expr |'var 'IDF':'type_IDF':='expr;
function_declaration : 'function' IDF '(' type_fields? ')' (':' type_IDF)? '=' expr; 

stdlib :print_|printi|flush_|exit_|getchar_|chr_|substring_|concat_|ord_|size_|not_;
print_ : 'print('expr')';
printi : 'printi('expr')';
flush_ : 'flush()';
exit_ : 'exit('expr')';
getchar_ : 'getchar()';
chr_ : 'chr('expr')';
substring_ : 'substring('expr_list')';
concat_ : 'concat('expr_list')';
ord_ : 'ord('expr')';
size_ : 'size('expr')';
not_ : 'not('expr')';

IDF : ('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|'_'|INT)*) ;
INT : '0'..'9'+;
STRING :  '"'(' '..'!'|'#'..'['|']'..'~'|'\\'('n'|'t'|'"'|'\\'|'^''@'..'_'|'0''0'..'9''0'..'9'|'1' ('0'..'1''0'..'9'|'2''0'..'7')|(' '|'\t'|'\n'|'\r'|'\f')+'\\'))*'"';
COMMENT : ('/*'.*?(COMMENT.*?)*?'*/');
WS : ('\n'|'\t'|' '|'\r'|'\f'|COMMENT)+ -> skip ; 
