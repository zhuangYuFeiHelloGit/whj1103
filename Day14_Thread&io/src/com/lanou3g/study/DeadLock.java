package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/11.
 */
public class DeadLock {
	private String lockA = "lockA";
	private String lockB = "lockB";


	public void forThreadA(){
		System.out.println("A线程准备持有lockA-");
		synchronized (lockA){
			System.out.println(
					"A线程已经持有lockA，" +
						"准备只有lockB"
			);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (lockB){
				System.out.println(
						"A线程已经持有lockB-"
				);

			}

		}

	}

	public void forThreadB(){
		System.out.println("B线程准备持有lockB-");
		synchronized (lockB){
			System.out.println(
					"B线程已经持有lockB，" +
							"准备只有lockA"
			);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (lockA){
				System.out.println(
						"B线程已经持有lockA-"
				);

			}

		}
	}








}
