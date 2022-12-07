package ast;

public class Let_in_end implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast block1;
    public Ast block2;

    public Let_in_end(Ast d){
        this.block1=d;
    }

    public Let_in_end(Ast d, Ast e){
        this.block1=d;
        this.block2=e;
    }
}
