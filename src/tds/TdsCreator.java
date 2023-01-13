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
            if (t.getName().contains(Name)) {
                return t;
            }
        }
        return null;
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
    @Override
    public String visit(Or or) {
        

        String gauche =or.left.accept(this);
        String droit =or.rigth.accept(this);

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("Le or compare deux int");
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
        Expr_list list = (Expr_list)exit_.exp;
        ArrayList<Ast> param = list.array;
        if (param.size()!=1){
            System.out.println("exit attend qu'un seul paramètre");
        }

        else if(!exp.equals(Type.INT.toString())){
            System.out.println("exit attend un int comme paramètre");
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

        
        Expr_list list = (Expr_list)chr_.exp;
        ArrayList<Ast> param = list.array;
        if (param.size()!=1){
            System.out.println("chr attend qu'un seul paramètre");
        }

        if(!index.equals(Type.INT.toString())){
            System.out.println("chr attend un int comme paramètre");
        }
        return null;
    }

    @Override
    public String visit(And and) {
        

        String gauche =and.left.accept(this);
        String droit =and.rigth.accept(this);

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("Le and compare deux int");
        }
        return Type.INT.toString();
        
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) {
        

        String leftIdentifier = compare_equal_1.left.accept(this);
        String rightIdentifier = compare_equal_1.rigth.accept(this);

        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("<> compare que les objets de même type");
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(Compare_equal_2 compare_equal_2) {
        
        String leftIdentifier = compare_equal_2.left.accept(this);
        String rightIdentifier = compare_equal_2.rigth.accept(this);


        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("== compare que les objets de même type");
        }
        return Type.INT.toString();
    }

    @Override
    public String visit(GreaterThan1 greaterThan1) {
        

        String leftIdentifier = greaterThan1.left.accept(this);
        String rightIdentifier = greaterThan1.rigth.accept(this);
        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println(">= compare deux int ou deux String");
        }
        


        return Type.INT.toString();
    }

    @Override
    public String visit(GreaterThan2 greaterThan2) {
        
        String leftIdentifier = greaterThan2.left.accept(this);
        String rightIdentifier = greaterThan2.rigth.accept(this);
        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println("> compare deux int ou deux String");
        }
        


        return Type.INT.toString();
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        
        String leftIdentifier = lessThan1.left.accept(this);
        String rightIdentifier = lessThan1.rigth.accept(this);
        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println("<= compare deux int ou deux String");
        }
        

        return Type.INT.toString();
    }

    @Override
    public String visit(LessThan2 lessThan2) {
        
        String leftIdentifier = lessThan2.left.accept(this);
        String rightIdentifier = lessThan2.rigth.accept(this);
        if(!((leftIdentifier.equals(Type.INT.toString()) && rightIdentifier.equals(Type.INT.toString()))||(leftIdentifier.equals(Type.STRING.toString()) && rightIdentifier.equals(Type.STRING.toString())))){
            System.out.println("< compare deux int ou deux String");
        }
        


        return Type.INT.toString();
    }

    @Override
    public String visit(Plus plus) {
        
        String gauche =plus.left.accept(this);
        String droit =plus.rigth.accept(this);

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("+ ne fait des opérations que sur des int");
        }

        return Type.INT.toString();
        
    }

    @Override
    public String visit(Moins moins) {
        
        String gauche =moins.left.accept(this);
        String droit =moins.rigth.accept(this);

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("- ne fait des opérations que sur des int");
        }

        return Type.INT.toString();
        
    }

    @Override
    public String visit(Mult mult) {
        
        String gauche =mult.left.accept(this);
        String droit =mult.rigth.accept(this);

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("* ne fait des opérations que sur des int");
        }

        return Type.INT.toString();
        
    }

    @Override
    public String visit(Divide divide) {
        
        String gauche =divide.left.accept(this);
        String droit =divide.rigth.accept(this);

        if(!gauche.equals(Type.INT.toString())||!droit.equals(Type.INT.toString())){
            System.out.println("/ ne fait des opérations que sur des int");
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
            Tds tdsPere = currentTds;
        Tds tdsFils = currentTds;
        while ((tdsPere = tdsFils.getParent()) != null) {
            if(tdsPere.contains(identifier.value)){
                return identifier.accept(this);
            }
			
            else {
                tdsFils=tdsPere;
            }
		}
        System.out.println("l'identificateur : "+identifier.value+" n'existe pas ");
        return null;

       }
    }

    @Override
    public String visit(Expr_seq expr_seq) {
        String returnType = Type.VOID.toString();
        for (Ast expr : expr_seq.array) {
            returnType = expr.accept(this);
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
        for(Tds t : tdsList){
            if (t.getName().contains(id.value)) {
                if (currentTds.equals(t.getParent())) {
                    System.out.println("Erreur : double déclaration du type :" + id.value);
                    return Type.VOID.toString();
                } else {
                    Tds parent = currentTds.getParent();
                    while (parent!=null) {
                        if(parent.getNumImbrication()==t.getParent().getNumImbrication()){
                            System.out.println("Erreur : double déclaration du type :" + id.value);
                        return Type.VOID.toString();
                        }
                        else{
                            parent=parent.getParent();
                        }
                    }
                }
            }
        }
        currentBlock++;
        currentImbrication++;
        Tds typeTds = new Tds(id.value, currentBlock, currentImbrication, currentTds);
        currentTds = typeTds;
        Type type = type_declaration.type.accept(this) == Type.ARRAY.toString() ? Type.ARRAY : Type.RECORD;
        type_declaration.type.accept(this);
        currentTds = typeTds.getParent();
        TdsType tdsType = new TdsType(id.value,type,currentTds);
        currentTds.addElement(tdsType);
        currentImbrication--;
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
        // verifier si bien dans for or while : break is illegal outside
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
            System.out.println("erreur: la  négation s'effectue exclusivement sur des paramètres de type INT");
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
        String left = functionCall.left.accept(this);
        Expr_list list = (Expr_list)functionCall.right; 
        ArrayList<Ast> paramFournis = list.array;
        // ArrayList<String[]> paramFournis = new ArrayList<String[]>();
        // for (Ast ast : param){
        //     paramFournis.add([ast.left;ast.right]);
        // }

        if (left != null) {  //   Vérification de l'existence de la fonction

            for (Tds tds : tdsList){   
                String id = ((Identifier)functionCall.left).value;
                if (tds.getName().equals(id+"_f")) {
                    ArrayList<String> listParametresAttendus = ((TdsFunction)tds.getElement(id)).getParameters();

                    if(paramFournis.size() != listParametresAttendus.size()){          // Vérification du nombre d'arguments
                        System.out.println("erreur: l'appel de cette fonction requiert "+ listParametresAttendus.size() +" paramètre(s), mais " + paramFournis.size() + "paramètre(s) ont été donné(s)");
                        return Type.VOID.toString();
                    }
                    for (int i=0;i< paramFournis.size(); i++) {           // Vérification des types d'arguments
                        String param = paramFournis.get(i).accept(this);
                        if( param != listParametresAttendus.get(i)) {         

                                System.out.println("erreur: l'appel de cette fonction requiert un argument de type"+ listParametresAttendus.get(i) +" mais un argument de type" + param + "a été donné(s)");
                                return Type.VOID.toString();
                            }
                    }    
				return tds.toString();
                }
                
      
            }
        }
        
        // cas où la variable n'est pas défnie

        System.out.println("Erreur : " + left + "est une fonction qui n'a jamais été déclarée");
        return Type.VOID.toString();

    }

  
    @Override
    public String visit(Assignement assignement) {

        String leftIdentifier = assignement.left.accept(this);
        String rightIdentifier = assignement.right.accept(this);


        if(!leftIdentifier.equals(rightIdentifier)){
            System.out.println("on ne peut pas assigner : "+leftIdentifier+" à un type : "+rightIdentifier);
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
        typeDec1.typefields.accept(this);
        return Type.RECORD.toString();
    }
     
    @Override
    public String visit(TypeDec2 typeDec2) {
        typeDec2.idf.accept(this);
        return Type.ARRAY.toString();
    }
     
    @Override
    public String visit(Type_fields type_fields) {
        for (Ast t : type_fields.fields) {
                t.accept(this);
        }
        return Type.VOID.toString();
    }
     
    @Override
    public String visit(Type_field type_field) {
        String id = ((Identifier)type_field.name).value;
        if (currentTds.contains(id)) {
            System.out.println("Erreur : duplication du champ "+ id);
        }else{
            TdsTypeField f = new TdsTypeField(id,type_field.type.accept(this), currentTds);
            currentTds.addElement(f);
        }
        return Type.VOID.toString();
    }
     //------------------------------------------
    @Override
    public String visit(Variable_declaration variable_declaration) {
        String name = variable_declaration.name.toString();
        Tds tdsPere = currentTds;
        Tds tdsFils = currentTds;
        while ((tdsPere = tdsFils.getParent()) != null) {
            if(tdsPere.contains(name)){
                System.out.println("Erreur : duplication de l'identificateur " + name);
                return Type.VOID.toString();
            }
            else {
                tdsFils=tdsPere;
            }
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
        currentTds.addElement(new TdsVariable(name, type, 0, currentTds));
        return Type.VOID.toString();
    }
     //-------------------------------------------
    @Override
    public String visit(Function_declaration function_declaration) {
        String name = ((Identifier)function_declaration.name).value;
        Tds tdsPere = currentTds;
        Tds tdsFils = currentTds;
        while ((tdsPere = tdsFils.getParent()) != null) {
            if(tdsPere.contains(name)){
                System.out.println("Erreur : duplication de l'identificateur " + name);
                return Type.VOID.toString();
            }
			
            else {
                tdsFils=tdsPere;
            }
		}
        currentBlock++;
        currentImbrication++;
        ArrayList<String> params = new ArrayList<String>();
        String returnType= null;
        if(function_declaration.paramsOrReturnType!=null){
            if(function_declaration.paramsOrReturnType instanceof Identifier){
                returnType = function_declaration.paramsOrReturnType.accept(this);
            }
            else{
                function_declaration.paramsOrReturnType.accept(this);
                Type_fields e = (Type_fields)function_declaration.paramsOrReturnType;
                for (Ast f : e.fields) {
                    params.add(((Identifier)((Field)f).expr).value);
                }
            }
        }
        if(function_declaration.return_type!=null){
            returnType = function_declaration.return_type.accept(this);
        }
        currentTds.addElement(new TdsFunction(name,params,Type.VOID,returnType, currentTds));
        Tds tds = new Tds(name, currentBlock, currentImbrication, currentTds);
        tdsList.add(tds);
        currentTds = tds;
        function_declaration.body.accept(this);
        currentTds = tds.getParent();
        currentImbrication--;
        return Type.VOID.toString();
    }
     //-------------------------------------------

    @Override
    public String visit(Field field) {
        String name = ((Identifier)field.name).value;
        if (!currentTds.contains(name)) {
            System.out.println("Erreur : le champ :" + name + " n'existe pas");
        }
        return Type.VOID.toString();
    }
     //-----------------------------------------
    @Override
    public String visit(Field_list field_list) {
        if(currentTds.getElements().size()-1!=field_list.fields.size()){
            System.out.println("Erreur : le record " + currentTds.getElements().get(0).getName() +" possède " + currentTds.getElements().size() +" champs");
        }
        for (Ast f : field_list.fields) {
            f.accept(this);
        }
        return Type.VOID.toString();
    }

     //-----------------------------------------
    @Override
    public String visit(AccessId accessId) {
        

        String left = accessId.left.accept(this);
        String right = accessId.rigth.accept(this);

        String id = ((Identifier)(accessId.left)).value;
        if (left.equals(Type.RECORD.toString())) {  //  verifier que c'est une variable qui existe
            Tds tds = getTds(id+"_t");
            if(tds==null){
                System.out.println("Erreur : le record "+id+" n'existe pas");
                return Type.VOID.toString();

            }else{
                if (tds.contains(((Identifier)(accessId.left)).value)){
                        return tds.getElement(right).getType().toString();
                    }               
                
                System.out.println("Erreur : le champ" + right + " n'existe pas pour " + left);
                return Type.VOID.toString();
            }
                
        }
        
        else { // cas où la variable n'est pas défnie

            System.out.println("Erreur : le record "+id+" n'existe pas");
            return Type.VOID.toString();
        }             
    }

     //-----------------------------------------
    @Override
    public String visit(AccessIndex accessIndex) {
        String left = accessIndex.left.accept(this);
        String right = accessIndex.rigth.accept(this);

        String id = ((Identifier)(accessIndex.left)).value;
        if (left.equals(Type.ARRAY.toString())) {  //  verifier que c'est un tableau qui existe
            Tds tds = getTds(id+"_t");
            if(tds==null){
                System.out.println("Erreur : le tableau "+id+" n'existe pas");
                return Type.VOID.toString();

            }else {
                                            //  verifier que right est bien de type int     
                if (right.equals(Type.INT.toString())){
                    return ((TdsArrayType)tds.getElement(id)).getBaseType();
                }

                System.out.println("Erreur : " + right + "n'est pas de type int");
                return Type.VOID.toString();    

            }               
        }       

        // cas où la variable n'est pas défnie

        System.out.println("Erreur : le tableau "+id+" n'existe pas");
        return Type.VOID.toString();
           
    }
    
     //-----------------------------------------
    @Override
    public String visit(RecordDec recordDec) {
        String id =  recordDec.id.accept(this);
        if (id!=null) {
            Tds tds = getTds(id);
            if (tds==null) {
                System.out.println("Erreur :" + id + " n'est pas un type de record");
            }
            else{
                TdsType e = (TdsType)tds.getElement(id);
                if (!e.getType().equals(Type.RECORD.toString())) {
                    System.out.println("Erreur :" + id + " n'est pas un type de record");
                }
                else{
                    currentTds = tds;
                }
            }
        }
        recordDec.list.accept(this);
        return id;
    }
     //-----------------------------------------
    @Override
    public String visit(ArrayDec arrayDec) {
        String id = arrayDec.id.accept(this);
        String size = arrayDec.expr1.accept(this);
        if (!size.equals(Type.INT.toString())) {
            System.out.println("Erreur : la taille d'un array doit être de type int");
        }
        String base = arrayDec.expr2.accept(this);
        if (id!=null) {
            Tds tds = getTds(id);
            if (tds==null) {
                System.out.println("Erreur :" + id + " n'est pas un type d'array");
            }else{
                TdsArrayType e = (TdsArrayType)tds.getElement(id);
                if (!e.getType().equals(Type.ARRAY.toString())) {
                    System.out.println("Erreur :" + id + " n'est pas un type d'array");
                }
                else{
                    if(!e.getBaseType().equals(base)){
                        System.out.println("Erreur : le type " + base + " ne correspond pas au type " + e.getBaseType() + " de  " +id);
                    }
                }
            }
        }
        return id;
    }

    
}
