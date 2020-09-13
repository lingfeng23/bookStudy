package Ntemplate;

/**
 * @author malf
 * @Description 测试模板模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		// 办理取钱流程
		AbstractTemplate template1 = new TakeMoney();
		template1.templateMethod();
		System.out.println("-----------");
		// 办理存钱流程
		AbstractTemplate template2 = new SaveMoney();
		template2.templateMethod();
	}
}
