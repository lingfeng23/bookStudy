package Winterpreter;

/**
 * @author malf
 * @Description 表达式接口
 * @project patternDesign
 * @since 2020/8/24
 */
public interface Expression {
	public void interpret(Context context);
}
