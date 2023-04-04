package codegen;

import tds.*;

import java.nio.file.Files;
import java.nio.file.Path;

import ast.*;

public class CodeGenerator implements AstVisitor<String> {

    public String mainCode;
    public TdsCreator tdsCreator;
    public Tds currenTds;
    public int currentImbrication = 0;
    public int currentBlock = 0;
    public int id = 0;
    public boolean muldone = false;

    public CodeGenerator(TdsCreator tdsCreator) {
        mainCode = "";
        this.tdsCreator = tdsCreator;
        this.currenTds = tdsCreator.tdsList.get(0);
    }

    public void write(String s) {
        mainCode += s + '\n';
    }

    public void addOp() {
        write(";    fin de programme : multiplication ");
        write("");
        write("mul");
        write("\tSTMFD R13!,{R1,R2,LR}");
        write("\tMOV R0,#0");
        write("mul_loop");
        write("\tLSRS R2,R2,#1");
        write("\tADDCS R0,R0,R1");
        write("\tLSL R1,R1,#1");
        write("\tTST R2,R2");
        write("\tBNE mul_loop");
        write("\tLDMFD R13!,{R1,R2,PC}");
        write("");

        write(";    fin de programme : division ");
        write("div");
        write("\tSTMFD R13!,{R2-R5,LR}");
        write("\tMOV R0,#0");
        write("\tMOV R3,#0");
        write("\tCMP R1,#0");
        write("\tRSBLT R1,R1,#0");
        write("\tEORLT R3,R3,#1");
        write("\tCMP R2,#0");
        write("\tRSBLT R2,R2,#0");
        write("\tEORLT R3,R3,#1");
        write("\tMOV R4,R2");
        write("\tMOV R5,#1");
        write("div_max");
        write("\tLSL R4,R4,#1");
        write("\tLSL R5,R5,#1");
        write("\tCMP R4,R1");
        write("\tBLE div_max");
        write("div_loop");
        write("\tLSR R4,R4,#1");
        write("\tLSR R5,R5,#1");
        write("\tCMP R4,R1");
        write("\tBGT div_loop");
        write("\tADD R0,R0,R5");
        write("\tSUB R1,R1,R4");
        write("\tCMP R1,R2");
        write("\tBGE div_loop");
        write("\tCMP R3,#1");
        write("\tBNE div_end");
        write("\tCMP R1,#0");
        write("\tADDNE R0,R0,#1");
        write("\tRSB R0,R0,#0");
        write("\tRSB R1,R1,#0");
        write("\tADDNE R1,R1,R2");
        write("div_end");
        write("\tLDMFD R13!,{R2-R5,PC}");
    }

    public void saveCode() {
        // save code in file
        addOp();
        Path path = Path.of("./src/codegen/out/main.s");
        try {
            Files.writeString(path, mainCode);
        } catch (Exception e) {
            System.out.println("Error while writing file");
        }
    }

    public Tds getTds(int bloc, int imbrication) {
        for (Tds tds : tdsCreator.tdsList) {
            if (tds.getNumBloc() == bloc && tds.getNumImbrication() == imbrication) {
                return tds;
            }
        }
        return null;
    }

    public String convertHexa(String s) {
        String hexa = "0x";
        for (int i = 0; i < s.length(); i++) {
            hexa += Integer.toHexString(s.charAt(i));
        }
        return hexa;
    }

    @Override
    public String visit(Program affect) {
        affect.expr.accept(this);
        write("\tEND");
        return null;
    }

    @Override
    public String visit(Or or) {
        write(";    or");
        or.left.accept(this);
        write("\tSTR R0,[R13,#-4]!");
        or.rigth.accept(this);
        write("\tLDMFD R13!,{R1}");
        write("\tMOV R2,R0");
        write("\tMOV R0,#0"); // on met 0 dans RO juste avant le OR, si TRUE alors ramplacé par 1
        write("\tCMP R1,#0"); // si c'est superieur à 0
        write("\tMOVGT R0,#1");
        write("\tCMP R2,#0"); // si c'est superieur à 0
        write("\tMOVGT R0,#1");
        return null;
    }

