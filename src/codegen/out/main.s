;    début programme: let in end
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
;    boucle for
	STMFD R13!,{R2,R4}     ;on empile les potentielles bornes du for précedent (s'il existe)
	STR R11,[R13,#-4]!     ;on empile l'ancienne base avant de la maj,chainage statique
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
	 MOV R4,R0     ;R4 borne minimale
	LDR R0,=3
	 MOV R2,R0     ;R2 borne maximale
for_0
	CMP R4,R2      ;si min > max arret de la boucle
	BGT end_for_0
;    boucle for
	STMFD R13!,{R2,R4}     ;on empile les potentielles bornes du for précedent (s'il existe)
	STR R11,[R13,#-4]!     ;on empile l'ancienne base avant de la maj,chainage statique
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
	 MOV R4,R0     ;R4 borne minimale
	LDR R0,=3
	 MOV R2,R0     ;R2 borne maximale
for_1
	CMP R4,R2      ;si min > max arret de la boucle
	BGT end_for_1
;    identifier
	MOV R3,#2    ;sinon, on utilise le chaînage statique (R3 contient NX-NY)
	LDR R10,[R11]
loop_chainage_statique_2
	SUBS R3,R3,#1 
	BEQ exit_chainage_statique_2    ; si on a remonté tout le chaînage statique
	LDR R10,[R10]
	B loop_chainage_statique_2
exit_chainage_statique_2
	LDR R0,[R10,#-4]
;    addition
;    identifier
	MOV R3,#1    ;sinon, on utilise le chaînage statique (R3 contient NX-NY)
	LDR R10,[R11]
loop_chainage_statique_3
	SUBS R3,R3,#1 
	BEQ exit_chainage_statique_3    ; si on a remonté tout le chaînage statique
	LDR R10,[R10]
	B loop_chainage_statique_3
exit_chainage_statique_3
	LDR R0,[R10,#-4]
	MOV R1,R0
;    identifier
	LDR R0,[R11,#-4]       ;si la variable est locale, on la met dans R0
	ADD R0,R1,R0
;    assignement
	MOV R3,#2   ;sinon, on utilise le chaînage statique (R3 contient NX-NY)
	LDR R10,[R11]
loop_chainage_statique_4
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_4
	LDR R10,[R10]
	B loop_chainage_statique_4
exit_chainage_statique_4
	STR R0,[R10,#-4]       ;on met 'au bon endroit' la valeur de R0 (l'affectation)
	ADD R4,R4,#1       ;incrémenter min
	STR R4,[R11,#-4]
	B for_1
end_for_1
;    dépiler le compteur et la base de la TDS du for
	LDMFD R13!,{R0,R11}
	LDMFD R13!,{R2,R4}
	ADD R4,R4,#1       ;incrémenter min
	STR R4,[R11,#-4]
	B for_0
end_for_0
;    dépiler le compteur et la base de la TDS du for
	LDMFD R13!,{R0,R11}
	LDMFD R13!,{R2,R4}
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
