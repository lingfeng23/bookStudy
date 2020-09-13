package Vmediator;

/**
 * @author malf
 * @Description 具体的中介
 * @project patternDesign
 * @since 2020/8/24
 */
public class ConcreteMediator extends Mediator {
	public ConcreteMediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
		super(colleagueTenant, colleagueLandlord);
	}

	@Override
	public boolean notifyTenant(String message) {
		if (colleagueTenant != null) {
			return colleagueTenant.operation(message);
		}
		return false;
	}

	@Override
	public boolean notifyLandlord(String message) {
		if (colleagueLandlord != null) {
			return colleagueLandlord.operation(message);
		}
		return false;
	}
}
