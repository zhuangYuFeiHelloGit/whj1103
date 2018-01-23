package com.lanou.aop;

/**
 * Created by zyf on 2018/1/23.
 */
public class UserDaoImpl implements UserDao {
	@Override
	public void add() {
		System.out.println("-----add-----");
	}

	@Override
	public void delete() {
		System.out.println("-----delete-----");
	}
}
