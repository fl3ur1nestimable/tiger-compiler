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
mult : (value|instruction) (('*' | '/') (value|instruction))*;

value : STRING #stringNode
        |INT #intNode
        |'nil' #nil
        |'break' #break_
        |'('expr_seq?')' #parentheses
        |IDF('{'field_list?'}'|'['expr'] of 'expr) #typeInstance;

instruction : lvalue
            |assignement 
            |negation 
            |ifthenelse 
            |whiledo 
            |for_ 
            |functionCall 
            |let_in_end 
            |stdlib ; 

negation :'-'expr ;
expr_seq : expr(';'expr)*; 
expr_list : expr(','expr)*;
field_list : field(','field)*;
field : IDF'='expr;
lvalue : IDF('.'IDF|'['expr']')*;
functionCall : IDF'('expr_list?')';
assignement : lvalue':='expr;
ifthenelse : 'if 'expr'then'expr('else'expr)?;
whiledo : 'while'expr'do'expr;
for_:'for'IDF':='expr'to'expr'do'expr;
let_in_end : 'let'declaration_list'in'expr_seq?'end';

declaration_list :  declaration+;
declaration : type_declaration | variable_declaration | function_declaration;

type_declaration : 'type 'IDF'='type;
type : IDF #identifier
        |'{'type_fields?'}' #typeDec1
        |'array of 'IDF #typeDec2 ;
type_fields : type_field(','type_field)*;
type_field : IDF':'IDF;

variable_declaration : 'var 'IDF(':'IDF)?':='expr;
function_declaration : 'function' IDF '(' type_fields? ')' (':' IDF)? '=' expr; 

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
