package Vmediator;

/**
 * @author malf
 * @Description 租户
 * @project patternDesign
 * @since 2020/8/24
 */
public class ColleagueTenant extends Colleague {
	@Override
	public boolean operation(String message) {
		System.out.println("租户收到中介传递的房源信息：" + message);
		return true;
	}
}
