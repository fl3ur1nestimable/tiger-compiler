package ast;

import java.util.ArrayList;

public class Type_fields implements Ast {
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> fields;

    public Type_fields() {
        this.fields = new ArrayList<Ast>();
    }

    public void addType_field(Ast field) {
        this.fields.add(field);
    }
    
}
