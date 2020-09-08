package malf.chapter2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 类描述
 */
public abstract class Foo {
	private static Map implemetations = null;

	private static synchronized void initMap() {
		if (implemetations == null) {
			implemetations = new HashMap();
			// ...
		}
	}
	public static Foo getInstance(String key) {
		initMap();
		Class c = (Class) implemetations.get(key);
		if (c == null) {
			return new DefaultFoo();
		}
		try {
			return (Foo) c.newInstance();
		} catch (Exception e) {
			return new DefaultFoo();
		}
	}

}
