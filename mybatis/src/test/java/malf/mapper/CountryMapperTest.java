package malf.mapper;

import malf.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author malf
 * @description CountryMapper 测试类
 * @project bookStudy
 * @since 2020/9/9
 */
public class CountryMapperTest extends BaseMapperTest {
	@Test
	public void testSelectAll() {
		SqlSession sqlSession = getSqlSession();
		try {
			List<Country> countries = sqlSession.selectList("malf.mapper.CountryMapper.selectAll");
			print(countries);
		} finally {
			sqlSession.close();
		}
	}
	private void print(List<Country> countries) {
		for (Country country: countries) {
			System.out.printf("%-4d%4s%4s\n",
					country.getId(), country.getCountryname(), country.getCountrycode());
		}
	}
}
