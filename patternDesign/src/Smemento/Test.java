package Smemento;

/**
 * @author malf
 * @Description 测试备忘录模式
 * @project patternDesign
 * @since 2020/8/24
 */
public class Test {
	public static void main(String[] args) {
		// 创建原始类
		Original original = new Original("张三");
		// 创建备忘录
		Storage storage = new Storage(original.createMemento());
		// 修改原始类状态
		System.out.println("原始数据：" + original.getValue());
		original.setValue("李四");
		System.out.println("修改后数据：" + original.getValue());
		// 恢复原始类状态
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的数据：" + original.getValue());

	}
}
