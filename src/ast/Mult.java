package ast;

public class Mult implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public Mult(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
