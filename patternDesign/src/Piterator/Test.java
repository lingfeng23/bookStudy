package Piterator;

/**
 * @author malf
 * @Description 测试迭代器模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		// 定义集合
		Collection collection = new ListCollection();
		// 添加元素
		collection.add("object1");
		collection.add("object2");
		collection.add(123);
		// 使用迭代器遍历
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
