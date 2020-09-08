package malf.chapter3;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 测试 compareTo 方法
 * 				BigDecimal 类中的 compareTo 方法与 equals 不一致
 */
public class TestCompareTo {
	public static void main(String[] args) {
		Set set1 = new HashSet();	// 通过 equals 方法进行比较是不相等的
		BigDecimal bigDecimal1 = new BigDecimal("1.00");
		BigDecimal bigDecimal2 = new BigDecimal("1.0");
		set1.add(bigDecimal1);
		set1.add(bigDecimal2);

		Set set2 = new TreeSet();	// 通过 compareTo 方法进行比较是相等的
		BigDecimal bigDecimal3 = new BigDecimal("2.00");
		BigDecimal bigDecimal4 = new BigDecimal("2.0");
		set2.add(bigDecimal3);
		set2.add(bigDecimal4);

		System.out.println(set1.size());	// 2
		System.out.println(set2.size());	// 1
	}
}
