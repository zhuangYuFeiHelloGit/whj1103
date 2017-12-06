package com.lanou3g.yesterday.two;

import com.lanou3g.yesterday.one.DatabaseUtil;

/**
 * Created by zyf on 2017/12/6.
 */
public class OperateDBImpl<T> implements OperateDB<T> {
	@Override
	public T operate(T t) {
		DatabaseUtil<T> dbu = new DatabaseUtil<T>();
		dbu.save(t);

		return null;
	}
}
