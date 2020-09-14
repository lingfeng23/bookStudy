package BabstractFactory;

/**
 * @author malf
 * @Description 测试抽象工厂模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		AbstractFactory phoneFactory = new PhoneFactory();
		Phone phoneHuaWei = phoneFactory.createPhone("HuaWei");
		Phone phoneApple = phoneFactory.createPhone("Apple");
		System.out.println(phoneHuaWei.call());
		System.out.println(phoneApple.call());

		AbstractFactory computerFactory = new ComputerFactory();
		Computer computerHuaWei = computerFactory.createComputer("HuaWei");
		Computer computerApple = computerFactory.createComputer("Apple");
		System.out.println(computerHuaWei.internet());
		System.out.println(computerApple.internet());
	}
}
