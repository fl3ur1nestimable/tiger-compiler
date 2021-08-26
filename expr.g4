grammar expr;


//program : ACOMPLETER ;

exp : INT (('+'|'-'|'*'|'/') INT)* ;



INT : ('0'..'9')+;

