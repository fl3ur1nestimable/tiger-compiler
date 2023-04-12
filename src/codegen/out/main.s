;    début programme: let in end
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
;    déclaration de fonction
	 B func_end_0
func_myfunc
	 STMFD R13!,{LR}
;    identifier
	LDR R0,[R11,#-4]
;    addition
;    identifier
	LDR R0,[R11,#-4]
	MOV R1,R0
	LDR R0,=1
	ADD R0,R1,R0
;    assignement
	STR R0,[R11,#-4]
;    identifier
	LDR R0,[R11,#-4]
	LDMFD R13!,{PC}
func_end_0
;    identifier
	MOV R3,#1
	LDR R10,[R11]
loop_chainage_statique_1
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_1
	LDR R10,[R10]
	B loop_chainage_statique_1
exit_chainage_statique_1
	LDR R0,[R10,#-4]
;    appel de fonction
	STR R11,[R13,#-4]!
	MOV R11,R13
	LDR R0,=0
	 STR R0,[R13,#-4]!
	 BL func_myfunc
	 LDMFD R13!,{R12}
	 LDMFD R13!,{R11}
;    assignement
	STR R0,[R11,#-4]
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
null