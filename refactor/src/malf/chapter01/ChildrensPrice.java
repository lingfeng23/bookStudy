package malf.chapter01;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 儿童片租赁价格
 */
public class ChildrensPrice  extends Price {
	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}
}
