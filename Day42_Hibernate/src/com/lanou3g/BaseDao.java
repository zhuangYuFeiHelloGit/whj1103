package com.lanou3g;

/**
 * Created by zyf on 2018/1/18.
 */
public interface BaseDao<T> {


	T add(T t);
	T delete(T t);
	T update(T t);
	T get(Class<T> tClass,long id);



}
