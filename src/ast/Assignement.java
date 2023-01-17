package ast;

public class Assignement implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    public Ast left;
    public int line;

    public Assignement(Ast left, Ast right, int line){
        this.left=left;
        this.right=right;
        this.line=line;
    }

}
