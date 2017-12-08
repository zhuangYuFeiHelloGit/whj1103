package com.lanou3g.study.syn;

/**
 * Created by zyf on 2017/12/8.
 */
public class TicketDemo {

	private int ticket = 10000;
	private Boolean b = true;

	/*
		锁
		首先要明确一点，锁是一个对象
		并且，可以是任意类型的对象

		synchronized关键字，就可以给
		方法上一个锁，给方法上锁时候，
		使用的对象是当前类的类对象。
		就是TicketDemo.class对象

		当一个线程进入到sellTicket方法时，
		该线程就会持有这个锁对象。
		其他线程想进入sellTicket方法时，
		找不到锁对象，所以进不去。
		这时候，就只能等待，前一个线程执行完毕后，
		从方法出来，释放锁对象，下一个线程才能进去。
		这个现象，就是同步


	 */


	public synchronized void sellTicket() {


		for (int i = 0; i < 2500; i++) {
			System.out.println(
					Thread.currentThread().getName()+
					"剩余票数：" + (--ticket)
			);
		}

	}
}
