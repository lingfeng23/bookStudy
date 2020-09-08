package malf;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 影片租赁价格
 */
public abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge(int daysRented);
	// 声明为抽象，子类实现
	/*double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (daysRented > 2) {
					result += (daysRented - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				result += daysRented * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (daysRented > 3) {
					result += (daysRented - 3) * 1.5;
				}
				break;
		}
		return result;
	}*/
	int getFrequentRenterPoints(int daysRented) {
		return 1;
		// 子类实现覆盖
		/*if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
			return 2;
		} else {
			return 1;
		}*/
	}
}
