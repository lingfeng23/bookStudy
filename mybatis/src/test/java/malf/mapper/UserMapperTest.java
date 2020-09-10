package malf.mapper;

import malf.model.SysRole;
import malf.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author malf
 * @description TODO
 * @project bookStudy
 * @since 2020/9/10
 */
public class UserMapperTest extends BaseMapperTest {
	@Test
	public void testSelectById() {
		// 获取 sqlSession
		SqlSession sqlSession = getSqlSession();
		try {
			// 获取 UserMapper 接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			// 调用 selectById 方法
			SysUser user = userMapper.selectById(1L);
			Assert.assertNotNull(user);
			Assert.assertEquals("张三", user.getName());
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void testSelectAll() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<SysUser> users = userMapper.selectAll();
			Assert.assertNotNull(users);
			Assert.assertTrue(users.size() > 0);
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void testSelectRolesByUserId() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<SysRole> roles = userMapper.selectRolesByUserId(1L);
			for (int i = 0; i < roles.size(); i++) {
				System.out.println(roles.get(i).getName());
			}
			Assert.assertNotNull(roles);
			Assert.assertTrue(roles.size() > 0);
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void testInsert() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = new SysUser();
			user.setName("小马");
			user.setPassword("435678");
			user.setCreateTime(new Date());
			int result = userMapper.insert(user);
			Assert.assertEquals(1, result);
			Assert.assertNull(user.getId());
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testInsertNew() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = new SysUser();
			user.setName("小马");
			user.setPassword("435678");
			user.setCreateTime(new Date());
			int result = userMapper.insertNew(user);
			Assert.assertEquals(1, result);
			Assert.assertNotNull(user.getId());
		} finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}

	@Test
	public void testInsertNew2() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = new SysUser();
			user.setName("小马");
			user.setPassword("435678");
			user.setCreateTime(new Date());
			int result = userMapper.insertNew2(user);
			Assert.assertEquals(1, result);
			Assert.assertNotNull(user.getId());
		} finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}

	@Test
	public void testUpdateById() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = userMapper.selectById(1L);
			Assert.assertEquals("张三",user.getName());
			user.setName("张小三");
			int result = userMapper.updateById(user);
			Assert.assertEquals(1, result);
			user = userMapper.selectById(1L);
			Assert.assertEquals("张小三",user.getName());
		} finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testDeleteById() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = userMapper.selectById(7L);
			Assert.assertNotNull(user);
			Assert.assertEquals(1, userMapper.deleteById(7L));
			Assert.assertNull(userMapper.selectById(7L));
		} finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectRolesByUserIdAndRoleEnabled() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<SysRole> roles = userMapper.selectRolesByUserIdAndRoleEnabled(1L, 1);
			Assert.assertNotNull(roles);
			Assert.assertTrue(roles.size() > 0);
		} finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
}
