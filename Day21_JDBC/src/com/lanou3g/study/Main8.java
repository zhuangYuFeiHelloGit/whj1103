package com.lanou3g.study;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2017/12/20.
 */
public class Main8 {
	public static void main(String[] args) throws SQLException {

		//dbUtil是apache公司给我们提供的一个工具类

		//强行翻译，询问执行者
		QueryRunner qr =
				new QueryRunner();

		String sql = "select * from hw_user";


		Connection conn = JdbcUtil.getConnection();
		List<User> query = qr.query(
				conn,
				sql,
				new ResultSetHandler<List<User>>() {
					@Override
					public List<User> handle(ResultSet resultSet) throws SQLException {
						//TODO 把resultset中的数据
						//封装到一个对象中

						List<User> users =
								new ArrayList<>();
						while (resultSet.next()){
							User user = new User();

							user.setId(resultSet.getInt(1));
							user.setUname(resultSet.getString(2));
							user.setAge(resultSet.getInt(3));
							user.setLoc(resultSet.getString(4));

							users.add(user);
						}

						return users;
					}
				});

		conn.close();


		//对已知的某个类进行扩展

		System.out.println(query);


	}
}
