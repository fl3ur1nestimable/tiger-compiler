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
            return node;
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
    public String visit(StringNode string_node){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,string_node.value);

        return nodeIdentifier;
    }
    @Override
    public String visit(IntNode int_node){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,String.valueOf(int_node.value));

        return nodeIdentifier;
    }
    @Override
    public String visit(Nil nil){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,"nil");

        return nodeIdentifier;
    }

    public String visit(Break_ break_){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,"break");

        return nodeIdentifier;
    }

    public String visit(TypeInstance type_instance){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,type_instance.id);

        if (type_instance.liste_field!=null){
            String liste_field=type_instance.liste_field.accept(this);
            this.addNode(nodeIdentifier, liste_field);
            return nodeIdentifier;
        }
        else{
            String expr1=type_instance.expr1.accept(this);
            String expr2=type_instance.expr2.accept(this);
            this.addNode(nodeIdentifier, expr1);
            this.addNode(nodeIdentifier, expr2);
            return nodeIdentifier ;
        }

    }
    
    
}
