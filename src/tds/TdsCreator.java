package tds;
import java.util.ArrayList;

import ast.*;

public class TdsCreator implements AstVisitor<Type> {
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
                System.out.println("\t"+element.toString());
            }
            System.out.println("------------------------");
        }
    }

    @Override
    public Type visit(Program affect) {
        affect.expr.accept(this);
        return null;
    }

    @Override
    public Type visit(Or or) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Flush_ flush_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Exit_ exit_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Getchar getchar) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Chr_ chr_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(And and) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Compare_equal_1 compare_equal_1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Compare_equal_2 compare_equal_2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(GreaterThan1 greaterThan1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(GreaterThan2 greaterThan2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(LessThan1 lessThan1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(LessThan2 lessThan2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Plus plus) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Moins moins) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Mult mult) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Divide divide) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Whiledo whiledo) {
        whiledo.cond.accept(this);
        whiledo.doBlock.accept(this);
        return null;
    }

    @Override
    public Type visit(For_ for_) {
        for_.expr2.accept(this);
        for_.expr3.accept(this);
        currentBlock++;
        currentImbrication++;
        Tds tds = new Tds("for", currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        for_.expr1.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return null;
    }

    @Override
    public Type visit(Identifier identifier) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Expr_seq expr_seq) {
        for (Ast expr : expr_seq.array) {
            expr.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(Declaration_list declaration_list) {
        for (Ast declaration : declaration_list.decList) {
            declaration.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(Let_in_end let_in_end) {
        currentBlock++;
        currentImbrication++;
        Tds tds = new Tds("let", currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        let_in_end.block1.accept(this);
        let_in_end.block2.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return null;
    }

    @Override
    public Type visit(Type_declaration type_declaration) {
        
        return null;
    }

    @Override
    public Type visit(StringNode string_node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(IntNode int_node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Nil nil) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Break_ break_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Print_ print_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Printi printi) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Negation negation) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Expr_list expr_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(FunctionCall functionCall) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Assignement assignement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(IfThenElse ifthenelse) {
        ifthenelse.left.accept(this);
        ifthenelse.middle.accept(this);
        if(ifthenelse.right!=null){
            ifthenelse.right.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(Substring_ substring) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Concat_ concat_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Ord_ ord_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Size_ size_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Not_ not_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(TypeDec1 typeDec1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(TypeDec2 typeDec2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Type_fields type_fields) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Type_field type_field) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Variable_declaration variable_declaration) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Function_declaration function_declaration) {
        currentBlock++;
        currentImbrication++;
        currentTds.addElement(new TdsFunction(((Identifier)function_declaration.name).value,null, null, currentTds));
        Tds tds = new Tds("function_" + ((Identifier)function_declaration.name).value, currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        function_declaration.body.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return null;
    }

    @Override
    public Type visit(Field field) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Field_list field_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(Lvalue lvalue) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(AccessId accessId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(AccessIndex accessIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(RecordDec recordDec) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type visit(ArrayDec arrayDec) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
