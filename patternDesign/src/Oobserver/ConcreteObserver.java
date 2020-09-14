package Oobserver;

/**
 * @author malf
 * @Description 具体的观察者
 * @project patternDesign
 * @since 2020/8/23
 */
public class ConcreteObserver implements Observer {
	@Override
	public void dataChange(String message) {
		System.out.println("接受到消息：" + message);
	}
}
