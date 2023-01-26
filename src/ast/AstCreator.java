package ast;

import parser.tigerBaseVisitor;
import parser.tigerParser;

public class AstCreator extends tigerBaseVisitor<Ast>{

	@Override public Ast visitProgram(tigerParser.ProgramContext ctx) {
		int line = ctx.getStart().getLine();
		return new Program(ctx.getChild(0).accept(this),line);
	}
	@Override public Ast visitExpr(tigerParser.ExprContext ctx) {
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitOr(tigerParser.OrContext ctx) {
		int line = ctx.getStart().getLine();
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			Ast right = ctx.getChild(2*(i+1)).accept(this);
			temp = new Or(temp, right,line);
		}
		return temp;

	}
	@Override public Ast visitAnd(tigerParser.AndContext ctx) {
		Ast temp = ctx.getChild(0).accept(this);
		int line = ctx.getStart().getLine();
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			Ast right = ctx.getChild(2*(i+1)).accept(this);
			temp = new And(temp, right,line);
		}
		return temp;
	}
	@Override public Ast visitCompare(tigerParser.CompareContext ctx) {
		int line = ctx.getStart().getLine();
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			String op = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
			switch (op) {
				case "<>":
					temp = new Compare_equal_1(temp, right ,line);
					break;
				case "=":
					temp = new Compare_equal_2(temp, right ,line);
					break;
				case ">=":
					temp = new GreaterThan1(temp, right	,line);
					break;
				case ">":
					temp = new GreaterThan2(temp, right ,line);
					break;
				case "<=":
					temp = new LessThan1(temp, right ,line);	
					break;
				case "<":
					temp = new LessThan2(temp, right ,line);
					break;
				default:
					break;
			}

		}
		return temp;
	}
	@Override public Ast visitPlus(tigerParser.PlusContext ctx) {
		int line = ctx.getStart().getLine();
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			String op = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
			switch (op) {
				case "+":
					temp = new Plus(temp, right,line);
					break;
				case "-":
					temp = new Moins(temp, right,line);
					break;
				default:
					break;
			}

		}
		return temp;
	}
	@Override public Ast visitMult(tigerParser.MultContext ctx) {
		int line = ctx.getStart().getLine();
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			String op = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
			switch (op) {
				case "*":
					temp = new Mult(temp, right ,line);
					break;
				case "/":
					temp = new Divide(temp, right ,line);
					break;
				default:
					break;
			}

		}
		return temp;
	}
	
	@Override public Ast visitStringNode(tigerParser.StringNodeContext ctx) { 
		int line = ctx.getStart().getLine();
		return new StringNode(ctx.getChild(0).toString(),line);
	 }//marine
	@Override public Ast visitIntNode(tigerParser.IntNodeContext ctx) { 
		int line = ctx.getStart().getLine();
		return new IntNode(Integer.parseInt(ctx.getChild(0).toString()),line);
	 }
	@Override public Ast visitNil(tigerParser.NilContext ctx) { 
		int line = ctx.getStart().getLine();
		return new Nil(line);
	 }
	@Override public Ast visitBreak_(tigerParser.Break_Context ctx) {
		int line = ctx.getStart().getLine();
		return new Break_(line);
	 }
	@Override public Ast visitParentheses(tigerParser.ParenthesesContext ctx) { 
		if (ctx.getChildCount()==3){return ctx.getChild(1).accept(this); }
		else return visitChildren(ctx);
	}
	@Override public Ast visitTypeInstance(tigerParser.TypeInstanceContext ctx) {
		int line = ctx.getStart().getLine();
		Identifier id = new Identifier(ctx.getChild(0).toString(),line);
		if(ctx.getChildCount()>=5){
			Ast expr1=ctx.getChild(2).accept(this);
			Ast expr2=ctx.getChild(4).accept(this);
			return new ArrayDec(id, expr1, expr2,line);
		}
		else {
			Ast liste_field=ctx.getChild(2).accept(this);
			return new RecordDec(id, liste_field,line);
		}
	 }
	@Override public Ast visitInstruction(tigerParser.InstructionContext ctx) { 
		return ctx.getChild(0).accept(this);
	 }
	
	@Override public Ast visitNegation(tigerParser.NegationContext ctx) {  //Louis
		int line = ctx.getStart().getLine();
		return new Negation(ctx.getChild(1).accept(this),line); }

	@Override public Ast visitExpr_seq(tigerParser.Expr_seqContext ctx) { 	
		int line = ctx.getStart().getLine();
		Expr_seq expr_seq = new Expr_seq(line);
		for (int i = 0; 2*i < ctx.getChildCount(); i++) {
			Ast right = ctx.getChild(2*i).accept(this);
			expr_seq.addExpr(right);
		}
		return expr_seq;
	} 

	@Override public Ast visitExpr_list(tigerParser.Expr_listContext ctx) {
		int line = ctx.getStart().getLine();
		Expr_list expr_list = new Expr_list(line);
		for (int i = 0; 2*i < ctx.getChildCount(); i++) {
			Ast right = ctx.getChild(2*i).accept(this);
			expr_list.addExpr(right);
		}
		return expr_list;
	 }
	@Override public Ast visitIdentifier(tigerParser.IdentifierContext ctx) { 
		int line = ctx.getStart().getLine();
		return new Identifier(ctx.getChild(0).toString(),line);
	 }
	
	@Override public Ast visitFunctionCall(tigerParser.FunctionCallContext ctx) {
		int line = ctx.getStart().getLine();

		String left = ctx.getChild(0).toString();
		Identifier id = new Identifier(left,line);

		if (ctx.getChildCount()==4){
			Ast right = ctx.getChild(2).accept(this);
			return new FunctionCall(id,right,line);
		}
		return new FunctionCall(id,line);
	}

	@Override public Ast visitAssignement(tigerParser.AssignementContext ctx) { 
		int line = ctx.getStart().getLine();
		Ast left = ctx.getChild(0).accept(this);
		Ast right = ctx.getChild(2).accept(this);
		return new Assignement(left,right,line);
	}

	 
	@Override public Ast visitIfthenelse(tigerParser.IfthenelseContext ctx) { 
		int line = ctx.getStart().getLine();
		Ast left = ctx.getChild(1).accept(this);
		Ast middle = ctx.getChild(3).accept(this);

		if (ctx.getChildCount()==6){
			Ast right = ctx.getChild(5).accept(this);
			return new IfThenElse(left,middle,right,line);
		}
		return new IfThenElse(left,middle,line);
	 }
	
	@Override public Ast visitWhiledo(tigerParser.WhiledoContext ctx) {
		int line = ctx.getStart().getLine();
		Ast cond = ctx.getChild(1).accept(this);
		Ast doBlock = ctx.getChild(3).accept(this);
		return new Whiledo(cond,doBlock,line);
	}
	@Override public Ast visitFor_(tigerParser.For_Context ctx) {
		int line = ctx.getStart().getLine();
		String idfString = ctx.getChild(1).toString();
		Identifier idf = new Identifier(idfString,line);
		Ast expr1 = ctx.getChild(3).accept(this);
		Ast expr2 = ctx.getChild(5).accept(this);
		Ast expr3 = ctx.getChild(7).accept(this);
		return new For_(idf,expr1,expr2,expr3,line);
	}
	@Override public Ast visitLet_in_end(tigerParser.Let_in_endContext ctx) {
		int line = ctx.getStart().getLine();
		Ast block1 = ctx.getChild(1).accept(this);
		Ast block2;
		if (ctx.getChildCount()>=5) {
			block2 = ctx.getChild(3).accept(this);
			return new Let_in_end(block1,block2,line);
		}
		return new Let_in_end(block1,line);

	}
	@Override public Ast visitDeclaration_list(tigerParser.Declaration_listContext ctx) {
		int line = ctx.getStart().getLine();
		Declaration_list list = new Declaration_list(line);
		for (int i = 0; i < ctx.getChildCount(); i++) {
			list.addDeclaration(ctx.getChild(i).accept(this));
		}
		return list;
	}
	@Override public Ast visitDeclaration(tigerParser.DeclarationContext ctx) {
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitType_declaration(tigerParser.Type_declarationContext ctx) {
		int line = ctx.getStart().getLine();
		String idfString = ctx.getChild(1).toString();
		Identifier idf = new Identifier(idfString,line);
		Ast type = ctx.getChild(3).accept(this);
		return new Type_declaration(idf,type,line);
	}
	@Override public Ast visitTypeDec1(tigerParser.TypeDec1Context ctx) {
		int line = ctx.getStart().getLine();
		if (ctx.getChildCount()>=3) {
			return new  TypeDec1(ctx.getChild(1).accept(this),line);
		}
		return visitChildren(ctx);
	}
	@Override public Ast visitTypeDec2(tigerParser.TypeDec2Context ctx) {
		int line = ctx.getStart().getLine();
		return new TypeDec2(new Identifier(ctx.getChild(1).toString(),line),line);
	}
	@Override public Ast visitType_fields(tigerParser.Type_fieldsContext ctx) {
		int line = ctx.getStart().getLine();
		Type_fields list = new Type_fields(line);
		for (int i = 0; 2*i < ctx.getChildCount(); i++) {
			list.addType_field(ctx.getChild(2*i).accept(this));
		}
		return list;
	}
	@Override public Ast visitType_field(tigerParser.Type_fieldContext ctx) {
		int line = ctx.getStart().getLine();
		return new Type_field(new Identifier(ctx.getChild(0).toString(),line),new Identifier(ctx.getChild(2).toString(),line),line);
	}
	@Override public Ast visitVariable_declaration(tigerParser.Variable_declarationContext ctx) {
		int line = ctx.getStart().getLine();
		if (ctx.getChildCount()>=5) {
			return new Variable_declaration(new Identifier(ctx.getChild(1).toString(), line),new Identifier(ctx.getChild(3).toString(),line),ctx.getChild(5).accept(this),line);
		}
		else{
			return new Variable_declaration(new Identifier(ctx.getChild(1).toString(),line),ctx.getChild(3).accept(this),line);
		}
	}
	@Override public Ast visitFunction_declaration(tigerParser.Function_declarationContext ctx) {
		int line = ctx.getStart().getLine();
		if (ctx.getChildCount()>=9) {
			return new Function_declaration(new Identifier(ctx.getChild(1).toString(),line),ctx.getChild(3).accept(this),new Identifier(ctx.getChild(6).toString(),line),ctx.getChild(8).accept(this),line);
		}
		else if(ctx.getChildCount()>=8){
			return new Function_declaration(new Identifier(ctx.getChild(1).toString(),line),new Identifier(ctx.getChild(5).toString(),line),ctx.getChild(7).accept(this),line);
		}
		else if (ctx.getChildCount()>=7) {
			return new Function_declaration(new Identifier(ctx.getChild(1).toString(),line),ctx.getChild(3).accept(this),ctx.getChild(6).accept(this),line);
		}
		return new Function_declaration(new Identifier(ctx.getChild(1).toString(),line),ctx.getChild(5).accept(this),line);
	}
	
	@Override public Ast visitStdlib(tigerParser.StdlibContext ctx) { 
		return ctx.getChild(0).accept(this);
	 }//marine
	@Override public Ast visitPrint_(tigerParser.Print_Context ctx) { 
		int line = ctx.getStart().getLine();
		return new Print_(ctx.getChild(1).accept(this),line);
	 }
	@Override public Ast visitPrinti(tigerParser.PrintiContext ctx) { 
		int line = ctx.getStart().getLine();
		return new Printi(ctx.getChild(1).accept(this),line);
	 }

	@Override public Ast visitFlush_(tigerParser.Flush_Context ctx) {
		int line = ctx.getStart().getLine();
		return new Flush_(line);
	}
	@Override public Ast visitExit_(tigerParser.Exit_Context ctx) {
		int line = ctx.getStart().getLine();
		return new Exit_(ctx.getChild(1).accept(this),line);
	}
	@Override public Ast visitGetchar_(tigerParser.Getchar_Context ctx) {
		int line = ctx.getStart().getLine();
		return new Getchar(line);
	}
	@Override public Ast visitChr_(tigerParser.Chr_Context ctx) { 
		int line = ctx.getStart().getLine();
		return new Chr_(ctx.getChild(1).accept(this),line);
	}
	
	@Override public Ast visitSubstring_(tigerParser.Substring_Context ctx) { 	
		int line = ctx.getStart().getLine();	
		return new Substring_(ctx.getChild(1).accept(this),line); }

	@Override public Ast visitConcat_(tigerParser.Concat_Context ctx) { 
		int line = ctx.getStart().getLine();
		return new Concat_(ctx.getChild(1).accept(this),line); }

	@Override public Ast visitOrd_(tigerParser.Ord_Context ctx) { 
		int line = ctx.getStart().getLine();
		return new Ord_(ctx.getChild(1).accept(this),line); }

	@Override public Ast visitSize_(tigerParser.Size_Context ctx) { 
		int line = ctx.getStart().getLine();
		return new Size_(ctx.getChild(1).accept(this),line); }

	@Override public Ast visitNot_(tigerParser.Not_Context ctx) { 
		int line = ctx.getStart().getLine();
		return new Not_(ctx.getChild(1).accept(this),line); }
		
	@Override public Ast visitField_list(tigerParser.Field_listContext ctx) {
		int line = ctx.getStart().getLine();
		Field_list list = new Field_list(line);
		for (int i = 0; 2*i < ctx.getChildCount(); i++) {
			list.add(ctx.getChild(2*i).accept(this));
		}
		return list;
	}
	@Override public Ast visitField(tigerParser.FieldContext ctx) {
		int line = ctx.getStart().getLine();
		return new Field(new Identifier(ctx.getChild(0).toString(),line),ctx.getChild(2).accept(this),line);
	}
	@Override public Ast visitLvalue(tigerParser.LvalueContext ctx) {
		int line = ctx.getStart().getLine();
		Ast temp = new Identifier(ctx.getChild(0).toString(),line);
		for (int i = 1; i < ctx.getChildCount(); i++) {
			switch (ctx.getChild(i).toString()) {
				case ".":
					temp = new AccessId(temp,new Identifier(ctx.getChild(i+1).toString(), line),line);
					break;
				case "[":
					temp = new AccessIndex(temp ,ctx.getChild(i+1).accept(this),line);
				default:
					break;
			}
		}
		return temp;
	}
}
