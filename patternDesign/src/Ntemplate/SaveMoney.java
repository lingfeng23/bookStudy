package Ntemplate;

/**
 * @author malf
 * @Description 存钱
 * @project patternDesign
 * @since 2020/8/23
 */
public class SaveMoney extends AbstractTemplate {
	@Override
	public void handleBusiness() {
		System.out.println("在银行存钱。");
	}
}
