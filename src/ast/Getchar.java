package ast;

public class Getchar implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Getchar(){
        
    }
    
}

