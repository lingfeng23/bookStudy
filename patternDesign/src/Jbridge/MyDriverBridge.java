package Jbridge;

/**
 * @author malf
 * @Description 实现自定义功能/直接使用桥接中功能
 * @project patternDesign
 * @since 2020/8/23
 */
public class MyDriverBridge extends DriverManagerBridge {
	public void execute() {
		getDriver().executeSQL();
	}
}
