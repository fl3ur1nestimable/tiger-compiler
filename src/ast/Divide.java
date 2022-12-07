package ast;

public class Divide implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public Divide(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
