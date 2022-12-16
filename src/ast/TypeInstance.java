package ast;

public class TypeInstance implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast id;
    public Ast liste_field;
    public Ast expr1;
    public Ast expr2;
    public TypeInstance(Ast id){
        this.id=id;
    }
    public TypeInstance(Ast id,Ast lf){
        this.id=id;
        this.liste_field=lf;
    }
    public TypeInstance(Ast id,Ast expr1,Ast expr2){
        this.id=id;
        this.expr1=expr1;
        this.expr2=expr2;
    }
}
