package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/20.
 */
public class T {
	public T(){
		System.out.println("我是构造方法");
	}

	{
		System.out.println("我是构造代码块");
	}

	static {
		System.out.println("我是静态代码块");
	}
}
