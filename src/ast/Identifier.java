package ast;

public class Identifier implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public String value;
    public int line;

    public Identifier(String v, int line){
        this.value=v;
        this.line=line;
    }

    @Override
    public String toString() {
        return value;
    }
}
