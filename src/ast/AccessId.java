package ast;

public class AccessId implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast rigth;
    public Ast left;
    public int line;

    public AccessId(Ast l, Ast r,int line) {
        this.rigth=r;
        this.left=l;
        this.line=line;
    }

    @Override
    public String toString(){
        return left.toString()+rigth.toString();
    }
}
