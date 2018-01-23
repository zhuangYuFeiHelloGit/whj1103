package com.lanou.factory;

import com.lanou.createobj.User;

/**
 * Created by zyf on 2018/1/22.
 */
public class UserFactory extends AbstractFactory {
	@Override
	public User getInstance() {
		return new User(
				"实例工厂创建的User",11,true
		);
	}
}
