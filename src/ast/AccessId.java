package ast;

public class AccessId implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast id;

    public AccessId(Ast id) {
        this.id = id;
    }
}
