package ast;

import java.util.ArrayList;

public class Expr_seq implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> array;
    public Expr_seq(){
        array = new ArrayList<Ast>();
    }

    public void addExpr(Ast right){
        this.array.add(right);
    }
}
