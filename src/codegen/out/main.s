;    début programme: let in end
	MOV R11,R13
	LDR R0,=0
	STR R0,[R13,#-4]!
	LDR R0,=2
	STR R0,[R13,#-4]!
	LDR R0,=0
	STR R0,[R13,#-4]!
;    if then else
;    <
;    identifier
	LDR R0,[R11,#-4]
	STR R0,[R13,#-4]!
	LDR R0,=3
	LDMFD R13!,{R1}
	MOV R2,R0
	MOV R0,#0
	CMP R1,R2
	MOVLT R0,#1
	STR R0,[R13,#-4]!
	CMP R0,#0
	BEQ endif_0
;    if then else
;    <
;    identifier
	LDR R0,[R11,#-4]
	STR R0,[R13,#-4]!
;    identifier
	LDR R0,[R11,#-8]
	LDMFD R13!,{R1}
	MOV R2,R0
	MOV R0,#0
	CMP R1,R2
	MOVLT R0,#1
	STR R0,[R13,#-4]!
	CMP R0,#0
	BEQ else_0
;    identifier
	LDR R0,[R11,#-12]
	LDR R0,=1
;    assignement
	STR R0,[R11,#-12]
	B endif_0
else_0
;    identifier
	LDR R0,[R11,#-12]
	LDR R0,=2
;    assignement
	STR R0,[R11,#-12]
endif_0
	LDMFD R13!,{R0}
endif_1
	LDMFD R13!,{R0}
prog_end
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
