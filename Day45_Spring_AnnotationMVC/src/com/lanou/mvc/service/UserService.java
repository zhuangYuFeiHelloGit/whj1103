package com.lanou.mvc.service;

import com.lanou.mvc.bean.User;
import com.lanou.mvc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by zyf on 2018/1/23.
 */
@Service
public class UserService {

	@Qualifier("userDao")
	@Autowired
	private UserDao userDao;

	public User login(){
		User user =
				userDao.queryByUsername("");
		return user;
	}



}
