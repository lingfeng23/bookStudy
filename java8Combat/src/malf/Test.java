package malf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author malf
 * @createTime 2020/9/1
 * @description 调试代码专用
 */
public class Test {
	public static void main(String[] args) {
		//System.out.println("1");
		Apple apple1 = new Apple();
		apple1.setColor("green");
		apple1.setWeight(200);
		Apple apple2 = new Apple();
		apple2.setColor("red");
		apple2.setWeight(100);
		List<Apple> apples = new ArrayList<>();
		apples.add(apple1);
		apples.add(apple2);
		//System.out.println(Test.filterApples(apples,Apple::isGreen));
		prettyPrint(apples, new AppleFormatImpl());
	}

	public static List filterApples(List<Apple> apples, Predicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple: apples) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApples(List<Apple> apples, String color,
										   int weight, boolean flag) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple: apples) {
			if ((flag && apple.getWeight() > weight) ||
					(!flag && apple.getColor().equals(color))) {
				result.add(apple);
			}
		}
		return result;
	}

	public static void prettyPrint(List<Apple> apples, AppleFormat format) {
		for (Apple apple: apples) {
			String output = format.accept(apple);
			System.out.println(output);
		}
	}
}
