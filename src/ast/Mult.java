package ast;

public class Mult implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;
    public int line;

    public Mult(Ast l, Ast r, int line){
        this.left=l;
        this.rigth=r;
        this.line=line;
    }
}
