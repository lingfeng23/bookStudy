package Csingleton;

/**
 * @author malf
 * @Description 单例模式：懒汉模式（线程安全）
 * @project patternDesign
 * @since 2020/8/23
 */
public class LazySingleton {
	private static LazySingleton instance;
	private LazySingleton() {}
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
