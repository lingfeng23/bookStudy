package BabstractFactory;

/**
 * @author malf
 * @Description 抽象工厂
 * @project patternDesign
 * @since 2020/8/23
 */
public abstract class AbstractFactory {
	public abstract Phone createPhone(String brand);
	public abstract Computer createComputer(String brand);
}
