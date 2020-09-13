package Dbuilder;

/**
 * @author malf
 * @Description 测试建造者模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector();
		ComputerBuilder builder = new ComputerConcreteBuilder();
		Computer computer = director.constructComputer(builder);
		System.out.println(computer.getCpu());
		System.out.println(computer.getDisk());
		System.out.println(computer.getMemory());
	}
}
