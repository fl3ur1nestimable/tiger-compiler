package ast;

public class Flush_ implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public int line;

    public Flush_(int line){
        this.line=line;
    }
    
}
