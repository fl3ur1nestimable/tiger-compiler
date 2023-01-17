package ast;

public class For_ implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast idf;
    public Ast expr1;
    public Ast expr2;
    public Ast expr3;
    public int line;

    public For_(Ast idf, Ast e1, Ast e2, Ast e3, int line){
        this.idf=idf;
        this.expr1=e1;
        this.expr2=e2;
        this.expr3=e3;
        this.line=line;
    }
}
