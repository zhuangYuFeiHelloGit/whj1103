package com.lanou3g.study;

import com.lanou3g.study.syn.TicketDemo;

/**
 * Created by zyf on 2017/12/8.
 */
public class Main4 {

	public static void main(String[] args) {


		/*
		synchronized
		同步：如果你先开始了，那等你干完了我再开始
		异步：你干你的，我干我的
		 */


		TicketDemo td = new TicketDemo();

		startSell(td);
		startSell(td);
		startSell(td);
		startSell(td);


	}

	private static void startSell(final TicketDemo td) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				//在这个线程中，调用td的方法时
				//我们说这个现象为：
				// 线程进入了这个sellTicket方法
				td.sellTicket();
			}
		}).start();
	}
}
