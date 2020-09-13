package QchainOfResponsibility;

/**
 * @author malf
 * @Description 用户授权类
 * @project patternDesign
 * @since 2020/8/24
 */
public class AuthHandler extends AbstractHandler implements Handler {
	private String name;

	public AuthHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println("用户授权：");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
}
