package graphViz;

import java.io.FileOutputStream;
import java.io.IOException;

import ast.*;

public class GraphVizVisitor implements AstVisitor<String> {

    private int state;
    private String nodeBuffer;
    private String linkBuffer;

    public GraphVizVisitor(){
        this.state = 0;
        this.nodeBuffer = "digraph \"ast\"{\n\n\tnodesep=1;\n\tranksep=1;\n\n";
        this.linkBuffer = "\n";
    }

    public void dumpGraph(String filepath) throws IOException{
            
        FileOutputStream output = new FileOutputStream(filepath);

        String buffer = this.nodeBuffer + this.linkBuffer+"}";
        byte[] strToBytes = buffer.getBytes();

        output.write(strToBytes);

        output.close();

    }


    private String nextState(){
        int returnedState = this.state;
        this.state++;
        return "N"+ returnedState;
    }

    private void addTransition(String from,String dest){
        this.linkBuffer += String.format("\t%s -> %s; \n", from,dest);

    }

    private void addNode(String node,String label){
        this.nodeBuffer += String.format("\t%s [label=\"%s\", shape=\"box\"];\n", node,label);

    }


    @Override
    public String visit(Program program){
        String nodeIdentifier = this.nextState();//node de base
        String exprIdentifier = program.expr.accept(this);//nodes fils

        this.addNode(nodeIdentifier, "Program");//creer node principale
        this.addTransition(nodeIdentifier, exprIdentifier);//transition entre pere et fils
        return nodeIdentifier;
    }

    @Override
    public String visit(Or or){
        String nodeIdentifier = this.nextState();
        String leftIdentifier = or.left.accept(this);
        String rightIdentifier = or.rigth.accept(this);

        this.addNode(nodeIdentifier, "Or");
        this.addTransition(nodeIdentifier, rightIdentifier);
        this.addTransition(nodeIdentifier, leftIdentifier);

        return nodeIdentifier;
    }

    @Override
    public String visit(Flush_ flush_) {
        String node = this.nextState();
        this.addNode(node, "flush()");
        return node;
    }

    public String visit(And and){
        String node = this.nextState();
        String leftIdentifier = and.left.accept(this);
        String rightIdentifier = and.rigth.accept(this);

        this.addNode(node, "And");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Compare_equal_1 compare_equal_1) {
        String node = this.nextState();
        String leftIdentifier = compare_equal_1.left.accept(this);
        String rightIdentifier = compare_equal_1.rigth.accept(this);

        this.addNode(node, "<>");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }
    
    @Override
    public String visit(Compare_equal_2 compare_equal_2) {
        String node = this.nextState();
        String leftIdentifier = compare_equal_2.left.accept(this);
        String rightIdentifier = compare_equal_2.rigth.accept(this);

        this.addNode(node, "=");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }


    @Override
    public String visit(GreaterThan1 greaterThan1) {
        String node = this.nextState();
        String leftIdentifier = greaterThan1.left.accept(this);
        String rightIdentifier = greaterThan1.rigth.accept(this);

        this.addNode(node, ">=");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }
    

