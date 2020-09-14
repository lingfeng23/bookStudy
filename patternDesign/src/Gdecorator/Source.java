package Gdecorator;

/**
 * @author malf
 * @Description 被装饰者的实现类
 * @project patternDesign
 * @since 2020/8/23
 */
public class Source implements Sourceable {
	@Override
	public void createComputer() {
		System.out.println("通过Source生产电脑。");
	}
}
