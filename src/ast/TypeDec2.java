package ast;

public class TypeDec2 implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast idf;
    public int line;



    public TypeDec2(Ast idf, int line) {
        this.idf = idf;
        this.line = line;
    }
    
}
