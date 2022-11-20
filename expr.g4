grammar expr;
@header{
    package parser;
}

program : (instruction)+ EOF ;

exp : (IDF|INT) (('+'|'-'|'*'|'/') (IDF|INT))* ;

if_ : 'if ('condition') {' instruction+ '}' ('else {' instruction+ '}')? ;

print_: 'print'(IDF|exp)';';

affectation : IDF'='(IDF|exp)';' ;

instruction : (affectation|if_|print_) ;

condition : (IDF|exp) ;

IDF : ('a'..'z'|'A'..'Z'|'_')(('a'..'z'|'A'..'Z'|'_'|INT)*) ;

INT : ('0'..'9')+;

WS : ('\n'|'\t'|' '|'\r')+ -> skip ; 

declaration_list : declaration ;

declaration : (type_declaration | variable_declaration | function_declaration) ;

type_declaration : type type_id ' =' type ;

type : 

type_fields :

typed_field : 

variable_declaration : 

function_declaration : 