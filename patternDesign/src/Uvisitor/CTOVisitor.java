package Uvisitor;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @author malf
 * @Description 访问者CTO
 * @project patternDesign
 * @since 2020/8/24
 */
public class CTOVisitor implements Visitor {
	@Override
	public void visit(ProjectElement element) {
		System.out.println("CTO访问元素：");
		element.signature("CTO", new Date());
		System.out.println(JSON.toJSON(element));
	}
}
