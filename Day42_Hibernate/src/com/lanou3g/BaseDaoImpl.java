package com.lanou3g;

/**
 * Created by zyf on 2018/1/18.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Override
	public T add(T t) {
		return HibernateUtil.handle(session -> {
			session.save(t);
			return t;
		});
	}

	@Override
	public T delete(T t) {
		return HibernateUtil.handle(session -> {
			session.delete(t);
			return t;
		});
	}

	@Override
	public T update(T t) {
		return HibernateUtil.handle(session -> {
			session.update(t);
			return t;
		});
	}

	@Override
	public T get(Class<T> tClass, long id) {
		return HibernateUtil.handle(
				session -> session.get(tClass,id));
	}
}
