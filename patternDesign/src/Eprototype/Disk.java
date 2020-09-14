package Eprototype;

/**
 * @author malf
 * @Description 硬盘
 * @project patternDesign
 * @since 2020/8/23
 */
public class Disk implements Cloneable {
	private String ssd;
	private String hhd;

	public Disk(String ssd, String hhd) {
		this.ssd = ssd;
		this.hhd = hhd;
	}
	public Object clone() {
		try {
			return (Disk) super.clone();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Disk{" +
				"ssd='" + ssd + '\'' +
				", hhd='" + hhd + '\'' +
				'}';
	}
}
