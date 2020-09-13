package Rcommand;

/**
 * @author malf
 * @Description 测试命令模式
 * @project patternDesign
 * @since 2020/8/24
 */
public class Test {
	public static void main(String[] args) {
		// 定义命令的接收和执行者
		Receiver receiver = new Receiver();
		// 定义命令实现类
		Command command = new ConcreteCommand(receiver);
		// 定义命令调用者
		Invoker invoker = new Invoker(command);
		// 命令调用
		invoker.action("大军出发");
	}
}
