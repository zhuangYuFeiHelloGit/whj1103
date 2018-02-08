package com.lanou3g.aop;

import org.springframework.stereotype.Repository;

/**
 * Created by zyf on 2018/1/24.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Override
	public void add() {
//		int a = 10/0;
		System.out.println("----add----");
	}

	@Override
	public String get(){
		return "托儿索-儿童劫-红领烬-提款姬-小学僧-喜之螂-洞庭狐-橡皮妮";
	}
}
