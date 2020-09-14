package BabstractFactory;

/**
 * @author malf
 * @Description 华为手机
 * @project patternDesign
 * @since 2020/8/23
 */
public class PhoneHuaWei implements Phone {
	@Override
	public String call() {
		return "用华为手机打电话。";
	}
}
