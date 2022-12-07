package ast;

public class Ord_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    
    public Ord_(Ast r){
        this.right=r;
    }

}