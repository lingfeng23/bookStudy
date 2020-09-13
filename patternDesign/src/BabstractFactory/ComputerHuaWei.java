package BabstractFactory;

/**
 * @author malf
 * @Description 华为电脑
 * @project patternDesign
 * @since 2020/8/23
 */
public class ComputerHuaWei implements Computer {
	@Override
	public String internet() {
		return "使用华为电脑";
	}
}
