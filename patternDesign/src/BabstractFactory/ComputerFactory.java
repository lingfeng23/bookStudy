package BabstractFactory;

/**
 * @author malf
 * @Description 电脑工厂
 * @project patternDesign
 * @since 2020/8/23
 */
public class ComputerFactory extends AbstractFactory {
	@Override
	public Phone createPhone(String brand) {
		return null;
	}

	@Override
	public Computer createComputer(String brand) {
		if ("HuaWei".equals(brand)) {
			return new ComputerHuaWei();
		} else if ("Apple".equals(brand)) {
			return new ComputerApple();
		} else {
			return null;
		}
	}
}
