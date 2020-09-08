package malf.chapter2;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 创建和销毁对象
 * 				示例代码
 */
public class Example {
	public static Boolean valueOf(boolean b) {
		// 不创建新对象
		Boolean flag = Boolean.valueOf(b);
		// 静态工厂方法
		return (b ? Boolean.TRUE : Boolean.FALSE);
	}
}
