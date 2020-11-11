import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author malf
 * @description SQL语句测试类
 * @project bookStudy
 * @since 2020/10/30
 */
public class SqlTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/how2java?useUnicode=true&characterEncoding=UTF-8";
			String username = "root";
			String password = "password";
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);
		} catch (Exception e) {
		}


	}
}
