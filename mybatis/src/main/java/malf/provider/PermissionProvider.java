package malf.provider;

import org.apache.ibatis.jdbc.SQL;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/9/11
 */
public class PermissionProvider {
	public String selectById(final Long id) {
		return new SQL() {
			{
				SELECT("id, name, url");
				FROM("sys_permission");
				WHERE("id = #{id}");
			}
		}.toString();
		//效果相同
		//return "select id, name, url from sys_permission where id = #{id}";
	}
}
