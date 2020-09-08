package malf.chapter3;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 类描述
 */
public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)){
			return false;
		}
		Point point = (Point) obj;
		return point.x == x && point.y == y;
	}
}
