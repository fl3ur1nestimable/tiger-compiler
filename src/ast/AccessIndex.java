package ast;

public class AccessIndex implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast rigth;
    public Ast left;

    public AccessIndex(Ast l, Ast r) {
        this.rigth=r;
        this.left=l;
    }

    @Override
    public String toString(){
        return left.toString()+rigth.toString();
    }
}
