package webDesign.chapter02;

/**
 * @author malf
 * @description 男鞋类
 * @project bookStudy
 * @since 2020/10/26
 */
public class MenShoe implements IShoe {
	private String name; // 男鞋名
	private String type; // 男鞋类
	private int value; // 男鞋价格
	public MenShoe(String name, String type, int value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getType() {
		return null;
	}

	@Override
	public int getValue() {
		return value;
	}
}
