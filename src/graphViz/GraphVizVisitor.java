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
    public String visit(Flush_ flush_) {
        String node = this.nextState();
        this.addNode(node, "flush()");
        return node;
    }

    @Override
    public String visit(Exit_ exit_) {
        String node = this.nextState();
        this.addNode(node, "exit()");
        String exp = exit_.exp.accept(this);
        this.addTransition(node, exp);
        return node;
    }

    @Override
    public String visit(Getchar getchar) {
        String node = this.nextState();
        this.addNode(node, "getchar()");
        return node;
    }

    @Override
    public String visit(Chr_ chr_) {
        String node = this.nextState();
        this.addNode(node, "chr()");
        String exp = chr_.exp.accept(this);
        this.addTransition(node, exp);
        return node;
    }


}
