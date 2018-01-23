package com.lanou.staticproxy;

/**
 * Created by zyf on 2018/1/23.
 */
public class UserDaoProxy implements UserDao {
	private Transaction transaction;

	//要代理的对象
	//代理对象是经纪人，要代理的对象是明星
	//宋喆				宝强
	private UserDao userDao;

	public UserDaoProxy(Transaction transaction, UserDao userDao) {
		this.transaction = transaction;
		this.userDao = userDao;
	}

	@Override
	public void add() {
		transaction.begin();
		userDao.add();
		transaction.commit();
	}

	@Override
	public void delete() {
		transaction.begin();
		userDao.delete();
		transaction.commit();
	}
}
