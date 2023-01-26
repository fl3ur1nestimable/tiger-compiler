package ast;

public class StringNode implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public String value;
    public int line;

    public StringNode(String value,int line){
        this.value=value;
        this.line=line;
    }
    
}
