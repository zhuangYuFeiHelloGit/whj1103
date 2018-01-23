package com.lanou.jdkproxy;

/**
 * Created by zyf on 2018/1/23.
 */
public class JdkUserDaoImpl implements JdkUserDao,Inter1,Inter2 {

	@Override
	public void add() {
		System.out.println("------add------");
	}

	@Override
	public void delete() {
		System.out.println("------delete------");
	}


	class Student{

	}
}
