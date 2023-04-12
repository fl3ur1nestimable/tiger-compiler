;    début programme: let in end
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
;    déclaration de fonction
	B func_end_0     ;on saute la fonction si elle n'est pas appelée
func_carre
	STMFD R13!,{LR}   ;adresse de retour
;    multiplication
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	MOV R1,R0
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	MOV R2,R0
	BL mul     ;on branche vers le code commun pour toutes les multiplications
	LDMFD R13!,{PC}    ;on revient à l'adresse de retour
func_end_0
;    boucle while
;    <
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	STR R0,[R13,#-4]!
	LDR R0,=5
	LDMFD R13!,{R1}
	MOV R2,R0
	MOV R0,#0      ;on initialise le résultat à FALSE
	CMP R1,R2      ;si valeur de gauche > valeur de droite, R0=1
	MOVLT R0,#1
	STR R0,[R13,#-4]!    ;on empile la valeur dgge la condition, pour les imbrications
while_1
;    <
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	STR R0,[R13,#-4]!
	LDR R0,=5
	LDMFD R13!,{R1}
	MOV R2,R0
	MOV R0,#0      ;on initialise le résultat à FALSE
	CMP R1,R2      ;si valeur de gauche > valeur de droite, R0=1
	MOVLT R0,#1
	CMP R0,#0      ;on compare la valeur de la condition, si faux on branche à la fin
	BEQ end_while_1
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
;    addition
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	MOV R1,R0
	LDR R0,=1
	ADD R0,R1,R0
;    assignement
	STR R0,[R11,#-4]       ;si la variable est locale
	B while_1
end_while_1
	LDMFD R13!,{R0}
;    boucle for
	STMFD R13!,{R2,R4}     ;on empile les potentielles bornes du for précedent (s'il existe)
	STR R11,[R13,#-4]!     ;on empile l'ancienne base avant de la maj,chainage statique
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
	 MOV R4,R0     ;R4 borne minimale
	LDR R0,=3
	 MOV R2,R0     ;R2 borne maximale
for_2
	CMP R4,R2      ;si min > max arret de la boucle
	BGT end_for_2
;    boucle for
	STMFD R13!,{R2,R4}     ;on empile les potentielles bornes du for précedent (s'il existe)
	STR R11,[R13,#-4]!     ;on empile l'ancienne base avant de la maj,chainage statique
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
	 MOV R4,R0     ;R4 borne minimale
	LDR R0,=3
	 MOV R2,R0     ;R2 borne maximale
for_3
	CMP R4,R2      ;si min > max arret de la boucle
	BGT end_for_3
;    identifier
	MOV R3,#2    ;sinon, on utilise le chaînage statique (R3 contient NX-NY)
	LDR R10,[R11]
loop_chainage_statique_4
	SUBS R3,R3,#1 
	BEQ exit_chainage_statique_4    ; si on a remonté tout le chaînage statique
	LDR R10,[R10]
	B loop_chainage_statique_4
exit_chainage_statique_4
	LDR R0,[R10,#-4]
;    addition
;    identifier
	MOV R3,#1    ;sinon, on utilise le chaînage statique (R3 contient NX-NY)
	LDR R10,[R11]
loop_chainage_statique_5
	SUBS R3,R3,#1 
	BEQ exit_chainage_statique_5    ; si on a remonté tout le chaînage statique
	LDR R10,[R10]
	B loop_chainage_statique_5
exit_chainage_statique_5
	LDR R0,[R10,#-4]
	MOV R1,R0
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	ADD R0,R1,R0
;    assignement
	MOV R3,#2   ;sinon, on utilise le chaînage statique (R3 contient NX-NY)
	LDR R10,[R11]
loop_chainage_statique_6
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_6
	LDR R10,[R10]
	B loop_chainage_statique_6
exit_chainage_statique_6
	STR R0,[R10,#-4]       ;on met 'au bon endroit' la valeur de R0 (l'affectation)
	ADD R4,R4,#1       ;incrémenter min
	STR R4,[R11,#-4]
	B for_3
end_for_3
;    dépiler le compteur et la base de la TDS du for
	LDMFD R13!,{R0,R11}
	LDMFD R13!,{R2,R4}
	ADD R4,R4,#1       ;incrémenter min
	STR R4,[R11,#-4]
	B for_2
end_for_2
;    dépiler le compteur et la base de la TDS du for
	LDMFD R13!,{R0,R11}
	LDMFD R13!,{R2,R4}
;    if then else
;    <
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	STR R0,[R13,#-4]!
	LDR R0,=3
	LDMFD R13!,{R1}
	MOV R2,R0
	MOV R0,#0      ;on initialise le résultat à FALSE
	CMP R1,R2      ;si valeur de gauche > valeur de droite, R0=1
	MOVLT R0,#1
	STR R0,[R13,#-4]!      ; on empile la condition pour les prochains 'if' potentiels
	CMP R0,#0
	BEQ else_7     ;cas if=FALSE, on va directement au else
                       ;sinon, on fait le then
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	LDR R0,=8
;    assignement
	STR R0,[R11,#-4]       ;si la variable est locale
	B endif_7
else_7
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	LDR R0,=7
;    assignement
	STR R0,[R11,#-4]       ;si la variable est locale
endif_7
	LDMFD R13!,{R0}
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
;    appel de fonction
	STR R11,[R13,#-4]!
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	 STR R0,[R13,#-4]!     ;on empile tous les paramètres
	 BL func_carre     ;on se déplace au code de la fonction (et dans la TDS de la fonction)
	 LDMFD R13!,{R12}      ;on dépile les paramètres
	 LDMFD R13!,{R11}
;    assignement
	STR R0,[R11,#-4]       ;si la variable est locale
prog_end ;program end
	END
;multiplication 
mul
	STMFD R13!,{R1,R2,LR}
	MOV R0,#0
mul_loop
	LSRS R2,R2,#1
	ADDCS R0,R0,R1
	LSL R1,R1,#1
	TST R2,R2
	BNE mul_loop
	LDMFD R13!,{R1,R2,PC}

;division 
div
	STMFD R13!,{R2-R5,LR}
	MOV R0,#0
	MOV R3,#0
	CMP R1,#0
	RSBLT R1,R1,#0
	EORLT R3,R3,#1
	CMP R2,#0
	RSBLT R2,R2,#0
	EORLT R3,R3,#1
	MOV R4,R2
	MOV R5,#1
div_max
	LSL R4,R4,#1
	LSL R5,R5,#1
	CMP R4,R1
	BLE div_max
div_loop
	LSR R4,R4,#1
	LSR R5,R5,#1
	CMP R4,R1
	BGT div_loop
	ADD R0,R0,R5
	SUB R1,R1,R4
	CMP R1,R2
	BGE div_loop
	CMP R3,#1
	BNE div_end
	CMP R1,#0
	ADDNE R0,R0,#1
	RSB R0,R0,#0
	RSB R1,R1,#0
	ADDNE R1,R1,R2
div_end
	LDMFD R13!,{R2-R5,PC}
