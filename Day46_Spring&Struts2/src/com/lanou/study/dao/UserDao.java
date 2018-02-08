package com.lanou.study.dao;

import com.lanou.study.domain.User;

/**
 * Created by zyf on 2018/1/24.
 */
public class UserDao {

	private User user;

	public void addUser(){
		System.out.println("DAO：----添加了一个User----"+user.getName());
	}

	public void setUser(User user) {
		this.user = user;
	}
}
