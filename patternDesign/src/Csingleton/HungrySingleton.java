package Csingleton;

/**
 * @author malf
 * @Description 例模式：饿汉模式（线程不安全）
 * @project patternDesign
 * @since 2020/8/23
 */
public class HungrySingleton {
	private static HungrySingleton instance = new HungrySingleton();
	private HungrySingleton() {}
	public static HungrySingleton getInstance() {
		return instance;
	}
}
