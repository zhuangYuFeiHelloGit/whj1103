package com.lanou3g.bean.manytomany;

import com.lanou3g.util.HibernateUtil;
import org.junit.Test;

/**
 * Created by zyf on 2018/1/19.
 */
public class UserTest {

	@Test
	public void save(){
		HibernateUtil.handle(session -> {
			User user = new User();
			user.setUname("张三");
			Role role = new Role();
			role.setRname("管理员");

			role.getUsers().add(user);
			user.getRoles().add(role);

			session.save(user);

			return null;
		});
	}

}