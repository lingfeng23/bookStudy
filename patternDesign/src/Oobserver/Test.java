package Oobserver;

/**
 * @author malf
 * @Description 测试观察者模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.add(observer);
		subject.notifyObserver("AABBCC");
	}
}
