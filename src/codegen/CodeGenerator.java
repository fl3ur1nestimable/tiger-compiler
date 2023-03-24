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

    public CodeGenerator(TdsCreator tdsCreator) {
        mainCode = "";
        this.tdsCreator = tdsCreator;
        this.currenTds = tdsCreator.tdsList.get(0);
    }

    public void write(String s) {
        mainCode += s + '\n';
    }

    public void saveCode() {
        // save code in file
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
        return null;
    }

    @Override
    public String visit(Or or) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Compare_equal_2 compare_equal_2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(GreaterThan1 greaterThan1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(GreaterThan2 greaterThan2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(LessThan2 lessThan2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Plus plus) {
        plus.left.accept(this);
        write("\tMOV R1,R0");
        plus.rigth.accept(this);

        write("\tADD R0,R1,R0");
        return null;
    }

    @Override
    public String visit(Moins moins) {
        moins.left.accept(this);
        write("\tMOV R1,R0");
        moins.rigth.accept(this);

        write("\tSUB R0,R1,R0");
        return null;
    }

    @Override
    public String visit(Mult mult) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public String visit(Divide divide) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    //
    @Override
    public String visit(Whiledo whiledo) {
        currentBlock++;
        currentImbrication++;
        Tds tds = getTds(currentBlock, currentImbrication);
        currenTds = tds;
        write("\tMOV R11,R13");

        currentBlock--;
        currentImbrication--;

        return null;
    }

    //
    @Override
    public String visit(For_ for_) {
        currentBlock++;
        currentImbrication++;
        Tds tds = getTds(currentBlock, currentImbrication);
        currenTds = tds;
        write("\tMOV R11,R13");

        currentBlock--;
        currentImbrication--;

        return null;

    }

    @Override
    public String visit(Identifier identifier) {
        String valeur = identifier.value;
        TdsVariable e = (TdsVariable) currenTds.getElement(valeur);
        int deplacement = e.getDeplacement();
        write("\tLDR R0,[R11,#-" + deplacement + "]");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
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
        Tds tds = getTds(currentBlock, currentImbrication);
        String v = assignement.left.accept(this);
        assignement.right.accept(this);
        TdsVariable e = (TdsVariable) tds.getElement(v);
        int deplacement = e.getDeplacement();
        // write("\tLDR R0,=" + value);
        write("\tSTR R0,[R11,#-" + deplacement + "]");

        return null;
    }

    @Override
    public String visit(IfThenElse ifthenelse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
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
        String value = variable_declaration.expr.accept(this);
        // String name = variable_declaration.name.accept(this);
        // TdsVariable e = (TdsVariable) currenTds.getElement(name);
        // int deplacement = e.getDeplacement();
        // ajout de la valeur au sommet de pile
        write("\tSTR R0,[R13],#-4");
        return null;
    }

    @Override
    public String visit(Function_declaration function_declaration) {
        currentBlock++;
        currentImbrication++;
        Tds tds = getTds(currentBlock, currentImbrication);
        currenTds = tds;

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
