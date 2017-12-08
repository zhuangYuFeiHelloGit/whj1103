package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/8.
 */
public class Main2 {
	public static void main(String[] args) {
//		Thread thread =
//			new Thread(new HelloRunnable());

//		thread.run();


		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.print(".");
		}



	}
}
