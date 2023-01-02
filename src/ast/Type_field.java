package ast;

public class Type_field implements Ast{
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast name;
    public Ast type;

    public Type_field(Ast name, Ast type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name.toString() + " : " + type.toString();
    }
    
}
