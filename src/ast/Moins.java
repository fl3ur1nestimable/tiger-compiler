package ast;

public class Moins implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public Moins(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
