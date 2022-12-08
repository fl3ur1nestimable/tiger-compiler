package ast;

public class Print_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
   
    public Ast expr;

    public Print_(Ast expr){
     
        this.expr=expr;
    }
}
