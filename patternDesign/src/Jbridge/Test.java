package Jbridge;

/**
 * @author malf
 * @Description 测试桥接模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		DriverManagerBridge driverManagerBridge = new MyDriverBridge();
		// 设置MySQL驱动
		driverManagerBridge.setDriver(new MySQLDriver());
		driverManagerBridge.execute();
		// 设置Oracle驱动
		driverManagerBridge.setDriver(new OracleDriver());
		driverManagerBridge.execute();
	}
}
