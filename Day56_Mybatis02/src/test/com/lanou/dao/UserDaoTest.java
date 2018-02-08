package com.lanou.dao;

import com.lanou.dao.impl.UserDaoImpl;
import com.lanou.domain.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/2/7.
 */
public class UserDaoTest {

	@Test
	public void findById() throws Exception {
		UserDao userDao = new UserDaoImpl();
		User byId =
				userDao.findById(3);
		System.out.println(byId);

	}
}