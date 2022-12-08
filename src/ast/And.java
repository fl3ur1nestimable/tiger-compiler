package ast;

public class And implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public And(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
