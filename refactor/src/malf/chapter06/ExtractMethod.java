package malf.chapter06;

/**
 * @author malf
 * @createTime 2020/9/12
 * @description 提炼函数
 */
public class ExtractMethod {
	void printOwing() {
		// print banner 重构-> printBanner()
		printBanner();
		/*System.out.println("*********************************");
		System.out.println("********Customer Banner**********");
		System.out.println("*********************************");*/
	}
	void printBanner() {
		System.out.println("*********************************");
		System.out.println("********Customer Banner**********");
		System.out.println("*********************************");
	}
}
