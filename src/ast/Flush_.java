package ast;

public class Flush_ implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Flush_(){
        
    }
    
}
