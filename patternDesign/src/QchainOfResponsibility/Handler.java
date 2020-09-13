package QchainOfResponsibility;

/**
 * @author malf
 * @Description 责任连接口，规定责任链上各环节的操作
 * @project patternDesign
 * @since 2020/8/24
 */
public interface Handler {
	void operator();
}
