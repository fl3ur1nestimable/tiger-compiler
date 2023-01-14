package tds;
import java.util.ArrayList;

import ast.*;

//todo : substring 2 int et 1 string ?????

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

    public Tds getTds(String Name){
        for (Tds t : tdsList) {
            if (t.getName().equals(Name)) {
                return t;
            }
        }
        return null;
    }

    public void printAll(){
        for (Tds tds : tdsList) {
            System.out.println(tds.toString());
            for (TdsElement element : tds.getElements()) {
                System.out.println("\t"+element.toString());
            }
            System.out.println("------------------------");
        }
    }

    public TdsVariable findVar(String name){
        TdsVariable var = currentTds.findVar(name);
        if (var != null) {
            return var;
        }
        return null;
    }

    public TdsFunction findFunc(String name){
        TdsFunction func = currentTds.findFunc(name);
        if (func != null) {
            return func;
        }
        return null;
    }

    public TdsType findType(String name){
        switch (name) {
            case "int":
                return new TdsType("INT", "INT", currentTds);
            case "string":
                return new TdsType("STRING", "STRING", currentTds);
            case "nil" :
                return new TdsType("STRING", "STRING", currentTds);
            default:
                break;
        }
        TdsType type = currentTds.findType(name);
        if (type != null) {
            return type;
        }
        return null;
    }

    @Override
    public String visit(Program affect) {
        affect.expr.accept(this);
        return null;
    }
    @Override
    public String visit(Or or) {
        String gauche =or.left.accept(this);
        String droit =or.rigth.accept(this);
        if(gauche == null || droit == null){
            return null;
        }

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("Le or compare deux int");
            return null;
        }
        
        return Type.INT.toString();
    }

    @Override
    public String visit(Flush_ flush_) {
        return Type.VOID.toString();
    }

    @Override
    public String visit(Exit_ exit_) {
        String exp =exit_.exp.accept(this);
        if(exp == null){
            return null;
        }
        Expr_list list = (Expr_list)exit_.exp;
        ArrayList<Ast> param = list.array;
        if (param.size()!=1){
            System.out.println("exit attend qu'un seul paramètre");
            return null;
        }

        else if(!exp.equals(Type.INT.toString())){
            System.out.println("exit attend un int comme paramètre");
            return null;
        }
        return Type.VOID.toString();
    }

    @Override
    public String visit(Getchar getchar) {
        return Type.STRING.toString();
    }

    @Override
    public String visit(Chr_ chr_) {
        String index = chr_.exp.accept(this);
        if(index == null){
            return null;
        }
        Expr_list list = (Expr_list)chr_.exp;
        ArrayList<Ast> param = list.array;
        if (param.size()!=1){
            System.out.println("chr attend qu'un seul paramètre");
            return null;
        }

        if(!index.equals(Type.INT.toString())){
            System.out.println("chr attend un int comme paramètre");
            return null;
        }
        return null;
    }

    @Override
    public String visit(And and) {
        String gauche =and.left.accept(this);
        String droit =and.rigth.accept(this);
        if(gauche == null || droit == null){
            return null;
        }

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("Le and compare deux int");
            return null;
        }
        return Type.INT.toString();
        
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) {
        String leftIdentifier = compare_equal_1.left.accept(this);
        String rightIdentifier = compare_equal_1.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }
        
        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("<> compare que les objets de même type");
            return null;
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(Compare_equal_2 compare_equal_2) {
        String leftIdentifier = compare_equal_2.left.accept(this);
        String rightIdentifier = compare_equal_2.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }

        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("== compare que les objets de même type");
            return null;
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(GreaterThan1 greaterThan1) {
        String leftIdentifier = greaterThan1.left.accept(this);
        String rightIdentifier = greaterThan1.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }

        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println(">= compare deux int ou deux String");
            return null;
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(GreaterThan2 greaterThan2) {
        String leftIdentifier = greaterThan2.left.accept(this);
        String rightIdentifier = greaterThan2.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }

        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println("> compare deux int ou deux String");
            return null;
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        String leftIdentifier = lessThan1.left.accept(this);
        String rightIdentifier = lessThan1.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }
        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println("<= compare deux int ou deux String");
            return null;
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(LessThan2 lessThan2) {
        String leftIdentifier = lessThan2.left.accept(this);
        String rightIdentifier = lessThan2.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }
        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println("< compare deux int ou deux String");
            return null;
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(Plus plus) {
        String gauche =plus.left.accept(this);
        String droit =plus.rigth.accept(this);
        if(gauche == null || droit == null){
            return null;
        }

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("+ ne fait des opérations que sur des int");
            return null;
        }
        return Type.INT.toString();
        
    }

    @Override
    public String visit(Moins moins) {
        String gauche =moins.left.accept(this);
        String droit =moins.rigth.accept(this);
        if (gauche == null || droit == null) {
            return null;
        }
        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("- ne fait des opérations que sur des int");
            return null;
        }

        return Type.INT.toString();
        
    }

    @Override
    public String visit(Mult mult) {
        String gauche =mult.left.accept(this);
        String droit =mult.rigth.accept(this);
        if (gauche == null || droit == null) {
            return null;
        }
        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("* ne fait des opérations que sur des int");
            return null;
        }

        return Type.INT.toString();
        
    }

    @Override
    public String visit(Divide divide) {
        String gauche =divide.left.accept(this);
        String droit =divide.rigth.accept(this);
        if (gauche == null || droit == null) {
            return null;
        }
        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("/ ne fait des opérations que sur des int");
            return null;
        }

        return Type.INT.toString();
        
    }
    @Override
    public String visit(Whiledo whiledo) {
        currentBlock++;
        currentImbrication++;
        Tds tds = new Tds("while", currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        whiledo.cond.accept(this);
        whiledo.doBlock.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return Type.VOID.toString();
    }

    @Override
    public String visit(For_ for_) {
        currentBlock++;
        currentImbrication++;
        Tds tds = new Tds("for", currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        for_.expr1.accept(this);
        for_.expr2.accept(this);
        for_.expr3.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return Type.VOID.toString();
    }
   //------
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
            TdsVariable var = findVar(identifier.value);
            String returnType = null;
            if (var==null) {
                System.out.println("Erreur : la variable "+identifier.value+" n'est pas définie");
            }
            else{
                returnType = var.getType();
            }
            if (returnType==null) {
                return null;
            }
            return returnType.toString();
       }
    }

    @Override
    public String visit(Expr_seq expr_seq) {
        String returnType = Type.VOID.toString();
        for (Ast expr : expr_seq.array) {
            returnType = expr.accept(this);
        }
        if (returnType==null) {
            return null;
        }
        return returnType;
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
        String name = id.value;
        TdsType t = findType(name);
        if (t!=null) {
            System.out.println("Erreur : double déclaration du type :" + t.getName());
            return null;
        }
        else{
            currentBlock++;
            currentImbrication++;
            Tds typeTds = new Tds(id.value+"_t", currentBlock, currentImbrication, currentTds);
            currentTds = typeTds;
            String type = type_declaration.type.accept(this);
            Tds save = currentTds.getParent();
            if(type!=null){
                if (type==Type.ARRAY.toString()) {
                    TypeDec2 typeDec2 = (TypeDec2) type_declaration.type;
                    Identifier id2 = (Identifier)typeDec2.idf;
                    String type2 = id2.value;
                    TdsType t1 = findType(type2);
                    if(t1 == null){
                        System.out.println("Erreur : type "+ type2 + " non declare");
                        return null;
                    }else{
                        TdsArrayType tdsArrayType = new TdsArrayType(id.value,Type.ARRAY.toString(),type2.toUpperCase(),currentTds);
                        currentTds.addElement(tdsArrayType);
                        save.addElement(tdsArrayType);
                        tdsList.add(typeTds);
                    }
                }else{
                    TdsType tdsType = new TdsType(id.value,type,currentTds);
                    currentTds.addElement(tdsType);
                    save.addElement(tdsType);
                    tdsList.add(typeTds);
                }
            currentTds = typeTds.getParent();
            currentImbrication--;
            }
            currentTds = save;
        }
        return Type.VOID.toString();
    }
    
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
        Tds tdsPere = currentTds;
        Tds tdsFils = currentTds;
        while ((tdsPere = tdsFils.getParent()) != null) {
			if (tdsPere.toString().equals("while") || tdsPere.toString().equals("for")) {
				return Type.VOID.toString(); }
            else {
                tdsFils=tdsPere;
            }
		}
        System.out.println("Break n'est pas autorisé hors des for et while");
		return null;
    }

    @Override
    public String visit(Print_ print_) {
        // verifier qu'on a bien string et 1 seul paramètre
        String expre = print_.expr.accept(this); 
        Expr_list list = (Expr_list)print_.expr;
        ArrayList<Ast> param = list.array;
        if(param.size() != 1){
            System.out.println("erreur: print requiert 1 parametre, mais " + param.size() + "paramètres ont ete donnes");
        }
        if(!expre.equals(Type.STRING.toString())){
            System.out.println("erreur: print requiert un paramètre dont le type de retour est STRING");
        }
        return Type.STRING.toString();
    
    }

    @Override
    public String visit(Printi printi) {
        // verifier qu'on a bien int et 1 seul paramètre
        String expre = printi.expr.accept(this);
        Expr_list list = (Expr_list)printi.expr;
        ArrayList<Ast> param = list.array;
        if(param.size() != 1){
            System.out.println("erreur: printi requiert 1 paramètre, mais " + param.size() + "paramètres ont ete donnes");
        }
        if(!expre.equals(Type.INT.toString())){
            System.out.println("erreur: printi requiert un paramètre dont le type de retour est INT");
        }

        return Type.STRING.toString();
    }

    @Override
    public String visit(Negation negation) {
        String expre = negation.right.accept(this);
        Expr_list list = (Expr_list)negation.right;  
        ArrayList<Ast> param = list.array;
        if(param.size() != 1){
            System.out.println("erreur: la négation requiert 1 paramètre, mais " + param.size() + "paramètres ont ete donnes");
        }
        if(!expre.equals(Type.INT.toString())){
            System.out.println("erreur: la  négation s'effectue exclusivement sur des expressions de type INT");
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(Expr_list expr_list) {
        for (Ast expr : expr_list.array) {
            expr.accept(this);
        }
        return Type.VOID.toString();  
    }

     //-------------------------------------------
    @Override
    public String visit(FunctionCall functionCall) {
        Identifier id = (Identifier)functionCall.left;
        String name = id.value;
        TdsFunction func = findFunc(name);
        if (func==null) {//Vérification de l'existence de la fonction
            System.out.println("Erreur : la fonction " + name + " n'est pas définie");
            return null;
        }else{
            Expr_list list = (Expr_list)functionCall.right; 
            ArrayList<Ast> paramFournis = list.array;
            ArrayList<String> listParametresAttendus = func.getParameters();
            if(paramFournis.size() != listParametresAttendus.size()){// Vérification du nombre d'arguments
                System.out.println("Erreur: l'appel de cette fonction requiert "+ listParametresAttendus.size() +" paramètre(s), mais " + paramFournis.size() + "paramètre(s) ont été donné(s)");
            }
            else{
                for (int i=0;i< paramFournis.size(); i++) {           // Vérification des types d'arguments
                    String param = paramFournis.get(i).accept(this);
                    if( param != listParametresAttendus.get(i)) {         
                        System.out.println("erreur: l'appel de cette fonction requiert un argument de type"+ listParametresAttendus.get(i) +" mais un argument de type" + param + "a été donné(s)");
                    }
                } 
            }
            return func.getType().toString();
        }
    }

  
    @Override
    public String visit(Assignement assignement) {

        String leftIdentifier = assignement.left.accept(this);
        String rightIdentifier = assignement.right.accept(this);
        if(leftIdentifier == null || rightIdentifier == null){
            return null;
        }
        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("Erreur : on ne peut pas assigner un type "+rightIdentifier+" à une variable de type "+leftIdentifier);
        }
        return Type.VOID.toString();
    }

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
        Expr_list list = (Expr_list)substring.right;
        ArrayList<Ast> param = list.array;
        if(param.size() != 3){
            System.out.println("erreur: substring requiert 3 parametres, mais seulement " + param.size() + " ont ete donnes");
        }else{
            int countint = 0;
            int countstring = 0;
            for(int i = 0; i < param.size(); i++){
                Identifier id = (Identifier)param.get(i);
                if( id.accept(this) == Type.INT.toString()){
                    countint++;
                }else if(id.accept(this) == Type.STRING.toString()){
                    countstring++;
                }
            }
            if(!(countint == 2 && countstring ==  1)){
                System.out.println("erreur: substring requiert de 2 parametres de type int et 1 paramenre de type String ");
            }
        }
        return Type.STRING.toString();
    }

    @Override
    public String visit(Concat_ concat_) {
        Expr_list list = (Expr_list)concat_.right;
        ArrayList<Ast> param = list.array;
        if(param.size() != 2){
            System.out.println("erreur: concat requiert 2 parametres, mais seulement " + param.size() + " ont ete donnes");
        }else{
            int countstring = 0;
            for(int i = 0; i < param.size(); i++){
                Identifier id = (Identifier)param.get(i);
                if(id.accept(this) == Type.STRING.toString()){
                    countstring++;
                }
            }
            if(!(countstring ==  2)){
                System.out.println("erreur: concat requiert de 2 parametres de type string ");
            }
        }
        return Type.STRING.toString();
    }

    @Override
    public String visit(Ord_ ord_) {
        Expr_list list = (Expr_list)ord_.right;
        ArrayList<Ast> param = list.array;
        if(param.size() != 1){
            System.out.println("erreur: ord requiert 1 parametre, mais seulement " + param.size() + " ont ete donnes");
        }else{
            int countstring = 0;
            for(int i = 0; i < param.size(); i++){
                Identifier id = (Identifier)param.get(i);
                if(id.accept(this) == Type.STRING.toString()){
                    countstring++;
                }
            }
            if(!(countstring ==  1)){
                System.out.println("erreur: ord requiert de 1 paramètres de type string ");
            }
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(Size_ size_) {
        Expr_list list = (Expr_list)size_.right;
        ArrayList<Ast> param = list.array;
        if(param.size() != 1){
            System.out.println("erreur: size requiert 1 paraèetre, mais seulement " + param.size() + " ont été donnes");
        }else{
            int countstring = 0;
            for(int i = 0; i < param.size(); i++){
                Identifier id = (Identifier)param.get(i);
                if(id.accept(this) == Type.STRING.toString()){
                    countstring++;
                }
            }
            if(!(countstring ==  1)){
                System.out.println("erreur: size requiert de 1 paramètres de type string ");
            }
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(Not_ not_) {
        Expr_list list = (Expr_list)not_.right;
        ArrayList<Ast> param = list.array;
        if(param.size() != 1){
            System.out.println("erreur: not requiert 1 parametre, mais seulement " + param.size() + " ont ete donnes");
        }else{
            int countint = 0;
            for(int i = 0; i < param.size(); i++){
                Identifier id = (Identifier)param.get(i);
                if(id.accept(this) == Type.INT.toString()){
                    countint++;
                }
            }
            if(!(countint ==  1)){
                System.out.println("erreur: not requiert de 1 parametres de type int ");
            }
        }
        return Type.INT.toString();
    }
     
    @Override
    public String visit(TypeDec1 typeDec1) {
        if(typeDec1.typefields.accept(this) == null){
            return null;
        }
        return Type.RECORD.toString();
    }
     
    @Override
    public String visit(TypeDec2 typeDec2) {
        return Type.ARRAY.toString();
    }
     
    @Override
    public String visit(Type_fields type_fields) {
        for (Ast t : type_fields.fields) {
                if(t.accept(this) == null){
                    return null;
                }
        }
        return Type.VOID.toString();
    }
     
    @Override
    public String visit(Type_field type_field) {
        String id = ((Identifier)type_field.name).value;
        if (currentTds.contains(id)) {
            System.out.println("Erreur : duplication du champ "+ id);
            return null;
        }else{
            Identifier id2 = (Identifier)type_field.type;
            String type = id2.value;
            TdsType t = findType(type);
            if(t == null){
                System.out.println("Erreur : le type "+ type + " n'existe pas");
                return null;
            }
            switch(type){
                case "int":
                    type = Type.INT.toString();
                    break;
                case "string":
                    type = Type.STRING.toString();
                    break;
                case "nil": 
                    type = Type.NIL.toString();
                    break;
            }
            TdsTypeField f = new TdsTypeField(id,type, currentTds);
            currentTds.addElement(f);
        }
        return Type.VOID.toString();
    }
     //------------------------------------------
    @Override
    public String visit(Variable_declaration variable_declaration) {
        Identifier id = (Identifier)variable_declaration.name;
        String name = id.value;
        TdsVariable var = findVar(name);
        if (var != null) {
            System.out.println("Erreur : double déclaration de la variable " + var.getName());
            return null;
        }
        String type= null;
        Tds save = currentTds;
        if(variable_declaration.type!=null){
            type = variable_declaration.type.accept(this);
        }
        else{
            type = variable_declaration.expr.accept(this);
        }
        currentTds=save;
        if(type!=null){
            currentTds.addElement(new TdsVariable(name, type, 0, currentTds));
        }
        return Type.VOID.toString();
    }
     //-------------------------------------------
    @Override
    public String visit(Function_declaration function_declaration) {
        String name = ((Identifier)function_declaration.name).value;
        TdsFunction func = findFunc(name);
        if (func != null) {
            System.out.println("Erreur : double déclaration de la fonction " + func.getName());
            return null;
        }
        currentBlock++;
        currentImbrication++;
        ArrayList<String> params = new ArrayList<String>();
        String returnType= null;
        if(function_declaration.paramsOrReturnType!=null){
            if(function_declaration.paramsOrReturnType instanceof Identifier){
                returnType = function_declaration.paramsOrReturnType.accept(this);
                if(returnType==null){
                    return null;
                }
            }
            else{
                if(function_declaration.paramsOrReturnType.accept(this)!=null){
                    Type_fields e = (Type_fields)function_declaration.paramsOrReturnType;
                    for (Ast f : e.fields) {
                        params.add(((Identifier)((Field)f).expr).value);
                    }
                }
                else{
                    return null;
                }
            }
        }
        if(function_declaration.return_type!=null){
            returnType = function_declaration.return_type.accept(this);
            if(returnType==null){
                return null;
            }
        }
        Tds tds = new Tds(name, currentBlock, currentImbrication, currentTds);
        currentTds = tds;
        String r = function_declaration.body.accept(this);
        if (!r.equals(returnType)) {
            System.out.println("Erreur : la fonction doit retourner un type "+returnType);
        }
        currentTds.addElement(new TdsFunction(name,params,returnType, currentTds));
        tdsList.add(tds);
        currentTds = tds.getParent();
        currentImbrication--;
        return Type.VOID.toString();
    }
     //-------------------------------------------

    @Override
    public String visit(Field field) {
        String name = ((Identifier)field.name).value;
        if (!currentTds.contains(name)) {
            System.out.println("Erreur : le champ " + name + " n'existe pas pour la structure "+currentTds.getElements().get(0).getName() );
            return null;
        }else{
            String type = field.expr.accept(this);
            if (type == null) {
                return null;
            }else{
                if (!currentTds.getElement(name).getType().equals(type)) {
                    System.out.println("Erreur : le champ "+name+" doit être de type "+ currentTds.getElement(name).getType());
                    return null;
                }
            }
        }
        return Type.VOID.toString();
    }
     //-----------------------------------------
    @Override
    public String visit(Field_list field_list) {
        if(currentTds.getElements().size()-1!=field_list.fields.size()){
            System.out.println("Erreur : la structure " + currentTds.getElements().get(currentTds.getElements().size()-1).getName() +" possède " + Integer.toString(currentTds.getElements().size()-1) +" champs");
            return null;
        }
        for (Ast f : field_list.fields) {
            if(f.accept(this)==null){
                return null;
            }
        }
        return Type.VOID.toString();
    }

     //-----------------------------------------
    @Override
    public String visit(AccessId accessId) {
        String left = accessId.left.accept(this);
        if (left == null) {
            return null;
        }
        Identifier idr = (Identifier)accessId.rigth;
        String right = idr.value;
        String id = ((Identifier)(accessId.left)).value;
        TdsType tdsType = findType(findVar(id).getType());
        if (left.equals(Type.RECORD.toString()) ||(tdsType!=null && tdsType.getType().equals(Type.RECORD.toString()))) {  //  verifier que c'est une variable qui existe
            Tds tds = getTds(findType(findVar(id).getType()).getName()+"_t");
            if(tds==null){
                System.out.println("Erreur : la structure "+id+" n'existe pas");
                return null;

            }else{
                if (tds.contains(right)){
                        return tds.getElement(right).getType().toString();
                    }               
                
                System.out.println("Erreur : le champ " + right + " n'existe pas pour " + left);
                return null;
            } 
        }
        else{
            System.out.println("Erreur : la variable " + id + " n'est pas une structure");
        }
        return null;         
    }

     //-----------------------------------------
    @Override
    public String visit(AccessIndex accessIndex) {
        String left = accessIndex.left.accept(this);
        String right = accessIndex.rigth.accept(this);
        if (left == null || right == null) {
            return null;
        }
        String id = ((Identifier)(accessIndex.left)).value;
        TdsType tdsType = findType(findVar(id).getType());
        if (left.equals(Type.ARRAY.toString()) || (tdsType!=null && tdsType.getType().equals(Type.ARRAY.toString()))) {  //  verifier que c'est un tableau qui existe
            String type = findType(findVar(id).getType()).getName();
            Tds tds = getTds(type +"_t");
            if(tds==null){
                System.out.println("Erreur : le tableau "+id+" n'existe pas");
                return null;
            }else {
                                            //  verifier que right est bien de type int     
                if (right.equals(Type.INT.toString())){
                    return ((TdsArrayType)tds.getElement(type)).getBaseType();
                }
                System.out.println("Erreur : l'indice doit être de type int");
                return null;    
            }               
        }
        else{
            System.out.println("Erreur : la variable " + id + " n'est pas un tableau");
        }      
        return null;
    }
    
     //-----------------------------------------
    @Override
    public String visit(RecordDec recordDec) {
        Identifier id = (Identifier)recordDec.id;
        String name = id.value;
        TdsType type = findType(name);
        if (type==null) {
            System.out.println("Erreur : le type "+name+" n'est pas défini" );
            return null;
        }
        else{
            Tds tds = getTds(name+"_t");
            TdsType e = (TdsType)tds.getElement(name);
                if (!e.getType().equals(Type.RECORD.toString())) {
                    System.out.println("Erreur : " + id + " n'est pas un type de structure");
                    return null;
                }
                else{
                    currentTds = tds;
                }
        }
        if(recordDec.list.accept(this)==null){
            return null;
        }

        return name;
    }
     //-----------------------------------------
    @Override
    public String visit(ArrayDec arrayDec) {
        Identifier id = (Identifier)arrayDec.id;
        String name = id.value;
        TdsType type = findType(name);
        if (type==null) {
            System.out.println("Erreur : le type "+name+" n'est pas défini" );
            return null;
        }
        else{
            Tds tds = getTds(name+"_t");
            if (tds==null) {
                System.out.println("tds null");
            }
            TdsType e = (TdsType)tds.getElement(name);
                if (!e.getType().equals(Type.ARRAY.toString())) {
                    System.out.println("Erreur : " + id + " n'est pas un type de tableau");
                    return null;
                }
        }
        String size = arrayDec.expr1.accept(this);
        if (!size.equals(Type.INT.toString())) {
            System.out.println("Erreur : la taille d'un array doit être de type int");
            return null;
        }
        String base = arrayDec.expr2.accept(this);
        Tds tds = getTds(name+"_t");
        TdsArrayType e = (TdsArrayType)tds.getElement(name);
        if(!e.getBaseType().equals(base)){
            System.out.println("Erreur : le type " + base + " ne correspond pas au type " + e.getBaseType() + " de " +name);
            return null;
        }
        return name;
    }

    
}
