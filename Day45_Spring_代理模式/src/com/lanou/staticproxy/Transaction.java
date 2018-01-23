package com.lanou.staticproxy;

/**
 * Created by zyf on 2018/1/23.
 */
public class Transaction {
	public void begin(){
		System.out.println("begin----");
	}
	public void commit(){
		System.out.println("commit----");
	}
}
