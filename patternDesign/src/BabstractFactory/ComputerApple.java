package BabstractFactory;

/**
 * @author malf
 * @Description 苹果电脑
 * @project patternDesign
 * @since 2020/8/23
 */
public class ComputerApple implements Computer {
	@Override
	public String internet() {
		return "使用苹果电脑";
	}
}
