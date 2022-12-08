package ast;

public class Not_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    
    public Not_(Ast r){
        this.right=r;
    }

}