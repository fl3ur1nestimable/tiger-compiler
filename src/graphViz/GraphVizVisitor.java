package graphViz;

import java.io.FileOutputStream;
import java.io.IOException;

import ast.*;

public class GraphVizVisitor implements AstVisitor<String> {

    private int state;
    private String nodeBuffer;
    private String linkBuffer;

    public GraphVizVisitor(){
        this.state = 0;
        this.nodeBuffer = "digraph \"ast\"{\n\n\tnodesep=1;\n\tranksep=1;\n\n";
        this.linkBuffer = "\n";
    }

    public void dumpGraph(String filepath) throws IOException{
            
        FileOutputStream output = new FileOutputStream(filepath);

        String buffer = this.nodeBuffer + this.linkBuffer;
        byte[] strToBytes = buffer.getBytes();

        output.write(strToBytes);

        output.close();

    }


    private String nextState(){
        int returnedState = this.state;
        this.state++;
        return "N"+ returnedState;
    }

    private void addTransition(String from,String dest){
        this.linkBuffer += String.format("\t%s -> %s; \n", from,dest);

    }

    private void addNode(String node,String label){
        this.nodeBuffer += String.format("\t%s [label=\"%s\", shape=\"box\"];\n", node,label);

    }

    @Override
    public String visit(Program program){
        String nodeIdentifier = this.nextState();//node de base
        String exprIdentifier = program.expr.accept(this);//nodes fils

        this.addNode(nodeIdentifier, "Program");//creer node principale
        this.addTransition(nodeIdentifier, exprIdentifier);//transition entre pere et fils
        return nodeIdentifier;
    }

    @Override
    public String visit(Or or){
        String nodeIdentifier = this.nextState();
        String leftIdentifier = or.left.accept(this);
        String rightIdentifier = or.rigth.accept(this);

        this.addNode(nodeIdentifier, "Or");
        this.addTransition(nodeIdentifier, rightIdentifier);
        this.addTransition(nodeIdentifier, leftIdentifier);

        return nodeIdentifier;
    }

    @Override
    public String visit(And and){
        String node = this.nextState();
        String leftIdentifier = and.left.accept(this);
        String rightIdentifier = and.rigth.accept(this);

        this.addNode(node, "And");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) {
        String node = this.nextState();
        String leftIdentifier = compare_equal_1.left.accept(this);
        String rightIdentifier = compare_equal_1.rigth.accept(this);

        this.addNode(node, "<>");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }
    
    @Override
    public String visit(Compare_equal_2 compare_equal_2) {
        String node = this.nextState();
        String leftIdentifier = compare_equal_2.left.accept(this);
        String rightIdentifier = compare_equal_2.rigth.accept(this);

        this.addNode(node, "=");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }


    @Override
    public String visit(GreaterThan1 greaterThan1) {
        String node = this.nextState();
        String leftIdentifier = greaterThan1.left.accept(this);
        String rightIdentifier = greaterThan1.rigth.accept(this);

        this.addNode(node, ">=");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }
    

