package ast;

public class Type_declaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast idf;
    public Ast type;

    public Type_declaration(Ast idf, Ast type){
        this.idf=idf;
        this.type=type;
    }
    
}
