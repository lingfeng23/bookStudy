package malf.mapper;

import malf.model.SysRole;
import malf.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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

	@Test
	public void testSelectByUser() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = new SysUser();
			// 只查询用户名
			user.setName("张三");
			List<SysUser> users = userMapper.selectByUser(user);
			Assert.assertTrue(users.size() > 0);
			// 只查询邮箱
			user = new SysUser();
			user.setEmail("123456@qq.com");
			users = userMapper.selectByUser(user);
			Assert.assertTrue(users.size() > 0);
			// 查询用户名和邮箱
			user = new SysUser();
			user.setName("张三");
			user.setEmail("15131257162@163.com");
			users = userMapper.selectByUser(user);
			Assert.assertTrue(users.size() > 0);
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testUpdateByIdSelective() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = new SysUser();
			user.setId(1L);
			user.setEmail("opopop@op.com");
			int result = userMapper.updateByIdSelective(user);
			Assert.assertEquals(1, result);
			user = userMapper.selectById(1L);
			Assert.assertEquals("张三", user.getName());
			Assert.assertEquals("opopop@op.com", user.getEmail());
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectByIdOrName() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user = new SysUser();
			// ID和用户名
			user.setId(1L);
			user.setName("张三");
			SysUser result = userMapper.selectByIdOrName(user);
			Assert.assertNotNull(result);
			// 没有ID
			user.setId(null);
			result = userMapper.selectByIdOrName(user);
			Assert.assertNotNull(result);
			// ID和用户名都为空
			user.setName(null);
			result = userMapper.selectByIdOrName(user);
			Assert.assertNull(result);
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectByIdList() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<Long> ids = new ArrayList<Long>();
			ids.add(1L);
			ids.add(2L);
			ids.add(18L);
			List<SysUser> users = userMapper.selectByIdList(ids);
			Assert.assertEquals(2, users.size());
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testInsertList() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<SysUser> users = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				SysUser user = new SysUser();
				user.setName("test" + i);
				user.setPassword("password" + i);
				user.setCreateTime(new Date());
				users.add(user);
			}
			int result = userMapper.insertList(users);
			Assert.assertEquals(3, result);
		} finally {
			sqlSession.close();
		}
	}

}
