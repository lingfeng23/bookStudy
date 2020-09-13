package Rcommand;

/**
 * @author malf
 * @Description 命令接口的实现
 * @project patternDesign
 * @since 2020/8/24
 */
public class ConcreteCommand implements Command {
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute(String command) {
		receiver.action(command);
	}
}
