package Jbridge;

/**
 * @author malf
 * @Description MySQL驱动器
 * @project patternDesign
 * @since 2020/8/23
 */
public class MySQLDriver implements Driver {
	@Override
	public void executeSQL() {
		System.out.println("通过MySQL驱动器执行SQL。");
	}
}
