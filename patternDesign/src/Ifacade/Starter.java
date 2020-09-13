package Ifacade;

import java.io.Serializable;

/**
 * @author malf
 * @Description TODO
 * @project patternDesign
 * @since 2020/8/23
 */
public class Starter {
	private Dashboard dashboard;
	private Engine engine;
	private SelfCheck selfCheck;

	public Starter() {
		this.dashboard = new Dashboard();
		this.engine = new Engine();
		this.selfCheck = new SelfCheck();
	}

	public void startup() {
		System.out.println("汽车启动：");
		engine.startup();
		dashboard.startup();
		selfCheck.startup();
		System.out.println("汽车启动完毕。");
	}

	public void shutdown() {
		System.out.println("汽车关闭：");
		selfCheck.shutdown();
		engine.shutdown();
		dashboard.shutdown();
		System.out.println("汽车关闭完毕。");
	}
}
