package Tstate;

/**
 * @author malf
 * @Description 工作状态
 * @project patternDesign
 * @since 2020/8/24
 */
public class WorkState extends AbstractState {
	@Override
	public void action(Context context) {
		System.out.println("切换到工作状态，开会，设计，写代码。");
	}
}
