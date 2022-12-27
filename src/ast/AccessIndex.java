package ast;

public class AccessIndex implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast index;

    public AccessIndex(Ast index) {
        this.index = index;
    }
}
