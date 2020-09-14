package Dbuilder;

/**
 * @author malf
 * @Description 实现产品的装配
 * @project patternDesign
 * @since 2020/8/23
 */
public class ComputerDirector {
	public Computer constructComputer(ComputerBuilder computerBuilder) {
		computerBuilder.buildMemory();
		computerBuilder.buildCpu();
		computerBuilder.buildDisk();
		return computerBuilder.buildComputer();
	}
}
