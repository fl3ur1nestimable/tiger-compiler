package ast;

public class TypeInstance implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public String id;
    public Ast liste_field;
    public Ast expr1;
    public Ast expr2;
    public TypeInstance(String id){
        this.id=id;
    }
    public TypeInstance(String id,Ast lf){
        this.id=id;
        this.liste_field=lf;
    }
    public TypeInstance(String id,Ast expr1,Ast expr2){
        this.id=id;
        this.expr1=expr1;
        this.expr2=expr2;
    }
}
