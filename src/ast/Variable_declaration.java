package ast;

public class Variable_declaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast name;
    public Ast type;
    public Ast expr;
    public int line;


    public Variable_declaration(Ast name, Ast type, Ast expr, int line) {
        this.name = name;
        this.type = type;
        this.expr = expr;
        this.line = line;
    }

    public Variable_declaration(Ast name, Ast expr, int line) {
        this.name = name;
        this.expr = expr;
        this.type = null;
        this.line=line;
    }
    
}
