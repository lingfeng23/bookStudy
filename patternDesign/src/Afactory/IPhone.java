package Afactory;

/**
 * @author malf
 * @Description 苹果手机
 * @project patternDesign
 * @since 2020/8/23
 */
public class IPhone implements Phone {
	@Override
	public String brand() {
		return "这是一部苹果手机。";
	}
}
