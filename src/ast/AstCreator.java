package ast;

import parser.tigerBaseVisitor;
import parser.tigerParser;

public class AstCreator extends tigerBaseVisitor<Ast>{

	@Override public Ast visitProgram(tigerParser.ProgramContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitExpr(tigerParser.ExprContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitOr(tigerParser.OrContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitAnd(tigerParser.AndContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitCompare(tigerParser.CompareContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitPlus(tigerParser.PlusContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitMult(tigerParser.MultContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitStringNode(tigerParser.StringNodeContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitIntNode(tigerParser.IntNodeContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitNil(tigerParser.NilContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitBreak_(tigerParser.Break_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitParentheses(tigerParser.ParenthesesContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitTypeInstance(tigerParser.TypeInstanceContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitInstruction(tigerParser.InstructionContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitNegation(tigerParser.NegationContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitExpr_seq(tigerParser.Expr_seqContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitExpr_list(tigerParser.Expr_listContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitSimpleField(tigerParser.SimpleFieldContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitManyFiedls(tigerParser.ManyFiedlsContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitIdentifier(tigerParser.IdentifierContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitLvalueIdf(tigerParser.LvalueIdfContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitLvalueExpr(tigerParser.LvalueExprContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitFunctionCall(tigerParser.FunctionCallContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitAssignement(tigerParser.AssignementContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitIfthenelse(tigerParser.IfthenelseContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitWhiledo(tigerParser.WhiledoContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitFor_(tigerParser.For_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitLet_in_end(tigerParser.Let_in_endContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitDeclaration_list(tigerParser.Declaration_listContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitDeclaration(tigerParser.DeclarationContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitType_declaration(tigerParser.Type_declarationContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitType(tigerParser.TypeContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitTypeDec1(tigerParser.TypeDec1Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitTypeDec2(tigerParser.TypeDec2Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitType_fields(tigerParser.Type_fieldsContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitType_field(tigerParser.Type_fieldContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitVariable_declaration(tigerParser.Variable_declarationContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitFunction_declaration(tigerParser.Function_declarationContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitStdlib(tigerParser.StdlibContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitPrint_(tigerParser.Print_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitPrinti(tigerParser.PrintiContext ctx) { return visitChildren(ctx); }
	@Override public Ast visitFlush_(tigerParser.Flush_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitExit_(tigerParser.Exit_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitGetchar_(tigerParser.Getchar_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitChr_(tigerParser.Chr_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitSubstring_(tigerParser.Substring_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitConcat_(tigerParser.Concat_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitOrd_(tigerParser.Ord_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitSize_(tigerParser.Size_Context ctx) { return visitChildren(ctx); }
	@Override public Ast visitNot_(tigerParser.Not_Context ctx) { return visitChildren(ctx); }
}
