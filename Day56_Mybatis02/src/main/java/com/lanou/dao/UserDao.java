package com.lanou.dao;

import com.lanou.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by zyf on 2018/2/7.
 */
public interface UserDao {
	User findById(int id) throws IOException;
	List<User> findAll();
	void insertUser(User user);
}
