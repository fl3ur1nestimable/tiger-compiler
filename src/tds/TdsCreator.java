package tds;
import java.util.ArrayList;

import ast.*;

public class TdsCreator implements AstVisitor<Void> {
    private int currentImbrication = 0;
    private int currentBlock = 0;
    private ArrayList<Tds> tdsList = new ArrayList<Tds>();
    private Tds currentTds;

    public TdsCreator() {
        currentTds = new Tds("global", currentBlock, currentImbrication, null);
        tdsList.add(currentTds);
    }

    public void addTds(Tds tds) {
        tdsList.add(tds);
    }

    public ArrayList<Tds> getTdsList() {
        return tdsList;
    }

    public Tds getCurrentTds() {
        return currentTds;
    }

    public void setCurrentTds(Tds currentTds) {
        this.currentTds = currentTds;
    }

    public int getCurrentImbrication() {
        return currentImbrication;
    }

    public void setCurrentImbrication(int currentImbrication) {
        this.currentImbrication = currentImbrication;
    }

    public int getCurrentBlock() {
        return currentBlock;
    }

    public void setCurrentBlock(int currentBlock) {
        this.currentBlock = currentBlock;
    }

    public void printAll(){
        for (Tds tds : tdsList) {
            System.out.println(tds.getName());
            for (TdsElement element : tds.getElements()) {
                System.out.println(element.toString());
            }
        }
    }

    @Override
    public Void visit(Program affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Or or) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Flush_ flush_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Exit_ exit_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Getchar getchar) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Chr_ chr_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(And and) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Compare_equal_1 compare_equal_1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Compare_equal_2 compare_equal_2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(GreaterThan1 greaterThan1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(GreaterThan2 greaterThan2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(LessThan1 lessThan1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(LessThan2 lessThan2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Plus plus) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Moins moins) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Mult mult) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Divide divide) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Whiledo whiledo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(For_ for_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Expr_seq expr_seq) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Declaration_list declaration_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Let_in_end let_in_end) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Type_declaration type_declaration) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(StringNode string_node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(IntNode int_node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Nil nil) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Break_ break_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(TypeInstance type_instance) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Print_ print_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Printi printi) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Negation negation) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Expr_list expr_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Assignement assignement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(IfThenElse ifthenelse) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Substring_ substring) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Concat_ concat_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Ord_ ord_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Size_ size_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Not_ not_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(TypeDec1 typeDec1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(TypeDec2 typeDec2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Type_fields type_fields) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Type_field type_field) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Variable_declaration variable_declaration) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Function_declaration function_declaration) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Field field) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Field_list field_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Void visit(Lvalue lvalue) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
