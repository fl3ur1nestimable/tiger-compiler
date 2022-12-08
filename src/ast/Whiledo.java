package ast;

public class Whiledo implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast cond;
    public Ast doBlock;

    public Whiledo(Ast c, Ast d){
        this.cond=c;
        this.doBlock=d;
    }
}
