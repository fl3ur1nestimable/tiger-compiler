package ast;

public class IntNode implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int value;
    public int line;

    public IntNode(int value, int line){
        this.value=value;
    }
    
}
