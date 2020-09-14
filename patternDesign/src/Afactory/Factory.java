package Afactory;

/**
 * @author malf
 * @Description 工厂类
 * @project patternDesign
 * @since 2020/8/23
 */
public class Factory {
	public Phone createPhone(String phoneName) {
		if ("HuaWei".equals(phoneName)) {
			return new HuaWei();
		} else if ("Apple".equals(phoneName)) {
			return new IPhone();
		} else {
			return null;
		}
	}
}
