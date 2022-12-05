package ast;

public interface AstVisitor<T> {

    public T visit(Program affect);
    public T visit(Or or);

}
