package ast;

public class Substring_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    public int line;
    
    public Substring_(Ast r,int line){
        this.right=r;
        this.line=line;
    }

}
