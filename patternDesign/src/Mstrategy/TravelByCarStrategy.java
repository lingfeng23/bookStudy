package Mstrategy;

/**
 * @author malf
 * @Description 坐汽车出行
 * @project patternDesign
 * @since 2020/8/23
 */
public class TravelByCarStrategy implements TravelStrategy {
	@Override
	public void travelMode() {
		System.out.println("坐汽车出行旅游。");
	}
}
