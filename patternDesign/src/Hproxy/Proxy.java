package Hproxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author malf
 * @Description 公司的代理
 * @project patternDesign
 * @since 2020/8/23
 */
public class Proxy implements Company {
	private HR hr;
	public Proxy() {
		super();
		this.hr = new HR();
	}
	@Override
	public void findWorker(String title) {
		hr.findWorker(title);
		// 通过猎头招人
		String worker = getWorker(title);
		System.out.println("通过猎头招人，姓名是：" + worker);
	}
	private String getWorker(String title) {
		Map<String, String> workers = new HashMap<String, String>() {
			{
				put("Java", "张三");
				put("Python", "李四");
				put("PHP", "王五");
			}
		};
		return workers.get(title);
	}
}
