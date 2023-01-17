package ast;

import java.util.ArrayList;

public class Type_fields implements Ast {
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> fields;
    public int line;

    public Type_fields(int line) {
        this.fields = new ArrayList<Ast>();
        this.line=line;
    }

    public void addType_field(Ast field) {
        this.fields.add(field);
    }

    @Override
    public String toString() {
        String str = "";
        str+=((Type_field)fields.get(0)).toString();
        for(int i=1;i<fields.size();i++){
            str+=", "+((Type_field)fields.get(i)).toString();
        }
        return str;
    }
    
}
