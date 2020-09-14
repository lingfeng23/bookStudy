package Ifacade;

/**
 * @author malf
 * @Description 测试外观模式（门面模式）
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		Starter starter = new Starter();
		starter.startup();
		System.out.println("----------");
		starter.shutdown();
	}
}
