package com.lanou.staticproxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/23.
 */
public class StaticProxyTest {

	@Test
	public void staticProxy() throws Exception {
		UserDao userDao = new UserDaoImpl();
		Transaction transaction =
				new Transaction();

		UserDaoProxy daoProxy =
				new UserDaoProxy(transaction,userDao);
		daoProxy.add();
		daoProxy.delete();

	}
}