    @Override
    public String visit(GreaterThan2 greaterThan2) {
        String node = this.nextState();
        String leftIdentifier = greaterThan2.left.accept(this);
        String rightIdentifier = greaterThan2.rigth.accept(this);

        this.addNode(node, ">");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        String node = this.nextState();
        String leftIdentifier = lessThan1.left.accept(this);
        String rightIdentifier = lessThan1.rigth.accept(this);

        this.addNode(node, "<=");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(LessThan2 lessThan2) {
        String node = this.nextState();
        String leftIdentifier = lessThan2.left.accept(this);
        String rightIdentifier = lessThan2.rigth.accept(this);

        this.addNode(node, "<");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Plus plus) {
        String node = this.nextState();
        String leftIdentifier = plus.left.accept(this);
        String rightIdentifier = plus.rigth.accept(this);

        this.addNode(node, "+");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Moins moins) {
        String node = this.nextState();
        String leftIdentifier = moins.left.accept(this);
        String rightIdentifier = moins.rigth.accept(this);

        this.addNode(node, "-");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Mult mult) {
        String node = this.nextState();
        String leftIdentifier = mult.left.accept(this);
        String rightIdentifier = mult.rigth.accept(this);

        this.addNode(node, "*");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Divide divide) {
        String node = this.nextState();
        String leftIdentifier = divide.left.accept(this);
        String rightIdentifier = divide.rigth.accept(this);

        this.addNode(node, "/");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Whiledo whiledo) {
        String node = this.nextState();
        String cond = whiledo.cond.accept(this);
        String block = whiledo.doBlock.accept(this);

        this.addNode(node, "WhileDo");
        this.addTransition(node, cond);
        this.addNode(node, block);

        return node;
    }

    @Override
    public String visit(For_ for_) {
        String node = this.nextState();
        String idf = for_.idf.accept(this);
        String e1 = for_.expr1.accept(this);
        String e2 = for_.expr2.accept(this);
        String e3 = for_.expr3.accept(this);

        this.addNode(node, "For");
        this.addTransition(node, idf);
        this.addTransition(node, e1);
        this.addTransition(node, e2);
        this.addTransition(node, e3);

        return node;
    }

    @Override
    public String visit(Identifier identifier) {
        String node = this.nextState();
        this.addNode(node, identifier.value);
        return node;
    }

    @Override
    public String visit(Let_in_end let_in_end) {
        String node = this.nextState();
        String dec = let_in_end.block1.accept(this);
        this.addNode(node, "Let_in_End");
        this.addTransition(node, dec);
        if (let_in_end.block2!=null) {
            String seq = let_in_end.block2.accept(this);
            this.addTransition(node, seq);
        }
        return node;
    }

    @Override
    public String visit(Declaration_list declaration_list) {
        String node = this.nextState();
        this.addNode(node, "decList");
        for (int i = 0; i < declaration_list.decList.size(); i++) {
            String dec = declaration_list.decList.get(i).accept(this);
            this.addTransition(node, dec);
        }
        return node;
    }

    @Override
    public String visit(Type_declaration type_declaration) {
        String node = this.nextState();
        this.addNode(node, "typeDec");
        String idfNode=type_declaration.idf.accept(this);
        String typeNode=type_declaration.type.accept(this);
        this.addTransition(node, idfNode);
        this.addTransition(node, typeNode);
        return node;
    }
    
    @Override
    public String visit(Expr_seq expr_seq) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(TypeDec1 typeDec1){
        String node = this.nextState();
        this.addNode(node, "typeDec1");
        String typeFields=typeDec1.typefields.accept(this);
        this.addTransition(node, typeFields);
        return node;
    }

    @Override
    public String visit(TypeDec2 typeDec2){
        String node = this.nextState();
        this.addNode(node, "typeDec2");
        String typeFields=typeDec2.idf.accept(this);
        this.addTransition(node, typeFields);
        return node;
    }

    @Override
    public String visit(Type_fields type_fields) {
        String node = this.nextState();
        this.addNode(node, "typeFields");
        for (int i = 0; i < type_fields.fields.size(); i++) {
            String typeField = type_fields.fields.get(i).accept(this);
            this.addTransition(node, typeField);
        }
        return node;
    }

    @Override
    public String visit(Type_field type_field) {
        String node = this.nextState();
        this.addNode(node, "typeField");
        String idfNode=type_field.name.accept(this);
        String typeNode=type_field.type.accept(this);
        this.addTransition(node, idfNode);
        this.addTransition(node, typeNode);
        return node;
    }

    @Override
    public String visit(Variable_declaration variable_declaration) {
        String node = this.nextState();
        this.addNode(node, "valDec");
        String idfNode=variable_declaration.name.accept(this);
        String exprNode=variable_declaration.expr.accept(this);
        this.addTransition(node, idfNode);
        this.addTransition(node, exprNode);
        if (variable_declaration.type!=null) {
            String typeNode=variable_declaration.type.accept(this);
            this.addTransition(node, typeNode);
        }
        return node;
    }

    @Override
    public String visit(Function_declaration function_declaration) {
        String node = this.nextState();
        this.addNode(node, "funcDec");
        String idfNode=function_declaration.name.accept(this);
        String bodyNOde = function_declaration.body.accept(this);
        this.addTransition(node, idfNode);
        this.addTransition(node, bodyNOde);
        if (function_declaration.return_type!=null) {
            String typeNode=function_declaration.return_type.accept(this);
            this.addTransition(node, typeNode);
        }
        if (function_declaration.paramsOrReturnType!=null) {
            String argsNode=function_declaration.paramsOrReturnType.accept(this);
            this.addTransition(node, argsNode);
        }
        return node;
        
    }

    @Override
    public String visit(Lvalue lvalue) {
        String node = this.nextState();
        this.addNode(node, "lvalue");
        for (int i = 0; i < lvalue.lvalues.size(); i++) {
            String lvalueNode = lvalue.lvalues.get(i).accept(this);
            this.addTransition(node, lvalueNode);
        }
        return node;
    }

    @Override
    public String visit(Field field){
        String node = this.nextState();
        this.addNode(node, "field");
        String nameNode  = field.name.accept(this);
        String exprNode = field.expr.accept(this);
        this.addTransition(node, nameNode);
        this.addTransition(node, exprNode);
        return node;
    }

    @Override
    public String visit(Field_list field_list){
        String node = this.nextState();
        this.addNode(node, "fieldList");
        for (int i = 0; i < field_list.fields.size(); i++) {
            String fieldNode = field_list.fields.get(i).accept(this);
            this.addTransition(node, fieldNode);
        }
        return node;
    }
    
    
}
