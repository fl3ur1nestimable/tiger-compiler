package ast;

public class Print_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
   
    public Ast expr;
    public int line;

    public Print_(Ast expr,int line){
        this.line=line;
        this.expr=expr;
    }
}
