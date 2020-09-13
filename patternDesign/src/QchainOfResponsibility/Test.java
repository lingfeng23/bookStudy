package QchainOfResponsibility;

import java.util.ResourceBundle;

/**
 * @author malf
 * @Description 测试责任链模式
 * @project patternDesign
 * @since 2020/8/24
 */
public class Test {
	public static void main(String[] args) {
		AuthHandler authHandler = new AuthHandler("auth");
		BusinessHandler businessHandler = new BusinessHandler("business");
		ResponseHandler responseHandler = new ResponseHandler("response");
		authHandler.setHandler(businessHandler);
		businessHandler.setHandler(responseHandler);
		authHandler.operator();
	}
}
