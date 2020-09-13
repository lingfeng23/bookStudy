package Dbuilder;

/**
 * @author malf
 * @Description 实现产品构造和装配的过程
 * @project patternDesign
 * @since 2020/8/23
 */
public class ComputerConcreteBuilder implements ComputerBuilder {
	Computer computer;
	public ComputerConcreteBuilder() {
		computer = new Computer();
	}
	@Override
	public void buildCpu() {
		System.out.println("组装CPU");
		computer.setCpu("8Core");
	}

	@Override
	public void buildMemory() {
		System.out.println("组装内存");
		computer.setMemory("16G");
	}

	@Override
	public void buildDisk() {
		System.out.println("组装硬盘");
		computer.setDisk("1TB");
	}

	@Override
	public Computer buildComputer() {
		return computer;
	}
}
