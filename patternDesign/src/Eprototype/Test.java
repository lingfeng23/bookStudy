package Eprototype;

/**
 * @author malf
 * @Description 测试原型模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		// 浅复制
		Computer computer = new Computer("8Core", "16G", "1TB");
		System.out.println("浅复制前：" + computer.toString());
		Computer computerClone = (Computer) computer.clone();
		System.out.println("浅复制后：" + computerClone.toString());

		// 深复制
		Disk disk = new Disk("208G", "2TB");
		ComputerDetail computerDetail = new ComputerDetail("12Core", "32G", disk);
		System.out.println("深复制前：" + computerDetail.toString());
		ComputerDetail computerDetail1Clone = (ComputerDetail) computerDetail.clone();
		System.out.println("深复制后：" + computerDetail1Clone.toString());
	}
}
