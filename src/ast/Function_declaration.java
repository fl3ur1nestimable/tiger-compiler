package ast;

public class Function_declaration implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast name;
    public Ast paramsOrReturnType;
    public Ast return_type;
    public Ast body;

    public Function_declaration(Ast name, Ast params, Ast return_type, Ast body) {
        this.name = name;
        this.paramsOrReturnType = params;
        this.return_type = return_type;
        this.body = body;
    }

    public Function_declaration(Ast name, Ast params, Ast body) {
        this.name = name;
        this.paramsOrReturnType = params;
        this.body = body;
    }
    

    public Function_declaration(Ast name, Ast body) {
        this.name = name;
        this.body = body;
    }


    
}
