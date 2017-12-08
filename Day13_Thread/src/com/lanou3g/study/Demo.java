package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/8.
 */
public class Demo {

	public void show(
			String name,
			String gender,
			int age){
		System.out.println(name+gender+age);
	}


	public void show(String gender,int age){
		show(null,gender,age);
	}

	public void show(int age){
		show(null,age);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.show(10);
	}



}
