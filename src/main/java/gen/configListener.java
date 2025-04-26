package gen;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link configParser}.
 */
public interface configListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link configParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(configParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(configParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(configParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(configParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(configParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(configParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(configParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(configParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(configParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(configParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(configParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(configParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(configParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(configParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#fixedLoop}.
	 * @param ctx the parse tree
	 */
	void enterFixedLoop(configParser.FixedLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#fixedLoop}.
	 * @param ctx the parse tree
	 */
	void exitFixedLoop(configParser.FixedLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#conditionalLoop}.
	 * @param ctx the parse tree
	 */
	void enterConditionalLoop(configParser.ConditionalLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#conditionalLoop}.
	 * @param ctx the parse tree
	 */
	void exitConditionalLoop(configParser.ConditionalLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(configParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(configParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(configParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(configParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(configParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(configParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(configParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(configParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(configParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(configParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(configParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(configParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(configParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(configParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(configParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(configParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(configParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(configParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(configParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(configParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#octal}.
	 * @param ctx the parse tree
	 */
	void enterOctal(configParser.OctalContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#octal}.
	 * @param ctx the parse tree
	 */
	void exitOctal(configParser.OctalContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(configParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(configParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#hexadecimal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal(configParser.HexadecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#hexadecimal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal(configParser.HexadecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(configParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(configParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#numericString}.
	 * @param ctx the parse tree
	 */
	void enterNumericString(configParser.NumericStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#numericString}.
	 * @param ctx the parse tree
	 */
	void exitNumericString(configParser.NumericStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(configParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(configParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(configParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(configParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(configParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(configParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link configParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(configParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link configParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(configParser.MulOpContext ctx);
}