package Tstate;

/**
 * @author malf
 * @Description 测试状态模式
 * @project patternDesign
 * @since 2020/8/24
 */
public class Test {
	public static void main(String[] args) {
		// 定义当前状态为工作状态
		Context context = new Context(new WorkState());
		context.action();
		// 切换为休假状态
		context.setState(new HolidayState());
		context.action();
	}
}
