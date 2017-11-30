package com.lanou3g.finals;

public class FinalDemo {
	/*
	 * final关键字表示最终，不可变
	 * 
	 * 被final修饰的类，不可以被继承
	 * 被final修饰的方法，不可以被复写
	 * 被final修饰的变量，不可以被改变
	 */
	
	final int AGE = 10;
	
	public final void show(){
		//AGE = 20;
		
		System.out.println("哈哈哈哈");
	}
	
}
