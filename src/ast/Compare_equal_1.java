package ast;

public class Compare_equal_1 implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast rigth;
    public int line;

    public Compare_equal_1(Ast l, Ast r,int line){
        this.left=l;
        this.rigth=r;
        this.line=line;
    }
}
