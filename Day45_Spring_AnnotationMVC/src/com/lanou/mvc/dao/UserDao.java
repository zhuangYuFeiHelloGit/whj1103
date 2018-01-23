package com.lanou.mvc.dao;

import com.lanou.mvc.bean.User;

/**
 * Created by zyf on 2018/1/23.
 */
public interface UserDao {
	User queryByUsername(String name);
}
