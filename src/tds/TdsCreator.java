package tds;
import java.util.ArrayList;


import ast.*;


public class TdsCreator implements AstVisitor<String> {
    private int currentImbrication = 0;
    private int currentBlock = 0;
    private ArrayList<Tds> tdsList = new ArrayList<Tds>();
    private Tds currentTds;
    private boolean inFunction=false;
    public TdsCreator() {
        currentTds = new Tds("global", currentBlock, currentImbrication, null);
        tdsList.add(currentTds);
    }

    public void addTds(Tds tds) {
        tdsList.add(tds);
    }

    public TypeTds getTypeTds(String name){
        TypeTds t = null;
        for (Tds tds : tdsList) {
            if(tds instanceof TypeTds && tds.getName().equals(name)){
                t=(TypeTds)tds;
            }
        }
        return t;
    }

    public void supprimerTds(int numBlock, int numImbric){
        for (Tds TDS : tdsList){
            if (TDS.getNumBloc() == numBlock && TDS.getNumImbrication() == numImbric) {
                // for (TdsElement elem : TDS.getElements()){
                //     TDS.supprimerElement(elem);
                // }
                this.tdsList.remove(TDS);
            }
        }
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
                TdsType t = new TdsType("int_t");
                t.setType("int_t");
                t.setTds(currentTds);
                return t;
            case "string":
                TdsType t2 = new TdsType("string_t");
                t2.setType("string_t");
                t2.setTds(currentTds);
                return t2;
            case "nil" :                
                TdsType t3 = new TdsType("nil_t");
                t3.setType("nil_t");
                t3.setTds(currentTds);
                return t3;
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

        if(!gauche.equals(Type.int_t.toString())||!droit.equals(Type.int_t.toString())){
            System.out.println("Ligne " + or.line+ " : Le or compare deux int");
            return null;
        }
        
        return Type.int_t.toString();
    }

    @Override
    public String visit(Flush_ flush_) {
        return Type.void_t.toString();
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
            System.out.println("Ligne " + exit_.line+ " : exit attend qu'un seul paramètre");
            return null;
        }

