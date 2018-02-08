package com.lanou.study.service;

import com.lanou.study.dao.UserDao;

/**
 * Created by zyf on 2018/1/24.
 */
public class UserService {
	private UserDao userDao;

	public void register(){
		System.out.println("----service----");
		userDao.addUser();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
