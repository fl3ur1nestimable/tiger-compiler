package ast;

public class Size_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    
    public Size_(Ast r){
        this.right=r;
    }

}