package ast;

public class GreaterThan2  implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public GreaterThan2(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
