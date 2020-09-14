package Oobserver;

/**
 * @author malf
 * @Description 具体的主题类
 * @project patternDesign
 * @since 2020/8/23
 */
public class ConcreteSubject extends Subject {
	@Override
	public void notifyObserver(String message) {
		for (Observer observer: observers) {
			System.out.println("通知观察者：" + message + "变化。" );
			observer.dataChange(message);
		}
	}
}
