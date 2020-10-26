package webDesign.chapter02;

/**
 * @author malf
 * @description 降价女鞋类
 * @project bookStudy
 * @since 2020/10/26
 */
public class PriceCutGirlShoe extends GirlShoe {

	public PriceCutGirlShoe(String name, String type, int value) {
		super(name, type, value);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getType() {
		return super.getType();
	}

	@Override
	public int getValue() {
		int primeCost = super.getValue();
		int cutPrice = 0;
		if (primeCost > 200) {
			// 大于200则打7.5折
			cutPrice = primeCost * 75 / 100;
		} else if (primeCost > 150) {
			// 大于150则打8折
			cutPrice = primeCost * 80 / 100;
		} else {
			// 其余打8.5折
			cutPrice = primeCost * 85 / 100;
		}
		return cutPrice;
	}
}
