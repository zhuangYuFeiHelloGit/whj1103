package com.lanou.factory;

import com.lanou.createobj.User;

/**
 * Created by zyf on 2018/1/22.
 */
public class StaticFactory {


	//静态工厂
	public static User getInstance(){
		return new User();
	}




}
