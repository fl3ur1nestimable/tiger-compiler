package ast;

public interface AstVisitor<T> {

    public T visit(Program affect);
    public T visit(Or or);
    public T visit(Flush_ flush_);
    public T visit(Exit_ exit_);
    public T visit(Getchar getchar);
    public T visit(Chr_ chr_);


}
