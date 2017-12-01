package com.lanou3g.study;

import com.lanou3g.inter.Work;

public class Doctor extends Person implements Work{

	@Override
	public void work() {
		System.out.println("研究研究新型病毒");
	}

	@Override
	public void goHome() {
		System.out.println("回家陪老婆孩子去了");
		
	}

}
