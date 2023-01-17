package ast;

public class IfThenElse implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast right;
    public Ast middle;
    public Ast left;
    public int line;

    public IfThenElse(Ast left, Ast middle, int line){
        this.left=left;
        this.middle=middle;
        this.right=null;
        this.line=line;
    }

    public IfThenElse(Ast left, Ast middle, Ast right, int line){
        this.left=left;
        this.middle=middle;
        this.right=right;
        this.line=line;

    }
    
}
