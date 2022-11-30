// Generated from ./expr.g by ANTLR 4.9.2

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(exprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(exprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(exprParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#print_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_(exprParser.Print_Context ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(exprParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(exprParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(exprParser.ConditionContext ctx);
}