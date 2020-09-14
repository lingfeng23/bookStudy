package Uvisitor;

/**
 * @author malf
 * @Description 访问者接口
 * @project patternDesign
 * @since 2020/8/24
 */
public interface Visitor {
	void visit(ProjectElement element);
}
