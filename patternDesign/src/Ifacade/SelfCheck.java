package Ifacade;

/**
 * @author malf
 * @Description 自检系统
 * @project patternDesign
 * @since 2020/8/23
 */
public class SelfCheck {
	public void startup() {
		System.out.println("启动前自检完毕。");
	}
	public void shutdown() {
		System.out.println("关闭前自检完毕。");
	}
}
