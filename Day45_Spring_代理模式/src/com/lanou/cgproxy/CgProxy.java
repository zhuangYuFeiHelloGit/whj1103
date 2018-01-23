package com.lanou.cgproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zyf on 2018/1/23.
 */
public class CgProxy implements MethodInterceptor {
	private Object target;
	private CgTransaction cgTransaction;

	public CgProxy(Object target, CgTransaction cgTransaction) {
		this.target = target;
		this.cgTransaction = cgTransaction;
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		cgTransaction.begin();

		method.invoke(target,objects);

		cgTransaction.commit();
		return null;
	}



}
