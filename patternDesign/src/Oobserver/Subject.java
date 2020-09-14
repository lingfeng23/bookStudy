package Oobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author malf
 * @Description 抽象目标类
 * @project patternDesign
 * @since 2020/8/23
 */
public abstract class Subject {
	protected List<Observer> observers = new ArrayList<>();
	// 增加观察者
	public void add(Observer observer) {
		observers.add(observer);
	}
	// 删除观察者
	public void delete(Observer observer) {
		observers.remove(observer);
	}
	// 通知观察者
	public abstract void notifyObserver(String message);
}
