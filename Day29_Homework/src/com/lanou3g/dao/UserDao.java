package com.lanou3g.dao;

import com.lanou3g.bean.User;
import com.lanou3g.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by zyf on 2018/1/3.
 */
public class UserDao {

	private QueryRunner qr = new QueryRunner();

	public User queryByUsername(String username) {
		String sql =
				"select * from user where username=?";

		Connection conn = JdbcUtil.getConnection();
		User user = new User();
		try {
			user = qr.query(conn, sql, new BeanHandler<User>(User.class), username);
			System.out.println("-------"+user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	public void insert(User user) {
		String sql =
				"insert into user values(null,?,?)";
		Connection conn = JdbcUtil.getConnection();
		try {
			qr.update(conn,sql,user.getUsername(),user.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
