package Lflyweight;

/**
 * @author malf
 * @Description 内存
 * @project patternDesign
 * @since 2020/8/23
 */
public class Memory {
	private int size;
	private boolean isUsed;
	private String id;

	public Memory(int size, boolean isUsed, String id) {
		this.size = size;
		this.isUsed = isUsed;
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean used) {
		isUsed = used;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
