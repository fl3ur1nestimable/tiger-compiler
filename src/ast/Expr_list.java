package ast;

import java.util.ArrayList;

public class Expr_list implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> array;
    public int line;
    public Expr_list(int line){
        array = new ArrayList<Ast>();
        this.line=line;
    }

    public void addExpr(Ast right){
        this.array.add(right);
    }
}
