package ast;

public class Exit_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast exp;
    


    public Exit_(Ast exp){
        this.exp=exp;
    }
    
}
