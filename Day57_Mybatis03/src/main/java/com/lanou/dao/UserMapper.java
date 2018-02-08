package com.lanou.dao;

import com.lanou.domain.User;

import java.util.List;

/**
 * Created by zyf on 2018/2/8.
 */
public interface UserMapper {
	List<User> findUser();
	void insertUser(User user);
}
