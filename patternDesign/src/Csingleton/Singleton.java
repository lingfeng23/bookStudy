package Csingleton;

/**
 * @author malf
 * @Description 单例模式：静态内部类
 * @project patternDesign
 * @since 2020/8/23
 */
public class Singleton {
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
	private Singleton() {}
	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
