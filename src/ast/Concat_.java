package ast;


public class Concat_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    
    public Concat_(Ast r){
        this.right=r;
    }

}