package Oobserver;

/**
 * @author malf
 * @Description 抽象观察者
 * @project patternDesign
 * @since 2020/8/23
 */
public interface Observer {
	// 接收数据
	void dataChange(String message);
}
