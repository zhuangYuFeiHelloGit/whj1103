package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/4.
 */
public class Student {

	private String name = "张三疯";

	public Student(String name,String username,String password,String job){

	}

	@Override
	public String toString() {
		//修改从父类继承来的方法
		//这就是复写，重写，覆盖

		return name;
	}

	public static void main(String[] args) {

	}

}