    @Override
    public String visit(GreaterThan2 greaterThan2) {
        String node = this.nextState();
        String leftIdentifier = greaterThan2.left.accept(this);
        String rightIdentifier = greaterThan2.rigth.accept(this);

        this.addNode(node, ">");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(LessThan1 lessThan1) {
        String node = this.nextState();
        String leftIdentifier = lessThan1.left.accept(this);
        String rightIdentifier = lessThan1.rigth.accept(this);

        this.addNode(node, "<=");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(LessThan2 lessThan2) {
        String node = this.nextState();
        String leftIdentifier = lessThan2.left.accept(this);
        String rightIdentifier = lessThan2.rigth.accept(this);

        this.addNode(node, "<");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Plus plus) {
        String node = this.nextState();
        String leftIdentifier = plus.left.accept(this);
        String rightIdentifier = plus.rigth.accept(this);

        this.addNode(node, "+");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Moins moins) {
        String node = this.nextState();
        String leftIdentifier = moins.left.accept(this);
        String rightIdentifier = moins.rigth.accept(this);

        this.addNode(node, "-");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Mult mult) {
        String node = this.nextState();
        String leftIdentifier = mult.left.accept(this);
        String rightIdentifier = mult.rigth.accept(this);

        this.addNode(node, "*");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Divide divide) {
        String node = this.nextState();
        String leftIdentifier = divide.left.accept(this);
        String rightIdentifier = divide.rigth.accept(this);

        this.addNode(node, "/");
        this.addTransition(node, rightIdentifier);
        this.addTransition(node, leftIdentifier);

        return node;
    }

    @Override
    public String visit(Exit_ exit_) {
        String node = this.nextState();
        this.addNode(node, "exit()");
        String exp = exit_.exp.accept(this);
        this.addTransition(node, exp);
        return node;
    }

    @Override
    public String visit(Whiledo whiledo) {
        String node = this.nextState();
        String node2 = this.nextState();
        String node3 = this.nextState();

        String cond = whiledo.cond.accept(this);
        String block = whiledo.doBlock.accept(this);

        this.addNode(node, "WhileDo");
        this.addNode(node2, "While");
        this.addNode(node3, "Do");

        this.addTransition(node, node2);
        this.addTransition(node, node3);

        this.addTransition(node2, cond);
        this.addTransition(node3, block);

        return node;
    }

    @Override
    public String visit(Getchar getchar) {
        String node = this.nextState();
        this.addNode(node, "getchar()");
        return node;
    }

    @Override
    public String visit(For_ for_) {
        String node = this.nextState();
        String node2 = this.nextState();
        String node3 = this.nextState();
        String node4 = this.nextState();
        String node5 = this.nextState();

        String idf = for_.idf.accept(this);
        String e1 = for_.expr1.accept(this);
        String e2 = for_.expr2.accept(this);
        String e3 = for_.expr3.accept(this);

        this.addNode(node, "ForLoop");
        this.addNode(node2, "For");
        this.addNode(node3, ":=");
        this.addNode(node4, "To");
        this.addNode(node5, "Do");

        this.addTransition(node, node2);
        this.addTransition(node, node3);
        this.addTransition(node, node4);
        this.addTransition(node, node5);


        this.addTransition(node2, idf);
        this.addTransition(node3, e1);
        this.addTransition(node4, e2);
        this.addTransition(node5, e3);

        return node;
    }

    @Override
    public String visit(Chr_ chr_) {
        String node = this.nextState();
        this.addNode(node, "chr()");
        String exp = chr_.exp.accept(this);
        this.addTransition(node, exp);
        return node;
    }

    @Override
    public String visit(Identifier identifier) {
        String node = this.nextState();
        this.addNode(node, identifier.value);
        return node;
    }

    @Override
    public String visit(Let_in_end let_in_end) {
        String node = this.nextState();
        String node2 = this.nextState();
        this.addNode(node2, "Let Block");
        String dec = let_in_end.block1.accept(this);
        this.addNode(node, "Let_in_End");
        this.addTransition(node, node2);
        this.addTransition(node2, dec);
        if (let_in_end.block2!=null) {
            String node3 = this.nextState();
            this.addNode(node3, "In Block");
            this.addTransition(node, node3);
            String seq = let_in_end.block2.accept(this);
            this.addTransition(node3, seq);
        }
        return node;
    }

    @Override
    public String visit(Declaration_list declaration_list) {
        String node = this.nextState();
        this.addNode(node, "decList");
        for (int i = 0; i < declaration_list.decList.size(); i++) {
            String dec = declaration_list.decList.get(i).accept(this);
            this.addTransition(node, dec);
        }
        return node;
    }

    @Override
    public String visit(Type_declaration type_declaration) {
        String node = this.nextState();
        this.addNode(node, "typeDeclaration");
        String idfNode=type_declaration.idf.accept(this);
        String typeNode=type_declaration.type.accept(this);
        this.addTransition(node, idfNode);
        this.addTransition(node, typeNode);
        return node;
    }
    


    @Override
    public String visit(Negation negation) {
        String node = this.nextState();
        this.addNode(node, "Negation");
        String right=negation.right.accept(this);
        this.addTransition(node, right);
        return node;
    }
    
    @Override
    public String visit(Expr_seq expr_seq) {
        String node = this.nextState();
        this.addNode(node, "Expr_seq");
        for (int i = 0; i < expr_seq.array.size(); i++) {
            String right= expr_seq.array.get(i).accept(this);
            this.addTransition(node, right);
        }
        return node;
    }    

    @Override
    public String visit(Expr_list expr_list) {
        String node = this.nextState();
        this.addNode(node, "Expr_list");
        for (int i = 0; i < expr_list.array.size(); i++) {
            String right= expr_list.array.get(i).accept(this);
            this.addTransition(node, right);;
        }
        return node;
    }    

    @Override
    public String visit(FunctionCall functionCall) {
        String node = this.nextState();
        this.addNode(node, "FunctionCall");

        String left=functionCall.left.accept(this);
        this.addTransition(node, left);

        if (functionCall.right!=null) {
            String node2 = this.nextState();
            this.addNode(node2, "Parameters");
            this.addTransition(node, node2);
            String right = functionCall.right.accept(this);
            this.addTransition(node2, right);
        }
        return node;
    }  

    @Override
    public String visit(Assignement assignement) {
        String node = this.nextState();
        this.addNode(node, "Assignement");

        String left=assignement.left.accept(this);
        this.addTransition(node, left);
        String right=assignement.right.accept(this);
        this.addTransition(node, right);

        return node;
    } 

    @Override
    public String visit(IfThenElse ifThenElse) {
        String node = this.nextState();
        String node2 = this.nextState();
        String node3 = this.nextState();
        this.addNode(node, "IfThenElse");
        this.addNode(node2,"If");
        this.addNode(node3,"Then");

        this.addTransition(node, node2);
        this.addTransition(node, node3);

        String left=ifThenElse.left.accept(this);
        this.addTransition(node2, left);
        String middle=ifThenElse.middle.accept(this);
        this.addTransition(node3, middle);

        if (ifThenElse.right!=null) {
            String node4 = this.nextState();
            this.addNode(node4,"Else");
            this.addTransition(node, node4);
            String right = ifThenElse.right.accept(this);
            this.addTransition(node4, right);
        }
        
        return node;
    } 

    @Override
    public String visit(Substring_ substring) {
        String node = this.nextState();
        this.addNode(node, "Substring()");
        String right=substring.right.accept(this);
        this.addTransition(node, right);
        return node;
    }
    
    @Override
    public String visit(StringNode string_node){
        String nodeIdentifier = this.nextState();
        String value = String.valueOf(string_node.value);
        value = value.replace("\"", "");
        this.addNode(nodeIdentifier,value);

        return nodeIdentifier;
    }
    @Override
    public String visit(IntNode int_node){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,String.valueOf(int_node.value));

        return nodeIdentifier;
    }
    @Override
    public String visit(Nil nil){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,"nil");

        return nodeIdentifier;
    }

