package ast;

public class Field implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast name;
    public Ast expr;

    public Field(Ast name, Ast expr) {
        this.name = name;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return name.toString()+ " : " + expr.toString() ;
    }
    
}
