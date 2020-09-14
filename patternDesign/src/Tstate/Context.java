package Tstate;

/**
 * @author malf
 * @Description 存储状态和执行不同状态的行为
 * @project patternDesign
 * @since 2020/8/24
 */
public class Context {
	private AbstractState state;

	public Context(AbstractState state) {
		this.state = state;
	}

	public AbstractState getState() {
		return state;
	}

	public void setState(AbstractState state) {
		this.state = state;
	}
	public void action() {
		this.state.action(this);
	}
}
