	MOV R11,R13
	LDR R0,=1
	STR R0,[R13],#-4
	LDR R0,=2
	STR R0,[R13],#-4
;    boucle for
	STR R11,[R13,#-4]!
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
	 MOV R1,R0
	LDR R0,=4
	 MOV R2,R0
for_0
	CMP R1,R2
	BGT end_for_0
	MOV R1,#1
	MOV R10,R11
loop_chainage_statique_1
	SUB R10,R10,#-8
	SUBS R1,R1,#1
	BNE loop_chainage_statique_1
	LDR R0,[R10,#-0]
;    addition
	MOV R1,#1
	MOV R10,R11
loop_chainage_statique_2
	SUB R10,R10,#-8
	SUBS R1,R1,#1
	BNE loop_chainage_statique_2
	LDR R0,[R10,#-0]
	MOV R1,R0
	LDR R0,=1
	ADD R0,R1,R0
	MOV R1,#1
	MOV R10,R11
loop_chainage_statique_3
	SUB R10,R10,#-8
	SUBS R1,R1,#1
	BNE loop_chainage_statique_3
	STR R0,[R10,#-0]
	ADD R1,R1,#1
	STR R1,[R11,#-4]
	B for_0
end_for_0
;    dépiler le compteur et la base de la TDS du for
	LDMFD R13!,{R0,R11}
	END
;    fin de programme : multiplication 

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

;    fin de programme : division 
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
