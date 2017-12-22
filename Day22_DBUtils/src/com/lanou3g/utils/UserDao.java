package com.lanou3g.utils;

import com.lanou3g.study.User;
import com.lanou3g.study.WhQueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by zyf on 2017/12/22.
 * 这个类就是用来操作User表的
 */
public class UserDao {
	/*
		因为每个方法都对应着自己要做的事情，
		与其他方法无关。
		所以当有新需求需要加入的时候，
		只需要对UserDao扩展（填入新的方法）
		而不需要修改UserDao原有的代码

		六大原则之一：
			开闭原则
			对修改关闭，对扩展开放。

			因为原有的代码，很可能在多处被使用，
			如果你去修改了，很容易对原有的代码造成影响。
			而扩展却不会。
	 */

	private WhQueryRunner whqr =
			new WhQueryRunner();

	public int insert(User user){
		int update = 0;
		try {
			update = whqr.update(
					JdbcUtil.getConnection()
					, "insert into hw_user values(null,?,?,?)"
					, user.getUname()
					, user.getAge()
					, user.getLoc());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return update;
	}

	public User queryById(int uid){
		try {
			User query = whqr.query(
					JdbcUtil.getConnection()
					, "select * from hw_user where uid=?"
					, new BeanHandler<User>(User.class)
					, uid);
			return query;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	public List<User> queryAll(){
		try {
			List<User> query = whqr.query(
					JdbcUtil.getConnection(),
					"select * from hw_user",
					new BeanListHandler<User>(User.class)
			);
			return query;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}
