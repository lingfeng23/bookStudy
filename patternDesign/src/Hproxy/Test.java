package Hproxy;

/**
 * @author malf
 * @Description 测试代理模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		Company company = new Proxy();
		company.findWorker("Java");
	}
}
