package ast;

public class Exit_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast exp;
    public int line;


    public Exit_(Ast exp, int line){
        this.exp=exp;
    }
    
}
