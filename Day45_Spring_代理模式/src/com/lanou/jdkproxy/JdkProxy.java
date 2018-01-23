package com.lanou.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zyf on 2018/1/23.
 */
public class JdkProxy implements InvocationHandler {

	//目标对象：就是被代理的对象
	//这个对象的类型是可变的，
	// 所以使用Object类型接收
	private Object target;

	//要增添的功能
	private JdkTransaction jdkTransaction;

	//通过构造方法，传入目标对象，与功能对象
	public JdkProxy(Object target, JdkTransaction jdkTransaction) {
		this.target = target;
		this.jdkTransaction = jdkTransaction;
	}

	/**
	 * 当用户调用，生成的代理对象的任意一个方法时
	 * 都会来执行这个invoke方法
	 * @param proxy  代理对象
	 * @param method 要调用的方法对象
	 * @param args   调用方法时需要传入的参数
	 * @return		 调用方法时，得到的返回值
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		jdkTransaction.begin();

		//通过反射的形式，调用目标对象的对应方法
		//将参数传入
		method.invoke(target,args);

		jdkTransaction.commit();


		return null;
	}
}
