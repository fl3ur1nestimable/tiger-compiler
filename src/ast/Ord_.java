package ast;

public class Ord_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    public int line;
    
    public Ord_(Ast r, int line){
        this.right=r;
        this.line=line;
    }

}