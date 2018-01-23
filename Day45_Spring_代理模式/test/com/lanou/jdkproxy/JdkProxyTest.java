package com.lanou.jdkproxy;

import com.lanou.staticproxy.UserDao;
import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/23.
 */
public class JdkProxyTest {

	@Test
	public void jdkTest() throws Exception {
		JdkUserDao jdkUserDao =
				new JdkUserDaoImpl();
		JdkTransaction jdkTransaction =
				new JdkTransaction();

		JdkProxy jdkProxy =
				new JdkProxy(
						jdkUserDao
						,jdkTransaction
				);

		Object o = Proxy.newProxyInstance(
				jdkUserDao.getClass().getClassLoader()
				, jdkUserDao.getClass().getInterfaces()
				, jdkProxy
		);
		JdkUserDao proxyDao = (JdkUserDao) o;

		proxyDao.delete();
//		System.out.println("代理对象的类型："+o.getClass().getName());
//
//		System.out.println("代理对象的父类的的类型："+o.getClass().getSuperclass().getName());
//		Class<?>[] interfaces
//				= o.getClass().getInterfaces();
//		for (int i = 0; i < interfaces.length; i++) {
//			System.out.println("代理对象实现的接口："+interfaces[i].getName());
//		}



	}


}