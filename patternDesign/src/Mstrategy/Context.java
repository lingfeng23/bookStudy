package Mstrategy;

/**
 * @author malf
 * @Description 实现策略模式
 * @project patternDesign
 * @since 2020/8/23
 */
public class Context {
	private TravelStrategy travelStrategy;
	public TravelStrategy getTravelStrategy() {
		return travelStrategy;
	}

	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}
	public void travelMode() {
		this.travelStrategy.travelMode();
	}
}
