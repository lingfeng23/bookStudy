package Vmediator;

/**
 * @author malf
 * @Description 房东
 * @project patternDesign
 * @since 2020/8/24
 */
public class ColleagueLandlord extends Colleague {
	@Override
	public boolean operation(String message) {
		System.out.println("房东收到访客的需求：" + message);
		return true;
	}
}
