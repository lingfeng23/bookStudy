package Winterpreter;

import java.util.HashMap;

/**
 * @author malf
 * @Description TODO
 * @project patternDesign
 * @since 2020/8/24
 */
public class Context {
	private HashMap map = new HashMap();
	public void assign(String key, String value) {
		// 在环境类中设值
	}
	public String get(String key) {
		// 获取存储在环境类中的值
		return "";
	}
}
