package Smemento;

/**
 * @author malf
 * @Description 备忘录管理者
 * @project patternDesign
 * @since 2020/8/24
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
