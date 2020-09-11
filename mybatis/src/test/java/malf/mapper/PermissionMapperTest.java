package malf.mapper;

import malf.model.SysPermission;
import malf.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/9/11
 */
public class PermissionMapperTest extends BaseMapperTest {
	@Test
	public void testSelectById() {
		SqlSession sqlSession = getSqlSession();
		try {
			PermissionMapper permissionMapper = sqlSession.getMapper(PermissionMapper.class);
			SysPermission permission = permissionMapper.selectById(1L);
			Assert.assertNotNull(permission);
			Assert.assertEquals("增加", permission.getName());
		} finally {
			sqlSession.close();
		}
	}
}
