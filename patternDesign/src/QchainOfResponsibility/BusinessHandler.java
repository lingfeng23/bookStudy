package QchainOfResponsibility;

/**
 * @author malf
 * @Description 业务处理类
 * @project patternDesign
 * @since 2020/8/24
 */
public class BusinessHandler extends AbstractHandler implements Handler {
	private String name;

	public BusinessHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println("业务办理：");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
}
