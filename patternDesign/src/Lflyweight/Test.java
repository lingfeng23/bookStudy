package Lflyweight;

/**
 * @author malf
 * @Description 测试享元模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		// 首次获取内存，将创建
		Memory memory = MemoryFactory.getMemory(32);
		// 使用户释放内存
		MemoryFactory.releaseMemory(memory.getId());
		// 重新获取内存
		MemoryFactory.getMemory(32);
	}
}
