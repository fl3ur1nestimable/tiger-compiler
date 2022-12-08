package ast;

public class Chr_ implements Ast{
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast exp;
    


    public Chr_(Ast exp){
        this.exp=exp;
    }
    
}
