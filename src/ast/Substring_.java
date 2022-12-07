package ast;

public class Substring_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    
    public Substring_(Ast r){
        this.right=r;
    }

}
