package webDesign.chapter02;

/**
 * @author malf
 * @description 女鞋类
 * @project bookStudy
 * @since 2020/10/26
 */
public class GirlShoe implements IShoe {
	private String name; // 女鞋名
	private String type; // 女鞋类
	private int value; // 女鞋价格
	public GirlShoe(String name, String type, int value) {
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
