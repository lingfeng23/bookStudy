package Rcommand;

/**
 * @author malf
 * @Description 命令调用者
 * @project patternDesign
 * @since 2020/8/24
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	public void action(String message) {
		System.out.println("发送信息：" + message);
		command.execute(message);
	}
}
