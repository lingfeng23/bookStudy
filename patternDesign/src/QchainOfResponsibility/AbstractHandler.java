package QchainOfResponsibility;

/**
 * @author malf
 * @Description 抽象类将责任链上组件连接起来
 * @project patternDesign
 * @since 2020/8/24
 */
public abstract class AbstractHandler {
	private Handler handler;
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
