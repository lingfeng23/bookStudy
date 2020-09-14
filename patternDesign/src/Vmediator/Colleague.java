package Vmediator;

/**
 * @author malf
 * @Description 抽象的同事类
 * @project patternDesign
 * @since 2020/8/24
 */
public abstract class Colleague {
	protected Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}
	// 同事类的操作
	public abstract boolean operation(String message);
}
