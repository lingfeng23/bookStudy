package malf.chapter3;

import java.awt.*;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 类描述
 */
public class ColorPoint /*extends Point*/ {
	private Color color;
	private Point point;
	public ColorPoint(int x, int y, Color color) {
		point = new Point(x, y);
		this.color = color;
	}
	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ColorPoint)){
			return obj.equals(this);
		}
		ColorPoint colorPoint = (ColorPoint) obj;
		return colorPoint.point.equals(point) && colorPoint.color.equals(color);
	}
}
