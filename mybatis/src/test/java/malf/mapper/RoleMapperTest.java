package malf.mapper;

import malf.model.Enabled;
import malf.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author malf
 * @createTime 2020/9/11
 * @description 类描述
 */
public class RoleMapperTest extends BaseMapperTest {
	@Test
	public void testSelectById() {
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			SysRole role = roleMapper.selectById(1L);
			Assert.assertNotNull(role);
			Assert.assertEquals("管理员", role.getName());
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testUpdateById() {
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			SysRole role = roleMapper.selectById(1L);
			Assert.assertEquals(Enabled.enabled, role.getEnabled());
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void testInsert() {
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			SysRole role = new SysRole();
			role.setName("测试");
			role.setCreateBy(1);
			role.setCreateTime(new Date());
			role.setEnabled(Enabled.enabled);
			int result = roleMapper.insert(role);
			Assert.assertEquals(1, result);
		} finally {
			sqlSession.close();
		}
	}

}
