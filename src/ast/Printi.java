package ast;

public class Printi {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast expr;

    public Printi(Ast expr){
    
        this.expr=expr;
    }
    
}
