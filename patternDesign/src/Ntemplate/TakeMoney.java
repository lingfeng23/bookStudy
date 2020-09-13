package Ntemplate;

/**
 * @author malf
 * @Description 取钱
 * @project patternDesign
 * @since 2020/8/23
 */
public class TakeMoney extends AbstractTemplate {
	@Override
	public void handleBusiness() {
		System.out.println("在银行取钱。");
	}
}
