package ast;

public class LessThan1  implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public LessThan1(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
