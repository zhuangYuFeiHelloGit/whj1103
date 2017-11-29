package com.lanou3g.study;

public class Cat {
	private String name;
	private Person onwer;
	
	/*
	 * 构造方法：
	 * 		1，方法名与类名相同
	 * 		2，没有返回值这一功能
	 * 有了构造方法，还要set/get干什么？
	 * 首先第一点，get是一定要有的，否则
	 * 在类的外面是无法获得私有属性的。
	 * 
	 * 关于set：
	 * 	 有些属性，并不是每个对象都要具有的，
	 * 比如cat可能会有一个伴侣，但是并不是每个
	 * cat在初始化的时候，都马上就有一个伴侣了
	 * 所以可以在后续的使用中，通过set方法
	 * 给他设置一个
	 *   对于初始化就有的这个onwer属性，
	 * 很可能这个猫也后被卖了，那就需要换一个
	 * 主人，这时候也可以使用set方法，去修改属性
	 */
	
	
	public Cat(Person onwer){
		//将括号中的参数onwer的值
		//赋值给了属性onwer
		this.onwer = onwer;
	}


	public Person getOnwer() {
		return onwer;
	}

	public void setOnwer(Person onwer) {
		this.onwer = onwer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
