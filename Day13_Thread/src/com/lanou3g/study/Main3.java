package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/8.
 */
public class Main3 {

	private static int num;

	public static void main(String[] args) {
		num = 100000;

		//调研？
		//为什么局部变量，在内部类中使用时
		//一定要用final修饰？

		//什么叫原子性操作？
		//int a = 2; 是原子性操作
		//int b = a + 1; 不是原子性操作
		//第一步：找到a的值
		//第二步：把a的值与1相加得到和
		//第三步：把和给b

		startOneThread();
		startOneThread();
		startOneThread();
		startOneThread();
	}

	private static void startOneThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 25000; i++) {
					System.out.println(--num);
				}

			}
		}).start();
	}
}
