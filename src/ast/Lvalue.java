package ast;

import java.util.ArrayList;

public class Lvalue implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> lvalues;

    public Lvalue() {
        this.lvalues = new ArrayList<Ast>();
    }
    
    public void add(Ast lvalue) {
        this.lvalues.add(lvalue);
    }
}
