package Tstate;

/**
 * @author malf
 * @Description 假期状态
 * @project patternDesign
 * @since 2020/8/24
 */
public class HolidayState extends AbstractState {
	@Override
	public void action(Context context) {
		System.out.println("切换到假期状态，旅游，购物，看电视。");
	}
}
