package ast;

public class Program implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expr;
    public int line;

    public Program(Ast e, int line){
        this.expr=e;
        this.line=line;
    }
}
