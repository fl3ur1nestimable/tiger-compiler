package ast;

public class FunctionCall implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast right;
    public Ast left;
    public int line;
    public FunctionCall(Ast left, int line){
        this.left=left;
        this.line=line;
    }

    public FunctionCall(Ast left, Ast right, int line){
        this.left=left;
        this.right=right;
        this.line=line;
    }
}

