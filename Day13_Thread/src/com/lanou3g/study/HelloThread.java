package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/8.
 */
public class HelloThread extends Thread {

	public HelloThread(Runnable target) {
		super(target);
	}

	@Override
	public void run() {
		//super.run();

		for (int i = 0; i < 10000; i++) {

			System.out.println("hello thread："+i);
		}

	}
}
