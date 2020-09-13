package Vmediator;

/**
 * @author malf
 * @Description 抽象的中介者类
 * @project patternDesign
 * @since 2020/8/24
 */
public abstract class Mediator {
	protected Colleague colleagueTenant;
	protected Colleague colleagueLandlord;

	public Mediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
		this.colleagueTenant = colleagueTenant;
		this.colleagueLandlord = colleagueLandlord;
	}
	public abstract boolean notifyTenant(String message);
	public abstract boolean notifyLandlord(String message);
}
