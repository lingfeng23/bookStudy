package Mstrategy;

/**
 * @author malf
 * @Description 测试策略模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		TravelStrategy travelByAirStrategy = new TravelByAirStrategy();
		// 坐飞机
		context.setTravelStrategy(travelByAirStrategy);
		context.travelMode();
		System.out.println();
		// 坐汽车
		TravelStrategy travelByCarStrategy = new TravelByCarStrategy();
		context.setTravelStrategy(travelByCarStrategy);
		context.travelMode();
	}
}
