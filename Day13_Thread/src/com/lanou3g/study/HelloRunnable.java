package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/8.
 */
public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("hello runnable："+i);
		}
	}

}
