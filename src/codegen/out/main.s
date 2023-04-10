	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
	LDR R0,=1
	STR R0,[R13,#-4]!
	LDR R0,=3
	STR R0,[R13,#-4]!
;    déclaration de fonction
	 B func_end_0
func_fib
	 STMFD R13!,{LR}
;    boucle for
	STR R11,[R13,#-4]!
	MOV R11,R13
	LDR R0,=2
	STR R0,[R13,#-4]!
	 MOV R4,R0
	MOV R3,#1
	LDR R10,[R11]
loop_chainage_statique_2
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_2
	LDR R10,[R10]
	B loop_chainage_statique_2
exit_chainage_statique_2
	LDR R0,[R10,#-4]
	 MOV R2,R0
for_1
	CMP R4,R2
	BGT end_for_1
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_3
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_3
	LDR R10,[R10]
	B loop_chainage_statique_3
exit_chainage_statique_3
	LDR R0,[R10,#-4]
;    soustraction
;    multiplication
	LDR R0,=3
	MOV R1,R0
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_4
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_4
	LDR R10,[R10]
	B loop_chainage_statique_4
exit_chainage_statique_4
	LDR R0,[R10,#-12]
	MOV R2,R0
	BL mul
	MOV R1,R0
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_5
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_5
	LDR R10,[R10]
	B loop_chainage_statique_5
exit_chainage_statique_5
	LDR R0,[R10,#-8]
	SUB R0,R1,R0
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_6
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_6
	LDR R10,[R10]
	B loop_chainage_statique_6
exit_chainage_statique_6
	STR R0,[R10,#-4]
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_7
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_7
	LDR R10,[R10]
	B loop_chainage_statique_7
exit_chainage_statique_7
	LDR R0,[R10,#-8]
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_8
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_8
	LDR R10,[R10]
	B loop_chainage_statique_8
exit_chainage_statique_8
	LDR R0,[R10,#-12]
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_9
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_9
	LDR R10,[R10]
	B loop_chainage_statique_9
exit_chainage_statique_9
	STR R0,[R10,#-8]
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_10
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_10
	LDR R10,[R10]
	B loop_chainage_statique_10
exit_chainage_statique_10
	LDR R0,[R10,#-12]
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_11
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_11
	LDR R10,[R10]
	B loop_chainage_statique_11
exit_chainage_statique_11
	LDR R0,[R10,#-4]
	MOV R3,#2
	LDR R10,[R11]
loop_chainage_statique_12
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_12
	LDR R10,[R10]
	B loop_chainage_statique_12
exit_chainage_statique_12
	STR R0,[R10,#-12]
	ADD R4,R4,#1
	STR R4,[R11,#-4]
	B for_1
end_for_1
;    dépiler le compteur et la base de la TDS du for
	LDMFD R13!,{R0,R11}
	MOV R3,#1
	LDR R10,[R11]
loop_chainage_statique_13
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_13
	LDR R10,[R10]
	B loop_chainage_statique_13
exit_chainage_statique_13
	LDR R0,[R10,#-4]
	LDMFD R13!,{PC}
func_end_0
	MOV R3,#1
	LDR R10,[R11]
loop_chainage_statique_14
	SUBS R3,R3,#1
	BEQ exit_chainage_statique_14
	LDR R10,[R10]
	B loop_chainage_statique_14
exit_chainage_statique_14
	LDR R0,[R10,#-4]
	STR R11,[R13,#-4]!
	MOV R11,R13
	LDR R0,=5
	 STR R0,[R13,#-4]!
	 BL func_fib
	 LDMFD R13!,{R12}
	 LDMFD R13!,{R11}
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