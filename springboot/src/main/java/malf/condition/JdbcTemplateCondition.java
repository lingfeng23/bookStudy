package malf.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 类描述
 */
public class JdbcTemplateCondition implements Condition {
	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
		try {
			conditionContext.getClassLoader().loadClass(
					"org.springframework.jdbc.core.JdbcTemplate");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
