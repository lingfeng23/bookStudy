package Ntemplate;

/**
 * @author malf
 * @Description 模板类
 * @project patternDesign
 * @since 2020/8/23
 */
public abstract class AbstractTemplate {
	// 模板方法，用于核心流程和算法的定义
	public void templateMethod() {
		checkNumber();
		queueUp();
		handleBusiness();
		serviceSum();
	}
	// 抽号
	public void checkNumber() {
		System.out.println("抽号。");
	}
	// 排队
	public void queueUp() {
		System.out.println("排队。");
	}
	// 业务办理
	public void handleBusiness() {
		System.out.println("业务办理。");
	}
	// 服务评价
	public void serviceSum() {
		System.out.println("服务评价。");
	}

}
