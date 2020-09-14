package Csingleton;

/**
 * @author malf
 * @Description 单例模式：双重校验锁
 * @project patternDesign
 * @since 2020/8/23
 */
public class Lock2Singleton {
	private volatile static Lock2Singleton instance;
	private Lock2Singleton() {}
	public static Lock2Singleton getSingleton() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Lock2Singleton();
				}
			}
		}
		return instance;
	}
}
