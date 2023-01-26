package ast;

public class Printi implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast expr;
    public int line;

    public Printi(Ast expr, int line){
        this.line=line;
        this.expr=expr;
    }
    
}
