package malf;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 租赁：某个顾客租了一部影片
 */
public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	double getCharge() {
		return movie.getCharge(daysRented);
		// 重构 -> getCharge(int daysRented)
		/*double result = 0;
		switch (getMovie().getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (getDayRented() > 2) {
					result += (getDayRented() - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				result += getDayRented() * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (getDayRented() > 3) {
					result += (getDayRented() - 3) * 1.5;
				}
				break;
		}
		return result;*/
	}

	int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
		// 重构 -> getFrequentRenterPoints(int daysRented)
		/*if (getMovie().getPriceCode() == Movie.NEW_RELEASE &&
				getDaysRented() > 1) {
			return 2;
		} else {
			return 1;
		}*/
	}
}
