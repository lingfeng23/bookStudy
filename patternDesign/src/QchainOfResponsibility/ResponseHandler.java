package QchainOfResponsibility;

/**
 * @author malf
 * @Description 请求反馈类
 * @project patternDesign
 * @since 2020/8/24
 */
public class ResponseHandler extends AbstractHandler implements Handler {
	private String name;

	public ResponseHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println("请求反馈：");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
}
