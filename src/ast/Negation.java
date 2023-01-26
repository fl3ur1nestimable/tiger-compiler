package ast;

public class Negation implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    public int line;
    
    public Negation(Ast r, int line){
        this.right=r;
        this.line=line;
    }
}
