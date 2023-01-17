package ast;

public class Break_ implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int line;
    public Break_(int line){
        this.line=line;
    }
}