    @Override
    public String visit(Flush_ flush_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Exit_ exit_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Getchar getchar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Chr_ chr_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(And and) {
        write(";    and");
        and.left.accept(this);
        write("\tSTR R0,[R13,#-4]!");
        and.rigth.accept(this);
        write("\tLDMFD R13!,{R1}");
        write("\tMOV R2,R0");
        write("\tCMP R1,#0"); // si c'est superieur à 0
        write("\tMOVGT R0,#1");
        write("\tCMP R2,#0"); // si c'est superieur à 0
        write("\tMOVEQ R0,#0");
        return null;
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) { // <>
        write(";    <>");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Compare_equal_2 compare_equal_2) { // =
        write(";    =");

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(GreaterThan1 greaterThan1) { // >= question: est-ce qu'on peut écrire a >2 > 3 ? (car a>2
        write(";    >=");
        greaterThan1.left.accept(this); // sinon pas la peine utiliser pile, on oeut direct utiliser R et R2
        write("\tSTR R0,[R13,#-4]!");
        greaterThan1.rigth.accept(this);
        write("\tLDMFD R13!,{R1}");
        write("\tMOV R2,R0");
        write("\tMOV R0,#0");
        write("\tCMP R1,R2");
        write("\tMOVGT R0,#1");
        write("\tCMP R1,R2");
        write("\tMOVEQ R0,R2");
        return null;
    }

    @Override
    public String visit(GreaterThan2 greaterThan2) { // >
        write(";    >");
        greaterThan2.left.accept(this);
        write("\tSTR R0,[R13,#-4]!");
        greaterThan2.rigth.accept(this);
        write("\tLDMFD R13!,{R1}");
        write("\tMOV R2,R0");
        write("\tMOV R0,#0");
        write("\tCMP R1,R2");
        write("\tMOVGT R0,#1");
        return null;
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        write(";    <=");
        lessThan1.left.accept(this);
        write("\tSTR R0,[R13,#-4]!");
        lessThan1.rigth.accept(this);
        write("\tLDMFD R13!,{R1}");
        write("\tMOV R2,R0");
        write("\tMOV R0,#0");
        write("\tCMP R1,R2");
        write("\tMOVLE R0,#1");
        return null;

    }

    @Override
    public String visit(LessThan2 lessThan2) {
        write(";    <");
        lessThan2.left.accept(this);
        write("\tSTR R0,[R13,#-4]!");
        lessThan2.rigth.accept(this);
        write("\tLDMFD R13!,{R1}");
        write("\tMOV R2,R0");
        write("\tMOV R0,#0");
        write("\tCMP R1,R2");
        write("\tMOVLT R0,#1");
        return null;
    }

    @Override
    public String visit(Plus plus) {
        write(";    addition");
        plus.left.accept(this);
        write("\tMOV R1,R0");
        plus.rigth.accept(this);
        write("\tADD R0,R1,R0");
        return null;
    }

    @Override
    public String visit(Moins moins) {
        write(";    soustraction");
        moins.left.accept(this);
        write("\tMOV R1,R0");
        moins.rigth.accept(this);
        write("\tSUB R0,R1,R0");
        return null;
    }

    @Override
    public String visit(Mult mult) {
        write(";    multiplication");
        mult.left.accept(this);
        write("\tMOV R1,R0");
        mult.rigth.accept(this);
        write("\tMOV R2,R0");
        write("\tBL mul");
        return null;
    }

    @Override
    public String visit(Divide divide) {
        write(";    division");
        divide.left.accept(this);
        write("\tMOV R1,R0");
        divide.rigth.accept(this);
        write("\tMOV R2,R0");
        write("\tBL div");
        return null;
    }

    //
    @Override
    public String visit(Whiledo whiledo) {
        write(";    boucle while");
        write("while_" + id);
        whiledo.cond.accept(this);
        write("\tCMP R0,#0");
        write("\tBEQ end_while_" + id);
        whiledo.doBlock.accept(this);
        write("\tB while_" + id);
        write("end_while_" + id);
        id++;
        return null;
    }

    //
    @Override
    public String visit(For_ for_) {
        int idbis = id;
        id++;
        currentBlock++;
        currentImbrication++;
        Tds tds = getTds(currentBlock, currentImbrication);
        currenTds = tds;
        write(";    boucle for");
        write("\tSTR R11,[R13,#-4]!");
        write("\tMOV R11,R13");
        for_.expr1.accept(this);
        write("\tSTR R0,[R13,#-4]!");
        write("\t MOV R1,R0");
        for_.expr2.accept(this);
        write("\t MOV R2,R0");
        write("for_" + idbis);
        write("\tCMP R1,R2");
        write("\tBGT end_for_" + idbis);
        for_.expr3.accept(this);
        write("\tADD R1,R1,#1");
        write("\tSTR R1,[R11,#-4]");
        write("\tB for_" + idbis);
        write("end_for_" + idbis);
        write(";    dépiler le compteur et la base de la TDS du for");
        write("\tLDMFD R13!,{R0,R11}");
        currentBlock--;
        currentImbrication--;
        currenTds = getTds(currentBlock, currentImbrication);
        return null;

    }

    @Override
    public String visit(Identifier identifier) {
        int nx = currenTds.getNumImbrication();
        int ny = nx - 1;
        String valeur = identifier.value;
        TdsVariable e = (TdsVariable) currenTds.getElement(valeur);
        if (e != null) {
            int deplacement = e.getDeplacement();
            write("\tLDR R0,[R11,#-" + deplacement + "]");
        } else {
            Tds parent = currenTds.getParent();
            int deplacement = 0;
            while (parent != null) {
                e = (TdsVariable) parent.getElement(valeur);
                if (e != null) {
                    deplacement = e.getDeplacement();
                    break;
                }
                parent = parent.getParent();
                ny--;
            }
            write("\tMOV R1,#" + Integer.toString(nx - ny));
            write("\tMOV R10,R11");
            write("loop_chainage_statique_" + id);
            write("\tSUB R10,R10,#-8");
            write("\tSUBS R1,R1,#1");
            write("\tBNE loop_chainage_statique_" + id);
            write("\tLDR R0,[R10,#-" + deplacement + "]");
            id++;
        }
        return identifier.value;
    }

    @Override
    public String visit(Expr_seq expr_seq) {
        for (Ast a : expr_seq.array) {
            a.accept(this);
        }
        return null;
    }

    @Override
    public String visit(Declaration_list declaration_list) {
        for (Ast a : declaration_list.decList) {
            a.accept(this);
        }
        return null;
    }

    //
    @Override
    public String visit(Let_in_end let_in_end) {
        currentBlock++;
        currentImbrication++;
        Tds tds = getTds(currentBlock, currentImbrication);
        currenTds = tds;
        write("\tMOV R11,R13");

        let_in_end.block1.accept(this);
        if (let_in_end.block2 != null) {
            let_in_end.block2.accept(this);

        }
        currentBlock--;
        currentImbrication--;
        return null;
    }

    @Override
    public String visit(Type_declaration type_declaration) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(StringNode string_node) {
        // System.out.println(convertHexa(string_node.value.replace("\"", "")));
        write("\tLDR R0,=" + convertHexa(string_node.value.replace("\"", "")));
        return null;
    }

    @Override
    public String visit(IntNode int_node) {
        write("\tLDR R0,=" + int_node.value);
        return null;
    }

    @Override
    public String visit(Nil nil) {
        return "0";
    }

    // - ??? vu qu'on sort du while ?
    @Override
    public String visit(Break_ break_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Print_ print_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Printi printi) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Negation negation) {
        negation.right.accept(this);
        write("\tRSB R0, R0, #0");
        return null;
    }

    public String visit(Expr_list expr_list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(FunctionCall functionCall) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Assignement assignement) {
        int nx = currenTds.getNumImbrication();
        int ny = nx - 1;
        Tds tds = getTds(currentBlock, currentImbrication);
        String v = assignement.left.accept(this);
        assignement.right.accept(this);
        TdsVariable e = (TdsVariable) tds.getElement(v);
        if (e != null) {
            int deplacement = e.getDeplacement();
            write("\tSTR R0,[R11,#-" + deplacement + "]");
        } else {
            Tds parent = currenTds.getParent();
            int deplacement = 0;
            while (parent != null) {
                e = (TdsVariable) parent.getElement(v);
                if (e != null) {
                    deplacement = e.getDeplacement();
                    break;
                }
                parent = parent.getParent();
                ny--;
            }
            write("\tMOV R1,#" + Integer.toString(nx - ny));
            write("\tMOV R10,R11");
            write("loop_chainage_statique_" + id);
            write("\tSUB R10,R10,#-8");
            write("\tSUBS R1,R1,#1");
            write("\tBNE loop_chainage_statique_" + id);
            write("\tSTR R0,[R10,#-" + deplacement + "]");
            id++;
        }

        return null;
    }

    @Override
    public String visit(IfThenElse ifthenelse) {
        ifthenelse.left.accept(this);
        write("\tCMP R0,#0");
        if (ifthenelse.right != null) {
            write("\tBEQ else_" + id);
            ifthenelse.middle.accept(this);
            write("\tB endif_" + id);
            write("else_" + id);
            ifthenelse.right.accept(this);
        } else {
            write("\tBEQ endif_" + id);
            ifthenelse.middle.accept(this);
        }
        write("endif_" + id);
        id++;
        return null;
    }

    @Override
    public String visit(Substring_ substring) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Concat_ concat_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Ord_ ord_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Size_ size_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Not_ not_) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(TypeDec1 typeDec1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(TypeDec2 typeDec2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Type_fields type_fields) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Type_field type_field) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Variable_declaration variable_declaration) {
        variable_declaration.expr.accept(this);
        write("\tSTR R0,[R13],#-4");
        return null;
    }

    @Override
    public String visit(Function_declaration function_declaration) {
        currentBlock++;
        currentImbrication++;
        Tds tds = getTds(currentBlock, currentImbrication);
        currenTds = tds;
        write(";    déclaration de fonction");
        write("\tMOV R11,R13");
        if (function_declaration.paramsOrReturnType.accept(this) != null) {
            function_declaration.paramsOrReturnType.accept(this);
            write("\tSTR R0,[R13],#-4");
        }
        if (function_declaration.return_type.accept(this) != null) {
            function_declaration.return_type.accept(this);
            write("\tSTR R0,[R13],#-4");
        }
        write("\t");

        currentBlock--;
        currentImbrication--;
        return null;
    }

    @Override
    public String visit(Field field) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Field_list field_list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(AccessId accessId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(AccessIndex accessIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(RecordDec recordDec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(ArrayDec arrayDec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

}
