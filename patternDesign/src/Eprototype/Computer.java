package Eprototype;

/**
 * @author malf
 * @Description 浅复制
 * @project patternDesign
 * @since 2020/8/23
 */
public class Computer implements Cloneable {
	private String cpu;
	private String memory;
	private String disk;
	public Computer(String cpu, String memory, String disk) {
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}
	public Object clone() {
		try {
			return (Computer) super.clone();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Computer{" +
				"cpu='" + cpu + '\'' +
				", memory='" + memory + '\'' +
				", disk='" + disk + '\'' +
				'}';
	}
}
