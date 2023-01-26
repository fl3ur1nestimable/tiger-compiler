package ast;

public class Field implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast name;
    public Ast expr;
    public int line;

    public Field(Ast name, Ast expr, int line) {
        this.name = name;
        this.expr = expr;
        this.line = line;
    }

    @Override
    public String toString() {
        return name.toString()+ " : " + expr.toString() ;
    }
    
}
