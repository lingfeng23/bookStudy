package Dbuilder;

/**
 * @author malf
 * @Description 描述产品构造和装配的过程
 * @project patternDesign
 * @since 2020/8/23
 */
public interface ComputerBuilder {
	void buildCpu();
	void buildMemory();
	void buildDisk();
	Computer buildComputer();
}
