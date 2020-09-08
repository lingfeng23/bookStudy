package malf;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author malf
 * @createTime 2020/9/3
 * @description 类描述
 */
public class App {
	public static void main(String[] args) {
		System.out.println(111);
		AtomicInteger atomicInteger = new AtomicInteger(10);

		try	{
			Thread.sleep(100);
		} catch (Exception e) {
		}

		new Thread(() -> {
			atomicInteger.getAndIncrement();
		}, "aaa").start();

		atomicInteger.getAndIncrement();
	}
}
