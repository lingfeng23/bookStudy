package malf.chapter4;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 复数类
 */
public final class Complex {
	public static final Complex ZERO = new Complex(0, 0);	// 0
	public static final Complex ONE = new Complex(1, 0);	// 1
	public static final Complex I = new Complex(0, -1);		// i

	// 实部
	private final float re;
	// 虚部
	private final float im;

	// 构造函数私有化，增加公有的静态工厂
	/*public Complex(float re, float im) {
		this.re = re;
		this.im = im;
	}*/
	private Complex(float re, float im) {
		this.re = re;
		this.im = im;
	}
	public static Complex valueOf(float re, float im) {
		return new Complex(re, im);
	}

	public float realPart() {
		return re;
	}
	public float imaginaryPart() {
		return im;
	}

	// 加法
	public Complex add(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}
	// 减法
	public Complex subtract(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Complex)) return false;
		Complex c = (Complex) o;
		return (Float.floatToIntBits(re) == Float.floatToIntBits(c.re)) &&
				(Float.floatToIntBits(im) == Float.floatToIntBits(c.im));
	}
	public int hashCode() {
		int result = 17 + Float.floatToIntBits(re);
		result = 37 * result + Float.floatToIntBits(im);
		return result;
	}
	public String toString() {
		return "(" + re + "" + im + ")";
	}

}
