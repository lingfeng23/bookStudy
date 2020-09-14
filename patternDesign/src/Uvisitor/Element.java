package Uvisitor;

/**
 * @author malf
 * @Description 元素接口，用于接收访问者对象
 * @project patternDesign
 * @since 2020/8/24
 */
public interface Element {
	void accept(Visitor visitor);
}
