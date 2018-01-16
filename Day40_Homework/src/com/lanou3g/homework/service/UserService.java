package com.lanou3g.homework.service;

import com.lanou3g.homework.bean.User;
import com.lanou3g.homework.dao.UserDao;

/**
 * Created by zyf on 2018/1/16.
 */
public class UserService {
	private UserDao dao;

	public void register(String username,String password){
		User u = new User();

		dao.insertUser(u);
	}

	public void login(String username,String password){
		User user = dao.queryByUsername(username);
		if(user == null){
//			抛出个异常，程序跳转到Action
		}
		if(user.getPassword().equals(password)){
//			登录成功
		}
	}
}
