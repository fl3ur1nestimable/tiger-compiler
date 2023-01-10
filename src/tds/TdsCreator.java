package tds;
import java.util.ArrayList;

import ast.*;

public class TdsCreator implements AstVisitor<String> {
    private int currentImbrication = 0;
    private int currentBlock = 0;
    private ArrayList<Tds> tdsList = new ArrayList<Tds>();
    private Tds currentTds;

    public TdsCreator() {
        currentTds = new Tds("global", currentBlock, currentImbrication, null);
        tdsList.add(currentTds);
    }

    public void addTds(Tds tds) {
        tdsList.add(tds);
    }

    public ArrayList<Tds> getTdsList() {
        return tdsList;
    }

    public Tds getCurrentTds() {
        return currentTds;
    }

    public void setCurrentTds(Tds currentTds) {
        this.currentTds = currentTds;
    }

    public int getCurrentImbrication() {
        return currentImbrication;
    }

    public void setCurrentImbrication(int currentImbrication) {
        this.currentImbrication = currentImbrication;
    }

    public int getCurrentBlock() {
        return currentBlock;
    }

    public void setCurrentBlock(int currentBlock) {
        this.currentBlock = currentBlock;
    }

    public void printAll(){
        for (Tds tds : tdsList) {
            System.out.println(tds.getName());
            for (TdsElement element : tds.getElements()) {
                System.out.println("\t"+element.toString());
            }
            System.out.println("------------------------");
        }
    }

