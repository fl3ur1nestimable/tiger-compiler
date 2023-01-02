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

    @Override
    public String toString() {
        String str = "";
        str+=((Field)fields.get(0)).toString();
        for(int i=1;i<fields.size();i++){
            str+=", "+((Field)fields.get(i)).toString();
        }
        return str;
    }
    
}
