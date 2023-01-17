package ast;

public class Let_in_end implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast block1;
    public Ast block2;
    public int line;

    public Let_in_end(Ast d, int line){
        this.block1=d;
        this.line=line;
    }

    public Let_in_end(Ast d, Ast e, int line){
        this.block1=d;
        this.block2=e;
        this.line=line;
    }
}
