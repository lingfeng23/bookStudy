package malf.chapter3;

import java.util.Objects;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 类描述
 */
public final class PhoneNumber {
	private final short areaCode;
	private final short exchange;
	private final short extension;

	private volatile int hashCode = 0;
	public PhoneNumber(int areaCode, int exchange, int extension) {
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(exchange, 999, "exchange");
		rangeCheck(exchange, 999, "extension");
		this.areaCode = (short) areaCode;
		this.exchange = (short)exchange;
		this.extension = (short)extension;
	}
	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max) {
			throw new IllegalArgumentException(name + ":" + arg);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof PhoneNumber)) return false;
		PhoneNumber that = (PhoneNumber) o;
		return that.areaCode == areaCode &&
				that.exchange == exchange &&
				that.extension == extension;
	}

	@Override
	public int hashCode() {
		if (hashCode == 0) {
			int result = 37;
			result = 37 * result + areaCode;
			result = 37 * result + exchange;
			result = 37 * result + extension;
			hashCode = result;
		}
		return hashCode;
	}

	public int compareTo(Object o) {
		PhoneNumber pn = (PhoneNumber) o;
		// 比较 areaCode
		if (areaCode < pn.areaCode) {
			return -1;
		}
		if (areaCode > pn.areaCode) {
			return 1;
		}
		// areaCode 相等则比较 exchange
		int exchangeDiff = exchange - pn.exchange;
		if (exchangeDiff != 0) {
			return exchangeDiff;
		}
		// areaCode 和 exchange 相等，比较 extension
		return extension - pn.extension;
	}
}
