package Jbridge;

/**
 * @author malf
 * @Description 实现桥接模式
 * @project patternDesign
 * @since 2020/8/23
 */
public abstract class DriverManagerBridge {
	private Driver driver;
	public void execute() {
		this.driver.executeSQL();;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Driver getDriver() {
		return driver;
	}
}
