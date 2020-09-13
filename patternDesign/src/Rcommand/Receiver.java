package Rcommand;

/**
 * @author malf
 * @Description 命令的接收和执行者
 * @project patternDesign
 * @since 2020/8/24
 */
public class Receiver {
	public void action(String command) {
		System.out.println(command + "命令已收到，现在执行。");
	}
}
