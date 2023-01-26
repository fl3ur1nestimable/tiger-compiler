package ast;

public class RecordDec implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast id;
    public Ast list;
    public int line;

    public RecordDec(Ast id, Ast list, int line) {
        this.id = id;
        this.list = list;
        this.line=line;
    }
}
