package ast;

public class RecordDec implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast id;
    public Ast list;

    public RecordDec(Ast id, Ast list) {
        this.id = id;
        this.list = list;
    }
}
