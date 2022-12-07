package ast;

public class Identifier implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public String value;

    public Identifier(String v){
        this.value=v;
    }
}
