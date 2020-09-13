package Fadapter;

/**
 * @author malf
 * @Description 测试适配器
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		// 类适配器
		Targetable target = new Adapter();
		target.editTextFile();
		target.editWordFile();

		// 对象适配器
		Source source = new Source();
		Targetable targetable = new ObjectAdapter(source);
		targetable.editTextFile();
		targetable.editWordFile();

		// 接口适配器
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		source1.editTextFile();
		source2.editWordFile();
	}
}
