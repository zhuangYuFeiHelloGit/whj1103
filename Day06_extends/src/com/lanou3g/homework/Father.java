package com.lanou3g.homework;

public class Father {
	/*
	 * 父亲里面，有一个妻子有一个孩子
	 * 现在我们没有Mother类和Child类
	 * 所以我们去创建一个
	 */
	//定义两个属性，分别表示这个父亲的妻子和孩子
	private Mother wife;
	private Child child;
	
	//表示父亲的名字
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	//father.setWife(mother)的
	//这个mother就是这里的wife
	public void setWife(Mother wife){
		this.wife = wife;
	}
	
	public void setChild(Child child){
		this.child = child;
	}
	
	public void showFamily(){
		System.out.println(
				name+"的妻子是"
				+wife.getName()
				+"，他的孩子是"
				+child.getName());
	}
	
	
	
	
	
	
	
}
