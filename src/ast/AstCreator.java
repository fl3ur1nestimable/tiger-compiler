package ast;

import parser.tigerBaseVisitor;
import parser.tigerParser;

public class AstCreator extends tigerBaseVisitor<Ast>{

	@Override public Ast visitProgram(tigerParser.ProgramContext ctx) {
		return new Program(ctx.getChild(0).accept(this));
	}
	@Override public Ast visitExpr(tigerParser.ExprContext ctx) {
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitOr(tigerParser.OrContext ctx) {
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			Ast right = ctx.getChild(2*(i+1)).accept(this);
			temp = new Or(temp, right);
		}
		return temp;

	}
	@Override public Ast visitAnd(tigerParser.AndContext ctx) {
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			Ast right = ctx.getChild(2*(i+1)).accept(this);
			temp = new And(temp, right);
		}
		return temp;
	}
	@Override public Ast visitCompare(tigerParser.CompareContext ctx) {
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			String op = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
			switch (op) {
				case "<>":
					temp = new Compare_equal_1(temp, right);
					break;
				case "=":
					temp = new Compare_equal_2(temp, right);
					break;
				case ">=":
					temp = new GreaterThan1(temp, right);
					break;
				case ">":
					temp = new GreaterThan2(temp, right);
					break;
				case "<=":
					temp = new LessThan1(temp, right);	
					break;
				case "<":
					temp = new LessThan2(temp, right);
					break;
				default:
					break;
			}

		}
		return temp;
	}
	@Override public Ast visitPlus(tigerParser.PlusContext ctx) {
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			String op = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
			switch (op) {
				case "+":
					temp = new Plus(temp, right);
					break;
				case "-":
					temp = new Moins(temp, right);
					break;
				default:
					break;
			}

		}
		return temp;
	}
	@Override public Ast visitMult(tigerParser.MultContext ctx) {
		Ast temp = ctx.getChild(0).accept(this);
		for (int i = 0; 2*i < ctx.getChildCount()-1; i++) {
			String op = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
			switch (op) {
				case "*":
					temp = new Mult(temp, right);
					break;
				case "/":
					temp = new Divide(temp, right);
					break;
				default:
					break;
			}

		}
		return temp;
	}
	
	@Override public Ast visitStringNode(tigerParser.StringNodeContext ctx) { return visitChildren(ctx); }//marine
	@Override public Ast visitIntNode(tigerParser.IntNodeContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitNil(tigerParser.NilContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitBreak_(tigerParser.Break_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitParentheses(tigerParser.ParenthesesContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitTypeInstance(tigerParser.TypeInstanceContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitInstruction(tigerParser.InstructionContext ctx) { return visitChildren(ctx); }
	
	@Override public Ast visitNegation(tigerParser.NegationContext ctx) { return visitChildren(ctx); }//Louis
	@Override public Ast visitExpr_seq(tigerParser.Expr_seqContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitExpr_list(tigerParser.Expr_listContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitIdentifier(tigerParser.IdentifierContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitFunctionCall(tigerParser.FunctionCallContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitAssignement(tigerParser.AssignementContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitIfthenelse(tigerParser.IfthenelseContext ctx) { return visitChildren(ctx); }
	
	@Override public Ast visitWhiledo(tigerParser.WhiledoContext ctx) {
		Ast cond = ctx.getChild(1).accept(this);
		Ast doBlock = ctx.getChild(3).accept(this);
		return new Whiledo(cond,doBlock);
	}
	@Override public Ast visitFor_(tigerParser.For_Context ctx) {
		String idfString = ctx.getChild(1).toString();
		Identifier idf = new Identifier(idfString);
		Ast expr1 = ctx.getChild(3).accept(this);
		Ast expr2 = ctx.getChild(5).accept(this);
		Ast expr3 = ctx.getChild(7).accept(this);
		return new For_(idf,expr1,expr2,expr3);
	}
	@Override public Ast visitLet_in_end(tigerParser.Let_in_endContext ctx) {
		Ast block1 = ctx.getChild(1).accept(this);
		Ast block2;
		if (ctx.getChildCount()==5) {
			block2 = ctx.getChild(3).accept(this);
			return new Let_in_end(block1,block2);
		}
		return new Let_in_end(block1);

	}
	@Override public Ast visitDeclaration_list(tigerParser.Declaration_listContext ctx) {
		Declaration_list list = new Declaration_list();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			list.addDeclaration(ctx.getChild(i).accept(this));
		}
		return list;
	}
	@Override public Ast visitDeclaration(tigerParser.DeclarationContext ctx) {
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitType_declaration(tigerParser.Type_declarationContext ctx) {
		String idfString = ctx.getChild(1).toString();
		Identifier idf = new Identifier(idfString);
		Ast type = ctx.getChild(3).accept(this);
		return new Type_declaration(idf,type);
	}

	@Override public Ast visitTypeDec1(tigerParser.TypeDec1Context ctx) { return visitChildren(ctx); }//antoine
	@Override public Ast visitTypeDec2(tigerParser.TypeDec2Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitType_fields(tigerParser.Type_fieldsContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitType_field(tigerParser.Type_fieldContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitVariable_declaration(tigerParser.Variable_declarationContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitFunction_declaration(tigerParser.Function_declarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Ast visitStdlib(tigerParser.StdlibContext ctx) { return visitChildren(ctx); }//marine
	@Override public Ast visitPrint_(tigerParser.Print_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitPrinti(tigerParser.PrintiContext ctx) { return visitChildren(ctx); }

	@Override public Ast visitFlush_(tigerParser.Flush_Context ctx) { return visitChildren(ctx); }// Angelina
	@Override public Ast visitExit_(tigerParser.Exit_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitGetchar_(tigerParser.Getchar_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitChr_(tigerParser.Chr_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitSubstring_(tigerParser.Substring_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitConcat_(tigerParser.Concat_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitOrd_(tigerParser.Ord_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitSize_(tigerParser.Size_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitNot_(tigerParser.Not_Context ctx) { return visitChildren(ctx); }
}
