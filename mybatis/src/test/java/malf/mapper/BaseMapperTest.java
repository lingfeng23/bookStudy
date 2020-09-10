package malf.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * @author malf
 * @description 基础测试类
 * @project bookStudy
 * @since 2020/9/10
 */
public class BaseMapperTest {
	private static SqlSessionFactory sqlSessionFactory;
	@BeforeClass
	public static void init() {
		try {
			Reader reader  = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
		}
	}
	public SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
}
