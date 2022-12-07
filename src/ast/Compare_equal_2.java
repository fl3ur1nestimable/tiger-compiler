package ast;

public class Compare_equal_2 implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;

    public Compare_equal_2(Ast l, Ast r){
        this.left=l;
        this.rigth=r;
    }
}
