package Afactory;

/**
 * @author malf
 * @Description 测试工厂模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Phone huawei = factory.createPhone("HuaWei");
		Phone iphone = factory.createPhone("Apple");
		System.out.println(huawei.brand());
		System.out.println(iphone.brand());
	}
}
