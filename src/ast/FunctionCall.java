package ast;

public class FunctionCall implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    public Ast left;
    public FunctionCall(Ast left){
        this.left=left;
    }

    public FunctionCall(Ast left, Ast right){
        this.left=left;
        this.right=right;
    }
}

