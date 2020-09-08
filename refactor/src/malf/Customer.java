package malf;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 顾客
 */
public class Customer {
	private String name;
	private Vector rentals = new Vector();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.addElement(rental);
	}

	public String getName() {
		return name;
	}

	/**
	 * 生成详单
	 */
	public String statement() {
		// 重构 -> getTotalCharge()
		//double totalAmount = 0;

		// 重构 -> getTotalFrequentRenterPoints()
		// int frequentRenterPoints = 0;
		Enumeration elements = rentals.elements();
		String result = "malf.Rental Record for " + getName() + "\n";
		while (elements.hasMoreElements()) {
			//double thisAmount = 0;
			Rental each = (Rental) elements.nextElement();

			// thisAmount 多余
			//thisAmount = each.getCharge();//amountFor(each);

			// 重构 -> amountFor(each)
			/*switch (each.getMovie().getPriceCode()) {
				case malf.Movie.REGULAR:
					thisAmount += 2;
					if (each.getDayRented() > 2) {
						thisAmount += (each.getDayRented() - 2) * 1.5;
					}
					break;
				case malf.Movie.NEW_RELEASE:
					thisAmount += each.getDayRented() * 3;
					break;
				case malf.Movie.CHILDRENS:
					thisAmount += 1.5;
					if (each.getDayRented() > 3) {
						thisAmount += (each.getDayRented() - 3) * 1.5;
					}
					break;
			}*/

			//frequentRenterPoints += each.getFrequentRenterPoints();
			// 重构 -> getFrequentRenterPoints
			/*frequentRenterPoints++;
			if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE &&
					each.getDayRented() > 1) {
				frequentRenterPoints++;
			}*/
			result += "\t" + each.getMovie().getTitle() + "\t" +
					String.valueOf(each.getCharge()) + "\n";
			//totalAmount += each.getCharge();
		}
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n" +
				"You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " points";
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration elements = rentals.elements();
		while (elements.hasMoreElements()) {
			Rental each = (Rental) elements.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration elements = rentals.elements();
		while (elements.hasMoreElements()) {
			Rental each = (Rental) elements.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	// 重构 -> getCharge()
	/*private double amountFor(Rental rental) {
		return rental.getCharge();
		// 重构 -> getCharge()
		*//*double result = 0;
		switch (rental.getMovie().getPriceCode()) {
			case malf.Movie.REGULAR:
				result += 2;
				if (rental.getDayRented() > 2) {
					result += (rental.getDayRented() - 2) * 1.5;
				}
				break;
			case malf.Movie.NEW_RELEASE:
				result += rental.getDayRented() * 3;
				break;
			case malf.Movie.CHILDRENS:
				result += 1.5;
				if (rental.getDayRented() > 3) {
					result += (rental.getDayRented() - 3) * 1.5;
				}
				break;
		}
		return result;*//*
	}*/

}
