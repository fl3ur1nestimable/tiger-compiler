package ast;

import parser.exprBaseVisitor;
import parser.exprParser;

public class AstCreator extends exprBaseVisitor<Ast>{

	@Override public Ast visitProgram(exprParser.ProgramContext ctx) {
		Ast instructions = ctx.getChild(0).accept(this);
		return new Program(instructions);
	}

	@Override public Ast visitInstr(exprParser.InstrContext ctx) { 
		return ctx.getChild(0).accept(this);
	}

	@Override public Ast visitPrint_litteral(exprParser.Print_litteralContext ctx) {
		Ast value = ctx.getChild(1).accept(this);
		return new Print(value);
	}

	@Override public Ast visitIfThenElse(exprParser.IfThenElseContext ctx) {
		Ast cond = ctx.getChild(2).accept(this);
		Ast then = ctx.getChild(5).accept(this);
		Ast elseb = ctx.getChild(9).accept(this);
		return new IfThenElse(cond, then, elseb);
	}

	@Override public Ast visitIfThen(exprParser.IfThenContext ctx) { 
		Ast cond = ctx.getChild(2).accept(this);
		Ast block = ctx.getChild(5).accept(this);
		return new IfThen(cond, block);
	}
	
	@Override public Ast visitInstr_list(exprParser.Instr_listContext ctx) {
		InstrList list = new InstrList();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			list.addInstr(ctx.getChild(i).accept(this));
		}
		return list;
	}

	@Override public Ast visitAffect(exprParser.AffectContext ctx) {
		Ast expr = ctx.getChild(2).accept(this);
		String idfString = ctx.getChild(0).toString();
		Idf idf = new Idf(idfString);
		return new Affect(idf,expr);
	}
	@Override public Ast visitExpr(exprParser.ExprContext ctx) {
		return ctx.getChild(0).accept(this);
	}
	
	@Override public Ast visitPlus(exprParser.PlusContext ctx) {
		Ast noeudTemporaire = ctx.getChild(0).accept(this);
        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
            switch (operation) {
                case "-":
                    noeudTemporaire = new Minus(noeudTemporaire,right);
                    break;
                case "+":
                    noeudTemporaire = new Plus(noeudTemporaire,right);
                    break;
                default:
                    break;
            }
        }    
        return noeudTemporaire;
	}
	
	@Override public Ast visitMult(exprParser.MultContext ctx) {
		Ast noeudTemporaire = ctx.getChild(0).accept(this);
        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
            switch (operation) {
                case "*":
                    noeudTemporaire = new Mult(noeudTemporaire,right);
                    break;
                case "/":
                    noeudTemporaire = new Divide(noeudTemporaire,right);
                    break;
                default:
                    break;
            }
        }    
        return noeudTemporaire;
	}

	@Override public Ast visitInteger(exprParser.IntegerContext ctx) {
		int value = Integer.parseInt(ctx.getChild(0).toString());
		return new IntNode(value);
	}
	
	@Override public Ast visitIdentifier(exprParser.IdentifierContext ctx) {
		String name = ctx.getChild(0).toString();
		return new Idf(name);
	}
	
	@Override public Ast visitParenthesis(exprParser.ParenthesisContext ctx) {
		return ctx.getChild(1).accept(this);
	}
}
