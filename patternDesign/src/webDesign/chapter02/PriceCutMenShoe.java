package webDesign.chapter02;

/**
 * @author malf
 * @description 降价男鞋类
 * @project bookStudy
 * @since 2020/10/26
 */
public class PriceCutMenShoe extends MenShoe {

	public PriceCutMenShoe(String name, String type, int value) {
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
			// 大于200则打8折
			cutPrice = primeCost * 80 / 100;
		} else if (primeCost > 150) {
			// 大于150则打8.5折
			cutPrice = primeCost * 85 / 100;
		} else {
			// 其余打9折
			cutPrice = primeCost * 90 / 100;
		}
		return cutPrice;
	}
}
