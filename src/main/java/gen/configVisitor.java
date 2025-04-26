package gen;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link configParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface configVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link configParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(configParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(configParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(configParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(configParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(configParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(configParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(configParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#fixedLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedLoop(configParser.FixedLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#conditionalLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalLoop(configParser.ConditionalLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(configParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(configParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(configParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(configParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(configParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(configParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(configParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(configParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(configParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(configParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal(configParser.OctalContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(configParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#hexadecimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimal(configParser.HexadecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(configParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#numericString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericString(configParser.NumericStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(configParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(configParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(configParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link configParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(configParser.MulOpContext ctx);
}