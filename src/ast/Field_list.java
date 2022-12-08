package ast;

import java.util.ArrayList;

public class Field_list implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> fields;

    public Field_list() {
        this.fields = new ArrayList<Ast>();
    }

    public void add(Ast field) {
        this.fields.add(field);
    }
    
}
