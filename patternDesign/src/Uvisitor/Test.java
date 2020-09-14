package Uvisitor;

/**
 * @author malf
 * @Description 测试访问者模式
 * @project patternDesign
 * @since 2020/8/24
 */
public class Test {
	public static void main(String[] args) {
		Element element = new ProjectElement("写诗", "床前明月光");
		element.accept(new CTOVisitor());
		element.accept(new CEOVisitor());
	}
}
