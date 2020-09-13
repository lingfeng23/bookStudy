package Uvisitor;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @author malf
 * @Description 访问者CEO
 * @project patternDesign
 * @since 2020/8/24
 */
public class CEOVisitor implements Visitor {
	@Override
	public void visit(ProjectElement element) {
		System.out.println("CEO访问元素：");
		element.signature("CEO", new Date());
		System.out.println(JSON.toJSON(element));
	}
}
