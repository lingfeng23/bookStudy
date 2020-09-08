package malf.chapter3;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 对于所有对象都通用的方法
 * 				示例代码
 */
public class Example {
	public static void main(String[] args) {
		Point point = new Point(1, 2);
		ColorPoint colorPoint1 = new ColorPoint(1, 2, Color.RED);
		ColorPoint colorPoint2 = new ColorPoint(1, 2, Color.BLUE);
		System.out.println(point.equals(colorPoint1));
		System.out.println(colorPoint1.equals(point));
		System.out.println(colorPoint1.equals(colorPoint2));

		Map map = new HashMap();
		map.put(new PhoneNumber(408, 867, 5043), "AAA");
		System.out.println(map.get(new PhoneNumber(408, 867, 5043)));
	}
}
