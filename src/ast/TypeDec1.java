package ast;

public class TypeDec1 implements Ast{
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast typefields;
    public int line;

    public TypeDec1(Ast typefields,int line){
        this.typefields = typefields;
        this.line = line;
    }
}
