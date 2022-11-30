// Generated from ./tiger.g by ANTLR 4.9.2

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tigerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tigerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tigerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tigerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(tigerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(tigerParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(tigerParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(tigerParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(tigerParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(tigerParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(tigerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(tigerParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#expr_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_seq(tigerParser.Expr_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(tigerParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(tigerParser.Field_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(tigerParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(tigerParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#assignement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignement(tigerParser.AssignementContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#ifthenelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse(tigerParser.IfthenelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#whiledo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledo(tigerParser.WhiledoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(tigerParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#let_in_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_in_end(tigerParser.Let_in_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(tigerParser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(tigerParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(tigerParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(tigerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#type_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_fields(tigerParser.Type_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#type_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_field(tigerParser.Type_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#type_IDF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_IDF(tigerParser.Type_IDFContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(tigerParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(tigerParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#stdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdlib(tigerParser.StdlibContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#print_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_(tigerParser.Print_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#printi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinti(tigerParser.PrintiContext ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#flush_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlush_(tigerParser.Flush_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#exit_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_(tigerParser.Exit_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#getchar_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetchar_(tigerParser.Getchar_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#chr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChr_(tigerParser.Chr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#substring_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring_(tigerParser.Substring_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#concat_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat_(tigerParser.Concat_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#ord_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrd_(tigerParser.Ord_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#size_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_(tigerParser.Size_Context ctx);
	/**
	 * Visit a parse tree produced by {@link tigerParser#not_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_(tigerParser.Not_Context ctx);
}