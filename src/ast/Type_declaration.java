package ast;

public class Type_declaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast idf;
    public Ast type;
    public int line;

    public Type_declaration(Ast idf, Ast type, int line){
        this.idf=idf;
        this.type=type;
        this.line=line;
    }
    
}
