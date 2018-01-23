package com.lanou.cgproxy;

import com.lanou.jdkproxy.Inter1;
import com.lanou.jdkproxy.Inter2;

/**
 * Created by zyf on 2018/1/23.
 */
public class CgUserDaoImpl implements CgUserDao,Inter1,Inter2 {

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
