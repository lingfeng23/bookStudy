package malf;

/**
 * @author malf
 * @createTime 2020/9/2
 * @description 类描述
 */
public class Apple implements Predicate {
	private String color;
	private int weight;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public boolean test(Apple apple) {
		return false;
	}
	public static boolean isGreen(Apple apple) {
		return "green".equals(apple.getColor());
	}
	public static boolean isHeavy(Apple apple) {
		return apple.getWeight() > 150;
	}
}
