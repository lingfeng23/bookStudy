package Gdecorator;

/**
 * @author malf
 * @Description 测试装饰者模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable object = new Decorator(source);
		object.createComputer();
	}
}
