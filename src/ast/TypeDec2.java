package ast;

public class TypeDec2 implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast idf;

    public TypeDec2(Ast idf) {
        this.idf = idf;
    }
    
}
