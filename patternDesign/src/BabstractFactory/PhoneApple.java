package BabstractFactory;

/**
 * @author malf
 * @Description 苹果手机
 * @project patternDesign
 * @since 2020/8/23
 */
public class PhoneApple implements Phone {
	@Override
	public String call() {
		return "用苹果手机打电话。";
	}
}
