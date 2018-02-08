package com.lanou.study.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/24.
 */
public class UserDaoImplTest {

	@Test
	public void hibernate() throws Exception {
		ApplicationContext context =
				new ClassPathXmlApplicationContext(
						"spring-config.xml"
				);

		UserDao userDao = (UserDao)
				context.getBean("userDao");
		userDao.add();
	}
}