        else if(!exp.equals(Type.int_t.toString())){
            System.out.println("Ligne " + exit_.line+ " : exit attend un int comme paramètre");
            return null;
        }
        return Type.void_t.toString();
    }

    @Override
    public String visit(Getchar getchar) {
        return Type.string_t.toString();
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
            System.out.println("Ligne " + chr_.line+ " : chr attend qu'un seul paramètre");
            return null;
        }

        if(!index.equals(Type.int_t.toString())){
            System.out.println("Ligne " + chr_.line+ " : chr attend un int comme paramètre");
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

        if(!gauche.equals(Type.int_t.toString())||!droit.equals(Type.int_t.toString())){
            System.out.println("Ligne " + and.line+ " : Le and compare deux int");
            return null;
        }
        return Type.int_t.toString();
        
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) {
        String leftIdentifier = compare_equal_1.left.accept(this);
        String rightIdentifier = compare_equal_1.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }
        
        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("Ligne " + compare_equal_1.line+ " : <> compare que les objets de même type");
            return null;
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(Compare_equal_2 compare_equal_2) {
        String leftIdentifier = compare_equal_2.left.accept(this);
        String rightIdentifier = compare_equal_2.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }

        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("Ligne " + compare_equal_2.line+ " : == compare que les objets de même type");
            return null;
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(GreaterThan1 greaterThan1) {
        String leftIdentifier = greaterThan1.left.accept(this);
        String rightIdentifier = greaterThan1.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }

        if(!((leftIdentifier.equals(Type.int_t.toString()) && rightIdentifier.equals(Type.int_t.toString()))||(leftIdentifier.equals(Type.string_t.toString()) && rightIdentifier.equals(Type.string_t.toString())))){
            System.out.println("Ligne " + greaterThan1.line+ " : >= compare deux int ou deux String");
            return null;
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(GreaterThan2 greaterThan2) {
        String leftIdentifier = greaterThan2.left.accept(this);
        String rightIdentifier = greaterThan2.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }

        if(!((leftIdentifier.equals(Type.int_t.toString()) && rightIdentifier.equals(Type.int_t.toString()))||(leftIdentifier.equals(Type.string_t.toString()) && rightIdentifier.equals(Type.string_t.toString())))){
            System.out.println("Ligne " + greaterThan2.line+ " : > compare deux int ou deux String");
            return null;
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        String leftIdentifier = lessThan1.left.accept(this);
        String rightIdentifier = lessThan1.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }
        if(!((leftIdentifier.equals(Type.int_t.toString()) && rightIdentifier.equals(Type.int_t.toString()))||(leftIdentifier.equals(Type.string_t.toString()) && rightIdentifier.equals(Type.string_t.toString())))){
            System.out.println("Ligne " + lessThan1.line+ " : <= compare deux int ou deux String");
            return null;
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(LessThan2 lessThan2) {
        String leftIdentifier = lessThan2.left.accept(this);
        String rightIdentifier = lessThan2.rigth.accept(this);
        if (leftIdentifier == null || rightIdentifier == null) {
            return null;
        }
        if(!((leftIdentifier.equals(Type.int_t.toString()) && rightIdentifier.equals(Type.int_t.toString()))||(leftIdentifier.equals(Type.string_t.toString()) && rightIdentifier.equals(Type.string_t.toString())))){
            System.out.println("Ligne " + lessThan2.line+ " : < compare deux int ou deux String");
            return null;
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(Plus plus) {
        String gauche =plus.left.accept(this);
        String droit =plus.rigth.accept(this);
        if(gauche == null || droit == null){
            return null;
        }

        if(!gauche.equals(Type.int_t.toString())||!droit.equals(Type.int_t.toString())){
            System.out.println("Ligne " + plus.line+ " : + ne fait des opérations que sur des int");
            return null;
        }
        return Type.int_t.toString();
        
    }

    @Override
    public String visit(Moins moins) {
        String gauche =moins.left.accept(this);
        String droit =moins.rigth.accept(this);
        if (gauche == null || droit == null) {
            return null;
        }
        if(!gauche.equals(Type.int_t.toString())||!droit.equals(Type.int_t.toString())){
            System.out.println("Ligne " + moins.line+ " : - ne fait des opérations que sur des int");
            return null;
        }

        return Type.int_t.toString();
        
    }

    @Override
    public String visit(Mult mult) {
        String gauche =mult.left.accept(this);
        String droit =mult.rigth.accept(this);
        if (gauche == null || droit == null) {
            return null;
        }
        if(!gauche.equals(Type.int_t.toString())||!droit.equals(Type.int_t.toString())){
            System.out.println("Ligne " + mult.line+ " : * ne fait des opérations que sur des int");
            return null;
        }

        return Type.int_t.toString();
        
    }

    @Override
    public String visit(Divide divide) {
        String gauche =divide.left.accept(this);
        String droit =divide.rigth.accept(this);
        if (gauche == null || droit == null) {
            return null;
        }
        if(!gauche.equals(Type.int_t.toString())||!droit.equals(Type.int_t.toString())){
            System.out.println("Ligne " + divide.line+ " : / ne fait des opérations que sur des int");
            return null;
        }

        return Type.int_t.toString();
        
    }
    @Override
    public String visit(Whiledo whiledo) {
        String c = whiledo.cond.accept(this);
        if (c == null){
            return null;
        }
        if (!c.equals(Type.int_t.toString())){
            System.out.println("Ligne " + whiledo.line+ " : Erreur : la condition du while doit être un int");
            return null;
        }
        String r = whiledo.doBlock.accept(this);
        if (r == null){
            return null;
        }
        return r;
    }

    @Override
    public String visit(For_ for_) {
        currentBlock++;
        currentImbrication++;
        Tds tds = new Tds("for", currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        Identifier id = (Identifier)for_.idf;
        String type = for_.expr1.accept(this);
        if (type == null) {
            return null;
        }
        TdsVariable var = new TdsVariable(id.value);
        var.setType(type);
        var.setTds(currentTds);
        tds.addElement(var);
        for_.expr2.accept(this);
        for_.expr3.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return Type.void_t.toString();
    }
   //------
    @Override
    public String visit(Identifier identifier) {
       switch (identifier.value) {
        case "int":
            return Type.int_t.toString();
        case "string":
            return Type.string_t.toString();
        case "nil":
            return Type.nil_t.toString();
        default:
            TdsVariable var = findVar(identifier.value);
            String returnType = null;
            if (var==null) {
                System.out.println("Ligne " + identifier.line+ " : Erreur : la variable "+identifier.value+" n'est pas définie");
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
        String returnType = Type.void_t.toString();
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
        if (let_in_end.block2!=null) {
            String bloc2 = let_in_end.block2.accept(this);
            if (bloc2!=null) {
                currentTds = tds.getParent();
                currentImbrication--;
                return bloc2;
            }
        }
        else{
            currentTds = tds.getParent();
            currentImbrication--;
            return Type.void_t.toString();
        }
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
            System.out.println("Ligne " + type_declaration.line+ " : Erreur : double déclaration du type :" + t.getName());
            return null;
        }
        else{
            currentBlock++;
            currentImbrication++;
            Tds typeTds = new TypeTds(id.value, currentBlock, currentImbrication, currentTds);
            currentTds = typeTds;
            String type = type_declaration.type.accept(this);
            Tds save = currentTds.getParent();
            if(type!=null){
                if (type==Type.array_t.toString()) {
                    TypeDec2 typeDec2 = (TypeDec2) type_declaration.type;
                    Identifier id2 = (Identifier)typeDec2.idf;
                    String type2 = id2.value;
                    TdsType t1 = findType(type2);
                    if(t1 == null){
                        System.out.println("Ligne " + type_declaration.line+ " : Erreur : type "+ type2 + " non declare");
                        currentTds = save;
                        currentImbrication--;
                        currentBlock--;
                        return null;
                    }else{
                        if(type2.equals("int")||type2.equals("string")||type2.equals("nil")){
                            type2+="_t";
                        }
                        TdsArrayType tdsArrayType = new TdsArrayType(id.value);
                        tdsArrayType.setTds(currentTds);
                        tdsArrayType.setType(Type.array_t.toString());
                        tdsArrayType.setBaseType(type2);
                        currentTds.addElement(tdsArrayType);
                        save.addElement(tdsArrayType);
                        tdsList.add(typeTds);
                    }
                }else{
                    TdsType tdsType = new TdsType(id.value);
                    tdsType.setType(type);
                    tdsType.setTds(currentTds);
                    currentTds.addElement(tdsType);
                    save.addElement(tdsType);
                    tdsList.add(typeTds);
                }
            currentTds = typeTds.getParent();
            }
            else{
                currentBlock--;
            }
            currentImbrication--;
            currentTds = save;
        }
        return Type.void_t.toString();
    }
    
    @Override
    public String visit(StringNode string_node) {
        // on peut afficher directement string
        return Type.string_t.toString();
    }

    @Override
    public String visit(IntNode int_node) {
        // on peut afficher directement int
        return Type.int_t.toString();
    }

    @Override
    public String visit(Nil nil) {
        // on peut afficher directement int
        return Type.nil_t.toString();
    }

    @Override
    public String visit(Break_ break_) {
        // verifier qu'on est dans un for ou un while
        Tds tds = currentTds;
        while(tds != null){
            if(tds.getName().equals("for") || tds.getName().equals("while")){
                return Type.void_t.toString();
            }
            tds = tds.getParent();
        }
        System.out.println("Ligne " + break_.line+ " : Erreur : break n'est pas autorisé hors des for et while");
		return null;
    }

    @Override
    public String visit(Print_ print_) {
        // verifier qu'on a bien string et 1 seul paramètre
        String expre = print_.expr.accept(this); 
        Expr_list list = (Expr_list)print_.expr;
        ArrayList<Ast> param = list.array;
        if(expre == null){
            return null;
        }
        if(param.size() != 1){
            System.out.println("Ligne " + print_.line+ " : Erreur : print requiert 1 parametre, mais " + param.size() + "paramètres ont ete donnes");
            return null;
        }
        for (Ast ast : param) {
            if(!ast.accept(this).equals(Type.string_t.toString())){
                System.out.println("Ligne " + print_.line+ " : Erreur : print requiert un paramètre dont le type de retour est string");
                return null;
            }
        }
        return Type.void_t.toString();
    
    }

    @Override
    public String visit(Printi printi) {
        String expre = printi.expr.accept(this);
        // si expre est null on return null
        // pour chaque vérification , si il ya erreur on return null
        Expr_list list = (Expr_list)printi.expr;
        ArrayList<Ast> param = list.array;
        if (expre==null){
            return null;
        }
        if(param.size() != 1){
            System.out.println("Ligne " + printi.line + " : " + "Erreur : printi requiert 1 paramètre, mais " + param.size() + "paramètres ont ete donnes");
            return null;
        }
        if(!expre.equals(Type.int_t.toString())){
            System.out.println("Ligne " + printi.line + " : " + "Erreur : printi requiert un paramètre dont le type de retour est int_t");
            return null;
        }

        return Type.void_t.toString();
    }

    @Override
    public String visit(Negation negation) {
        String expre = negation.right.accept(this);
        if(expre==null){
            return null;
        }
        if(!expre.equals(Type.int_t.toString())){
            System.out.println("Ligne " + negation.line + " : " + "Erreur : la  négation s'effectue exclusivement sur des expressions de type int_t");
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(Expr_list expr_list) {
        for (Ast expr : expr_list.array) {
            if(expr.accept(this)==null){
                return null;
            }
        }
        return Type.void_t.toString();  
    }

     //-------------------------------------------
    @Override
    public String visit(FunctionCall functionCall) {
        Identifier id = (Identifier)functionCall.left;
        String name = id.value;
        TdsFunction func = findFunc(name);
        if (func==null) {//Vérification de l'existence de la fonction
            System.out.println("Ligne " + functionCall.line + " : " + "Erreur : la fonction " + name + " n'est pas définie");
            return null;
        }else{
            Expr_list list = (Expr_list)functionCall.right; 
            ArrayList<Ast> paramFournis = list.array;
            ArrayList<String> listParametresAttendus = func.getParameters();
            if(paramFournis.size() != listParametresAttendus.size()){// Vérification du nombre d'arguments
                System.out.println("Ligne " + functionCall.line + " : " + "Erreur : l'appel de cette fonction requiert "+ listParametresAttendus.size() +" paramètre(s), mais " + paramFournis.size() + " paramètre(s) ont été donné(s)");
                return null;
            }
            else{
                for (int i=0;i< paramFournis.size(); i++) {           // Vérification des types d'arguments
                    String param = paramFournis.get(i).accept(this);
                    if( !param.equals(listParametresAttendus.get(i))) {         
                        System.out.println("Ligne " + functionCall.line + " : " + "Erreur : l'appel de cette fonction requiert un argument de type " + listParametresAttendus.get(i) + " à la position " + Integer.toString(i+1)  +" mais un argument de type " + param + " a été donné");
                        return null;
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
            System.out.println("Ligne " + assignement.line + " : " + "Erreur : on ne peut pas assigner un type "+rightIdentifier+" à une variable de type "+leftIdentifier);
            return null;
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(IfThenElse ifthenelse) {
        String left = ifthenelse.left.accept(this);
        String middle = ifthenelse.middle.accept(this);
        String returType = middle;
        if (left == null || middle == null){
           
            return null;
        }
        if(!left.equals(Type.int_t.toString())){
            System.out.println("Ligne " + ifthenelse.line + " : " + "Erreur : la condition d'un ifthenelse doit etre de type int_t");
            return null;
        }
        String right = null;
        if(ifthenelse.right!=null){
            right = ifthenelse.right.accept(this);
            if(!middle.equals(right)){
                System.out.println(middle +" " +right);
                System.out.println("Ligne "+ifthenelse.line+ " : "+"Erreur : la 2eme et 3eme expression du if_then_else doivent être du même type");
            }
            returType = right;
        }
        else{
            return Type.void_t.toString();
        }
        return returType;
    }

    @Override
    public String visit(Substring_ substring) {
        Expr_list list = (Expr_list)substring.right;
        ArrayList<Ast> param = list.array;
        if(substring.right.accept(this)==null){
            return null;
        }
        if(param.size() != 3){
            System.out.println("Ligne " + substring.line + " : " + "Erreur : substring requiert 3 parametres,  " + param.size() + " ont ete donnes");
            return null;
        }else{
            String[] types = {Type.string_t.toString(),Type.int_t.toString(),Type.int_t.toString()};
            for(int i = 0; i < param.size(); i++){
                Ast id = param.get(i);
                if( id.accept(this) != types[i]){
                    System.out.println("Ligne " + substring.line + " : " + "Erreur : substring requiert un parametre de type " + types[i] + " à la position " + Integer.toString(i+1) + " mais un parametre de type " + id.accept(this) + " a été donné");
                    return null;
                }
            }
        }
        return Type.string_t.toString();
    }

    @Override
    public String visit(Concat_ concat_) {
        Expr_list list = (Expr_list)concat_.right;
        ArrayList<Ast> param = list.array;
        if(concat_.right.accept(this)==null){
            return null;
        }
        if(param.size() != 2){
            System.out.println("Ligne " + concat_.line + " : " + "Erreur : concat requiert 2 parametres, mais " + param.size() + " ont ete donnes");
            return null;
        }else{
            int countstring = 0;
            for(int i = 0; i < param.size(); i++){
                Ast  id  = param.get(i);
                if(id.accept(this) == Type.string_t.toString()){
                    countstring++;
                }
            }
            if(!(countstring ==  2)){
                System.out.println("Ligne " + concat_.line + " : " + "Erreur : concat requiert de 2 parametres de type string ");
                return null;
            }
        }
        return Type.string_t.toString();
    }

    @Override
    public String visit(Ord_ ord_) {
        Expr_list list = (Expr_list)ord_.right;
        ArrayList<Ast> param = list.array;
        if(ord_.right.accept(this)==null){
            return null;
        }
        if(param.size() != 1){
            System.out.println("Ligne " + ord_.line + " : " + "Erreur : ord requiert 1 parametre, " + param.size() + " ont ete donnes");
            return null;
        }else{
            int countstring = 0;
            for(int i = 0; i < param.size(); i++){
                Ast  id  = param.get(i);
                if(id.accept(this) == Type.string_t.toString()){
                    countstring++;
                }
            }
            if(!(countstring ==  1)){
                System.out.println("Ligne " + ord_.line + " : " + "Erreur : ord requiert de 1 paramètres de type string ");
                return null;
            }
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(Size_ size_) {
        Expr_list list = (Expr_list)size_.right;
        ArrayList<Ast> param = list.array;
        if (size_.right.accept(this)==null){
            return null;
        }
        if(param.size() != 1){
            System.out.println("Ligne " + size_.line + " : " + "Erreur : size requiert 1 paraèetre, " + param.size() + " ont été donnes");
            return null;
        }else{
            int countstring = 0;
            for(int i = 0; i < param.size(); i++){
                Ast  id  = param.get(i);
                if(id.accept(this) == Type.string_t.toString()){
                    countstring++;
                }
            }
            if(!(countstring ==  1)){
                System.out.println("Ligne " + size_.line + " : " + "Erreur : size requiert de 1 paramètres de type string ");
                return null;
            }
        }
        return Type.int_t.toString();
    }

    @Override
    public String visit(Not_ not_) {
        Expr_list list = (Expr_list)not_.right;
        ArrayList<Ast> param = list.array;
        if(not_.right.accept(this)==null){
            return null;
        }
        if(param.size() != 1){
            System.out.println("Ligne " + not_.line + " : " + "Erreur : not requiert 1 parametre, mais " + param.size() + " ont ete donnes");
            return null;
        }else{
            int countint = 0;
            for(int i = 0; i < param.size(); i++){
                Ast  id  = param.get(i);
                if(id.accept(this) == Type.int_t.toString()){
                    countint++;
                }
            }
            if(!(countint ==  1)){
                System.out.println("Ligne " + not_.line + " : " + "Erreur : not requiert de 1 parametres de type int ");
                return null;
            }
        }
        return Type.int_t.toString();
    }
     
    @Override
    public String visit(TypeDec1 typeDec1) {
        if(typeDec1.typefields.accept(this) == null){
            return null;
        }
        return Type.record_t.toString();
    }
     
    @Override
    public String visit(TypeDec2 typeDec2) {
        return Type.array_t.toString();
    }
     
    @Override
    public String visit(Type_fields type_fields) {
        for (Ast t : type_fields.fields) {
                if(t.accept(this) == null){
                    return null;
                }
        }
        return Type.void_t.toString();
    }
    
    @Override
    public String visit(Type_field type_field) {
        String id = ((Identifier)type_field.name).value;
        if (currentTds.contains(id)) {
            System.out.println("Ligne " + type_field.line + " : " + "Erreur : duplication du champ "+ id);
            return null;
        }else{
            Identifier id2 = (Identifier)type_field.type;
            String type = id2.value;
            TdsType t = findType(type);
            if(t == null){
                System.out.println("Ligne " + type_field.line + " : " + "Erreur : le type "+ type + " n'existe pas");
                return null;
            }
            switch(type){
                case "int":
                    type = Type.int_t.toString();
                    break;
                case "string":
                    type = Type.string_t.toString();
                    break;
                case "nil": 
                    type = Type.nil_t.toString();
                    break;
            }
            if(inFunction){
                TdsVariable f = new TdsVariable(id);
                f.setType(type);
                f.setSize(0);
                f.setTds(currentTds);
                currentTds.addElement(f);
            }else{
                TdsTypeField f = new TdsTypeField(id);
                f.setTds(currentTds);
                f.setType(type);
                currentTds.addElement(f);
            }
        }
        return Type.void_t.toString();
    }
     //------------------------------------------
    @Override
    public String visit(Variable_declaration variable_declaration) {
        Identifier id = (Identifier)variable_declaration.name;
        String name = id.value;
        TdsVariable var = findVar(name);
        if (var != null) {
            System.out.println("Ligne " + variable_declaration.line + " : " + "Erreur : double déclaration de la variable " + var.getName());
            return null;
        }
        String type= null;
        Tds save = currentTds;
        if(variable_declaration.type!=null){
            Identifier id2 = (Identifier)variable_declaration.type;
            type = id2.value;
            TdsType t = findType(type);
            if(t == null){
                System.out.println("Ligne " + variable_declaration.line + " : " + "Erreur : le type "+ type + " n'existe pas");
                currentTds=save;
                return null;
            }
            type= t.getName();
            String type2 = variable_declaration.expr.accept(this);
            if(type != type2){
                System.out.println("Ligne " + variable_declaration.line + " : " + "Erreur : le type de la variable " + name + " n'est pas le même que celui de l'expression associée");
                currentTds=save;
                return null;
            }
        }
        else{
            type = variable_declaration.expr.accept(this);
        }
        currentTds=save;
        if(type!=null){
            TdsVariable v = new TdsVariable(name);
            v.setType(type);
            v.setSize(0);
            v.setTds(currentTds);
            currentTds.addElement(v);
        }
        return Type.void_t.toString();
    }
     //-------------------------------------------
    @Override
    public String visit(Function_declaration function_declaration) {
        inFunction = true;
        String name = ((Identifier)function_declaration.name).value;
        TdsFunction func = findFunc(name);
        if (func != null) {
            System.out.println("Ligne " + function_declaration.line + " : " + "Erreur : double déclaration de la fonction " + func.getName());
            inFunction = false;
            return null;
        }
        currentBlock++;
        currentImbrication++;
        Tds save = currentTds;
        FuncTds tds = new FuncTds(name, currentBlock, currentImbrication, currentTds);
        TdsFunction f = new TdsFunction(name);
        currentTds.addElement(f);
        f.setType(Type.void_t.toString());
        f.setTds(currentTds);
        tdsList.add(tds);

        currentTds = tds;
        ArrayList<String> params = new ArrayList<String>();
        String returnType= Type.void_t.toString();
        if(function_declaration.paramsOrReturnType!=null){
            if(function_declaration.paramsOrReturnType instanceof Identifier){
                returnType = function_declaration.paramsOrReturnType.accept(this);
                if(returnType==null){
                    currentTds=save;
                    inFunction = false;
                    currentTds.supprimerElement(f); 
                    System.out.println("here");               
                    tdsList.remove(tds);
                    return null;
                }
            }
            else{
                if(function_declaration.paramsOrReturnType.accept(this)!=null){
                    Type_fields e = (Type_fields)function_declaration.paramsOrReturnType;
                    for (Ast f_ : e.fields) {
                        String t = ((Identifier)((Type_field)f_).type).value;
                        if(t.equals("int") || t.equals("string") || t.equals("nil")){
                            t+= "_t";
                        }
                        params.add(t);
                        f.setParametres(params);
                    }
                }
                else{
                    currentTds=save;
                    inFunction = false;
                    currentTds.supprimerElement(f);
                    System.out.println("here2");                 
                    tdsList.remove(tds);
                    return null;
                }
            }
        }
        if(function_declaration.return_type!=null){
            returnType = function_declaration.return_type.accept(this);
            if(returnType==null){
                currentTds=save;
                inFunction = false;
                currentTds.supprimerElement(f);
                System.out.println("here3");             
                tdsList.remove(tds);
                return null;
            }
        }
        
        String r = null;
        if (function_declaration.body != null){
            r= function_declaration.body.accept(this);
            if (r == null) {
                currentTds=save;
                inFunction = false;
                currentTds.supprimerElement(f);
                System.out.println("here4");                   
                tdsList.remove(tds);
                return null;
            }
            if (!r.equals(returnType) && !returnType.equals(Type.void_t.toString())) {
                System.out.println("Ligne " + function_declaration.line + " : " + "Erreur : la fonction doit retourner un type "+returnType);
                currentTds=save;
                inFunction = false;
                currentTds.supprimerElement(f);
                System.out.println("here5");                    
                tdsList.remove(tds);
                return null;
            }else{
                returnType = r;
                f.setReturnType(returnType);
            }
        }
        currentTds = tds.getParent();
        currentImbrication--;
        inFunction = false;
        return Type.void_t.toString();
    }
     //-------------------------------------------

    @Override
    public String visit(Field field) {
        String name = ((Identifier)field.name).value;
        if (!currentTds.contains(name)) {
            System.out.println("Ligne " + field.line + " : " + "Erreur : le champ " + name + " n'existe pas pour la structure "+currentTds.getElements().get(0).getName() );
            return null;
        }else{
            String type = field.expr.accept(this);
            if (type == null) {
                return null;
            }else{
                if (!currentTds.getElement(name).getType().equals(type)) {
                    System.out.println("Ligne " + field.line + " : " + "Erreur : le champ "+name+" doit être de type "+ currentTds.getElement(name).getType());
                    return null;
                }
            }
        }
        return Type.void_t.toString();
    }
     //-----------------------------------------
    @Override
    public String visit(Field_list field_list) {
        if(currentTds.getElements().size()-1!=field_list.fields.size()){
            System.out.println("Ligne " + field_list.line + " : " + "Erreur : la structure " + currentTds.getElements().get(currentTds.getElements().size()-1).getName() +" possède " + Integer.toString(currentTds.getElements().size()-1) +" champs");
            return null;
        }
        for (Ast f : field_list.fields) {
            if(f.accept(this)==null){
                return null;
            }
        }
        return Type.void_t.toString();
    }

     //-----------------------------------------
    @Override
    public String visit(AccessId accessId) {
        String left = accessId.left.accept(this);
        if (left == null) {
            return null;
        }
        TdsType tdsType = findType(left);
        if(!(tdsType instanceof TdsType) || tdsType instanceof TdsArrayType){
            System.out.println("Ligne " + accessId.line + " : " + "Erreur : la variable de type " + left + " n'est pas une structure");
            return null;
        }else{
            String right = ((Identifier)accessId.rigth).value;
            Tds t = getTypeTds(left);
            if(t==null){
                return null;
            }
            if (!t.contains(right)) {
                System.out.println("Ligne " + accessId.line + " : " + "Erreur : le champ " + right + " n'existe pas pour la structure "+left);
                return null;
            }else{
                return t.getElement(right).getType();
            }
        }   

                 
    }

     //-----------------------------------------
    @Override
    public String visit(AccessIndex accessIndex) {
        String left = accessIndex.left.accept(this);
        if (left == null) {
            return null;
        }
        TdsType tdsType = findType(left);
        if(!(tdsType instanceof TdsArrayType)){
            System.out.println("Ligne " + accessIndex.line + " : " + "Erreur : la variable de type " + left + " n'est pas un tableau");
            return null;
        }else{
            String right = accessIndex.rigth.accept(this);
            if(right==null){
                return null;
            }
            if(!right.equals(Type.int_t.toString())){
                System.out.println("Ligne " + accessIndex.line + " : " + "Erreur : l'indice doit être de type entier");
                return null;
            }else{
                return ((TdsArrayType)tdsType).getBaseType();
            }
        }
    }
    
     //-----------------------------------------
    @Override
    public String visit(RecordDec recordDec) {
        Identifier id = (Identifier)recordDec.id;
        String name = id.value;
        TdsType type = findType(name);
        if (type==null) {
            System.out.println("Ligne " + recordDec.line + " : " + "Erreur : le type "+name+" n'est pas défini" );
            return null;
        }
        else{
            Tds tds = getTypeTds(name);
            TdsType e = (TdsType)tds.getElement(name);
                if (!e.getType().equals(Type.record_t.toString())) {
                    System.out.println("Ligne " + recordDec.line + " : " + "Erreur : " + id + " n'est pas un type de structure");
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
            System.out.println("Ligne " + arrayDec.line + " : " + "Erreur : le type "+name+" n'est pas défini" );
            return null;
        }
        else{
            Tds tds = getTypeTds(name);
            if (tds==null) {
                System.out.println("tds null");
            }
            TdsType e = (TdsType)tds.getElement(name);
                if (!e.getType().equals(Type.array_t.toString())) {
                    System.out.println("Ligne " + arrayDec.line + " : " + "Erreur : " + id + " n'est pas un type de tableau");
                    return null;
                }
        }
        String size = arrayDec.expr1.accept(this);
        if (!size.equals(Type.int_t.toString())) {
            System.out.println("Ligne " + arrayDec.line + " : " + "Erreur : la taille d'un array doit être de type int");
            return null;
        }
        String base = arrayDec.expr2.accept(this);
        Tds tds = getTypeTds(name);
        TdsArrayType e = (TdsArrayType)tds.getElement(name);
        if(!e.getBaseType().equals(base)){
            System.out.println("Ligne " + arrayDec.line + " : " + "Erreur : le type " + base + " ne correspond pas au type " + e.getBaseType() + " de " +name);
            return null;
        }
        return name;
    }

    
}
