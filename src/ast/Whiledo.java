package ast;

public class Whiledo implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast cond;
    public Ast doBlock;
    public int line;


    public Whiledo(Ast c, Ast d, int line){
        this.cond=c;
        this.doBlock=d;
        this.line=line;
    }
}
