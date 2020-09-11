package malf.mapper;

import malf.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

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
			//List<Country> countries = sqlSession.selectList("malf.mapper.CountryMapper.selectAll");
		} finally {
			sqlSession.close();
		}
	}
}
