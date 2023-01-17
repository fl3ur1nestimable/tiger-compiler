package ast;

public class Chr_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast exp;
    public int line;


    public Chr_(Ast exp, int line){
        this.exp=exp;
        this.line=line;
    }
    
}
