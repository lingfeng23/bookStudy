package Winterpreter;

/**
 * @author malf
 * @Description 非终结表达式，对非终结元素进行处理
 * @project patternDesign
 * @since 2020/8/24
 */
public class NonterminalExpression implements Expression {
	private Expression left;
	private Expression right;

	public NonterminalExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void interpret(Context context) {

	}
}
