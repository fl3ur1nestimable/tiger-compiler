package ast;

public class IfThenElse implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast right;
    public Ast middle;
    public Ast left;

    public IfThenElse(Ast left, Ast middle){
        this.left=left;
        this.middle=middle;
    }

    public IfThenElse(Ast left, Ast middle, Ast right){
        this.left=left;
        this.middle=middle;
        this.right=right;

    }
    
}
