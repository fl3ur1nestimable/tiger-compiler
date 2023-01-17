package ast;


public class Concat_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    public int line;
    
    public Concat_(Ast r, int line){
        this.right=r;
        this.line=line;
    }

}