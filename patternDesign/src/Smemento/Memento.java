package Smemento;

/**
 * @author malf
 * @Description 备忘录
 * @project patternDesign
 * @since 2020/8/24
 */
public class Memento {
	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
