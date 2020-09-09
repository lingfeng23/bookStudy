package malf.chapter01;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 影片
 */
public class Movie {
	public static final int REGULAR = 0;    // 普通片
	public static final int NEW_RELEASE = 1;// 新片
	public static final int CHILDRENS = 2;  // 儿童片

	private String title;
	private Price price;
	// 重构 -> Price price
	//private int priceCode;

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
		//this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
			case REGULAR:
				price = new RegularPrice();
				break;
			case CHILDRENS:
				price = new ChildrensPrice();
				break;
			case NEW_RELEASE:
				price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("错误的价格代码");
		}
		//this.priceCode = priceCode;
	}

	double getCharge(int daysRented) {
		return price.getCharge(daysRented);
		// 重构 -> getCharge(int daysRented)
		/*double result = 0;
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
		return result;*/
	}

	int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
		// 重构 -> getFrequentRenterPoints(int daysRented)
		/*if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
			return 2;
		} else {
			return 1;
		}*/
	}

}