    @Override
    public String visit(Break_ break_){
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier,"break");

        return nodeIdentifier;
    }

    @Override
    public String visit(Print_ print_){
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier,"print()");
        String expr=print_.expr.accept(this);
        this.addTransition(nodeIdentifier, expr);
        return nodeIdentifier;
    }

    @Override
    public String visit(Printi printi){
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier,"printi(");
        String expr=printi.expr.accept(this);
        this.addTransition(nodeIdentifier, expr);
        return nodeIdentifier;
    }

    @Override
    public String visit(Concat_ concat_) {
        String node = this.nextState();
        this.addNode(node, "Concat()");
        String right=concat_.right.accept(this);
        this.addTransition(node, right);
        return node;
    }

    @Override
    public String visit(TypeDec1 typeDec1){
        String node = this.nextState();
        this.addNode(node, "Record");
        String typeFields=typeDec1.typefields.accept(this);
        this.addTransition(node, typeFields);
        return node;
    }

    @Override
    public String visit(Ord_ ord_) {
        String node = this.nextState();
        this.addNode(node, "Ord()");
        String right=ord_.right.accept(this);
        this.addTransition(node, right);
        return node;
    }

    @Override
    public String visit(TypeDec2 typeDec2){
        String node = this.nextState();
        this.addNode(node, "array of");
        String typeFields=typeDec2.idf.accept(this);
        this.addTransition(node, typeFields);
        return node;
    }

    @Override
    public String visit(Size_ size_) {
        String node = this.nextState();
        this.addNode(node, "Size()");
        String right=size_.right.accept(this);
        this.addTransition(node, right);
        return node;
    }

    @Override
    public String visit(Type_fields type_fields) {
        String node = this.nextState();
        this.addNode(node, "typeFields");
        for (int i = 0; i < type_fields.fields.size(); i++) {
            String typeField = type_fields.fields.get(i).accept(this);
            this.addTransition(node, typeField);
        }
        return node;
    }

    @Override
    public String visit(Not_ not_) {
        String node = this.nextState();
        this.addNode(node, "Substring");
        String right=not_.right.accept(this);
        this.addTransition(node, right);
        return node;
    }

    @Override
    public String visit(Type_field type_field) {
        String node = this.nextState();
        this.addNode(node, "typeField");
        String idfNode=type_field.name.accept(this);
        String typeNode=type_field.type.accept(this);
        this.addTransition(node, idfNode);
        this.addTransition(node, typeNode);
        return node;
    }

    @Override
    public String visit(Variable_declaration variable_declaration) {
        String node = this.nextState();
        this.addNode(node, "valDec");
        String idfNode=variable_declaration.name.accept(this);
        String exprNode=variable_declaration.expr.accept(this);
        this.addTransition(node, idfNode);
        this.addTransition(node, exprNode);
        if (variable_declaration.type!=null) {
            String typeNode=variable_declaration.type.accept(this);
            this.addTransition(node, typeNode);
        }
        return node;
    }

    @Override
    public String visit(Function_declaration function_declaration) {
        String node = this.nextState();
        this.addNode(node, "funcDec");
        String idfNode=function_declaration.name.accept(this);
        String bodyNOde = function_declaration.body.accept(this);
        this.addTransition(node, idfNode);
        
        if (function_declaration.paramsOrReturnType!=null) {
            String node2 = this.nextState();
            this.addNode(node2, "paramsOrReturnType");
            this.addTransition(node, node2);
            String argsNode=function_declaration.paramsOrReturnType.accept(this);
            this.addTransition(node2, argsNode);
        }
        if (function_declaration.return_type!=null) {
            String node3 = this.nextState();
            this.addNode(node3, "returnType");
            this.addTransition(node, node3);
            String typeNode=function_declaration.return_type.accept(this);
            this.addTransition(node3, typeNode);
        }
        String node4 = this.nextState();
        this.addNode(node4, "body");
        this.addTransition(node, node4);
        this.addTransition(node4, bodyNOde);
        return node;
        
    }

    @Override
    public String visit(Lvalue lvalue) {
        String node = this.nextState();
        this.addNode(node, "lvalue");
        String temp = lvalue.lvalues.get(0).accept(this);
        this.addTransition(node, temp);
        for (int i = 1; i < lvalue.lvalues.size(); i++) {
            String node2 = lvalue.lvalues.get(i).accept(this);
            this.addTransition(temp, node2);
            temp = node2;
        }
        return node;
    }

    @Override
    public String visit(Field field){
        String node = this.nextState();
        this.addNode(node, "field");
        String nameNode  = field.name.accept(this);
        String exprNode = field.expr.accept(this);
        this.addTransition(node, nameNode);
        this.addTransition(node, exprNode);
        return node;
    }

    @Override
    public String visit(Field_list field_list){
        String node = this.nextState();
        this.addNode(node, "fieldList");
        for (int i = 0; i < field_list.fields.size(); i++) {
            String fieldNode = field_list.fields.get(i).accept(this);
            this.addTransition(node, fieldNode);
        }
        return node;
    }

    @Override
    public String visit(AccessId accessId) {
        String node = this.nextState();
        this.addNode(node, "accessId");
        String node2 = accessId.id.accept(this);
        this.addTransition(node, node2);
        return node;
    }

    @Override
    public String visit(AccessIndex accessIndex) {
        String node = this.nextState();
        this.addNode(node, "accessIndex");
        String node2 = accessIndex.index.accept(this);
        this.addTransition(node, node2);
        return node;
    }

    @Override
    public String visit(RecordDec recordDec) {
        String node = this.nextState();
        this.addNode(node, "recordDec");
        String node2 = recordDec.id.accept(this);
        this.addTransition(node, node2);
        String node3 = recordDec.list.accept(this);
        this.addTransition(node, node3);
        return node;
    }

    @Override
    public String visit(ArrayDec arrayDec) {
        String node = this.nextState();
        this.addNode(node, "arrayDec");
        String node2 = arrayDec.id.accept(this);
        this.addTransition(node, node2);
        String node3 = arrayDec.expr1.accept(this);
        String node4 = this.nextState();
        this.addNode(node4, "size");
        this.addTransition(node, node4);
        this.addTransition(node4, node3);
        String node5 = arrayDec.expr2.accept(this);
        String node6 = this.nextState();
        this.addNode(node6, "type");
        this.addTransition(node, node6);
        this.addTransition(node6, node5);
        return node;
    }
    
}
