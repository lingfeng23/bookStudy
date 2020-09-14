package Vmediator;

/**
 * @author malf
 * @Description 测试中介者模式
 * @project patternDesign
 * @since 2020/8/24
 */
public class Test {
	public static void main(String[] args) {
		// 定义租户
		Colleague colleagueTenant = new ColleagueTenant();
		// 定义房东
		Colleague colleagueLandlord = new ColleagueLandlord();
		// 创建中介
		ConcreteMediator concreteMediator = new ConcreteMediator(colleagueTenant, colleagueLandlord);
		boolean result = concreteMediator.notifyTenant("想租2室1厅的房子吗？");
		if (result) {
			concreteMediator.notifyLandlord("租户对房子很满意。");
		} else {
			concreteMediator.notifyLandlord("租户对房子不满意。");
		}
	}
}
