package ast;

import java.util.ArrayList;

public class Declaration_list implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> decList;

    public Declaration_list(){
        this.decList=new ArrayList<Ast>();
    }

    public void addDeclaration(Ast declaration){
        this.decList.add(declaration);
    }
}
