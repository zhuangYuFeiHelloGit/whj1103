package com.lanou3g.inter;

import com.lanou3g.study.Doctor;
import com.lanou3g.study.Teacher;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * interface：接口
		 * class：类
		 * 
		 * 这俩东西在java中是一个级别的
		 * 属于一种并列的关系
		 * 
		 * java中的接口，表示一个规范或者规则
		 * 	抽象类不能直接创建对象，但是可以使用
		 * 	抽象类的引用。
		 * 		比如刚才讲的Person就是一个抽象类
		 * 		Person p;就是一个引用
		 * 
		 * 	接口也是类似的，也不能直接创建对象。
		 * 	但是可以使用接口的引用
		 */
		
		//这里对象的名字就是wd，
		//这个对象是有名的，
		//如果一个对象没有名字，
		//那么它叫匿名对象
//		WatchDog wd = new WatchDog();
		
		
		Company facebook = new Company();
		//这里的work我要传进去一个什么呢？
		facebook.setWork(new Doctor());
		facebook.setWork(new WatchDog());
		
		facebook.startWork();
		facebook.endWork();
		
		
		
		
	}

}