    @Override
    public String visit(Program affect) {
        affect.expr.accept(this);
        return null;
    }
    //------------------------------------Marine
    @Override
    public String visit(Or or) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Flush_ flush_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Exit_ exit_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Getchar getchar) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Chr_ chr_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(And and) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Compare_equal_2 compare_equal_2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(GreaterThan1 greaterThan1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(GreaterThan2 greaterThan2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(LessThan2 lessThan2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Plus plus) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Moins moins) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Mult mult) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Divide divide) {
        // TODO Auto-generated method stub
        return null;
    }
    //------------------------------------Vide
    @Override
    public String visit(Whiledo whiledo) {
        whiledo.cond.accept(this);
        whiledo.doBlock.accept(this);
        return null;
    }

    @Override
    public String visit(For_ for_) {
        currentBlock++;
        currentImbrication++;
        Tds tds = new Tds("for", currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        String id = for_.idf.accept(this);
        String type = for_.expr1.accept(this);
        currentTds.addElement(new TdsVariable(id, type, 0, tds));
        currentTds = tds.getParent();
        for_.expr2.accept(this);
        for_.expr3.accept(this);
        currentImbrication--;
        return null;
    }

    @Override
    public String visit(Identifier identifier) {
       switch (identifier.value) {
        case "int":
            return Type.INT.toString();
        case "string":
            return Type.STRING.toString();
        case "nil":
            return Type.NIL.toString();
        default:
            return identifier.value;
       }
    }

    @Override
    public String visit(Expr_seq expr_seq) {
        for (Ast expr : expr_seq.array) {
            expr.accept(this);
        }
        return null;
    }

    @Override
    public String visit(Declaration_list declaration_list) {
        for (Ast declaration : declaration_list.decList) {
            declaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(Let_in_end let_in_end) {
        currentBlock++;
        currentImbrication++;
        Tds tds = new Tds("let", currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        let_in_end.block1.accept(this);
        let_in_end.block2.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return null;
    }

    @Override
    public String visit(Type_declaration type_declaration) {
        Identifier id = (Identifier) type_declaration.idf;
        Type type = type_declaration.type.accept(this) == Type.ARRAYTY.toString() ? Type.ARRAYTY : Type.RECORDTY;
        String base = null;
        String fields = null;
        if(type_declaration.type instanceof TypeDec1){
            fields = ((Type_fields)((TypeDec1) type_declaration.type).typefields).toString();
        }
        else
        if(type_declaration.type instanceof TypeDec2){
            base = ((TypeDec2) type_declaration.type).idf.accept(this);
        }
        TdsType tdsType = new TdsType(id.value, type, base, fields,currentTds);
        currentTds.addElement(tdsType);
        return Type.VOID.toString();
    }
    //------------------------------------Louis
    @Override
    public String visit(StringNode string_node) {
        // on peut afficher directement string
        return Type.STRING.toString();
    }

    @Override
    public String visit(IntNode int_node) {
        // on peut afficher directement int
        return Type.INT.toString();
    }

    @Override
    public String visit(Nil nil) {
        // on peut afficher directement int
        return Type.NIL.toString();
    }

    @Override
    public String visit(Break_ break_) {
        // verifier si bien dans for or while : break is illegal outside
        currentBlock++;
        currentImbrication++;

        Tds tdsPere = new Tds(null, currentBlock, currentImbrication, currentTds);
        Tds tdsFils = new Tds(null, currentBlock, currentImbrication, currentTds);
        while ((tdsPere = tdsFils.getParent()) != null && !tdsPere.toString().equals("function")) {
			if (tdsPere.toString().equals("while") || tdsPere.toString().equals("for")) {
                tdsList.add(tdsFils);
                currentImbrication--;
				return null; }
            else {
                tdsFils=tdsPere;
                System.out.println("Break n'est pas autorisé hors des for et while");
            }
		}

		return null;
    }

    @Override
    public String visit(Print_ print_) {
        // verifier qu'on a bien string

        Expr_list list = (Expr_list)print_.expr;
        ArrayList<Ast> param = list.array;
        if(param.size() != 1){
            System.out.println("erreur: print requiert 1 paramètre, mais " + param.size() + " paramètres ont ete donnes");
        }else{

                Identifier id = (Identifier)param.get(0);

                if(id.accept(this) == Type.STRING.toString()){
                    // oui.
                }
                else {System.out.println("erreur: print requiert 1 paramètre de type String");}
        }

        return Type.STRING.toString();
    
    }

    @Override
    public String visit(Printi printi) {
        // verifier qu'on a bien int

        return null;
    }

    @Override
    public String visit(Negation negation) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Expr_list expr_list) {
        for (Ast expr : expr_list.array) {
            expr.accept(this);
        }
        return null;
    }

    @Override
    public String visit(FunctionCall functionCall) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Assignement assignement) {
        return Type.VOID.toString();
    }
    //------------------------------------Angelina
    @Override
    public String visit(IfThenElse ifthenelse) {
        ifthenelse.left.accept(this);
        ifthenelse.middle.accept(this);
        if(ifthenelse.right!=null){
            ifthenelse.right.accept(this);
        }
        return null;
    }

    @Override
    public String visit(Substring_ substring) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Concat_ concat_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Ord_ ord_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Size_ size_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Not_ not_) {
        // TODO Auto-generated method stub
        return null;
    }
    //------------------------------------Antoine
    @Override
    public String visit(TypeDec1 typeDec1) {
        //a corriger
        return Type.RECORDTY.toString();
    }

    @Override
    public String visit(TypeDec2 typeDec2) {
        // a corriger
        return Type.ARRAYTY.toString();
    }

    @Override
    public String visit(Type_fields type_fields) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Type_field type_field) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Variable_declaration variable_declaration) {
        String name = variable_declaration.name.toString();
        String type= null;
        if(variable_declaration.type!=null){
            type = variable_declaration.type.accept(this); 
        }
        else{

            type = variable_declaration.expr.accept(this);
        }
        currentTds.addElement(new TdsVariable(name, type, 0, currentTds));
        return Type.VOID.toString();
    }

    @Override
    public String visit(Function_declaration function_declaration) {
        currentBlock++;
        currentImbrication++;
        String params = null;
        String returnType= null;
        if(function_declaration.paramsOrReturnType!=null){
            if(function_declaration.paramsOrReturnType instanceof Identifier){
                returnType = function_declaration.paramsOrReturnType.accept(this);
            }
            else{
                params=function_declaration.paramsOrReturnType.toString();
            }
        }
        if(function_declaration.return_type!=null){
            returnType = function_declaration.return_type.accept(this);
        }
        String name = ((Identifier)function_declaration.name).value;
        currentTds.addElement(new TdsFunction(name,params,Type.VOID,returnType, currentTds));
        Tds tds = new Tds("function_" + name, currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        function_declaration.body.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return Type.VOID.toString();
    }

    @Override
    public String visit(Field field) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Field_list field_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(Lvalue lvalue) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(AccessId accessId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(AccessIndex accessIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visit(RecordDec recordDec) {
        // TODO Auto-generated method stub
        return Type.RECORD.toString();
    }

    @Override
    public String visit(ArrayDec arrayDec) {
        // TODO Auto-generated method stub
        return Type.ARRAY.toString();
    }

    
}
