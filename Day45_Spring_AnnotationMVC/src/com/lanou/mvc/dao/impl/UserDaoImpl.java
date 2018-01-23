package com.lanou.mvc.dao.impl;

import com.lanou.mvc.bean.User;
import com.lanou.mvc.bean.UserInter;
import com.lanou.mvc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by zyf on 2018/1/23.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private User user;

	private UserInter ui;


	@Override
	public User queryByUsername(String name) {
		return user;
	}

	public UserInter queryUIByUsername(String name) {
		ui.getName();
		return ui;
	}
}
