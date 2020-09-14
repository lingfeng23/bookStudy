package Gdecorator;

/**
 * @author malf
 * @Description 装饰着类
 * @project patternDesign
 * @since 2020/8/23
 */
public class Decorator implements Sourceable {
	private Sourceable source;
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}
	@Override
	public void createComputer() {
		source.createComputer();
		// 生产完电脑后装系统
		System.out.println("安装系统。");

	}
}
