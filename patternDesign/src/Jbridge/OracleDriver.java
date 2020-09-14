package Jbridge;

/**
 * @author malf
 * @Description Oracle驱动器
 * @project patternDesign
 * @since 2020/8/23
 */
public class OracleDriver implements Driver {
	@Override
	public void executeSQL() {
		System.out.println("通过Oracle驱动器执行SQL。");
	}
}
