package ast;

public class GreaterThan1  implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public GreaterThan1(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
