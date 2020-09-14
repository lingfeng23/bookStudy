package Mstrategy;

/**
 * @author malf
 * @Description 坐飞机出行
 * @project patternDesign
 * @since 2020/8/23
 */
public class TravelByAirStrategy implements TravelStrategy {
	@Override
	public void travelMode() {
		System.out.println("坐飞机出行旅游。");
	}
}
