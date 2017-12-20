package com.lanou3g.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zyf on 2017/12/20.
 */
public class Main2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//将Driver类加载进内存
		//也就会执行该类的静态代码块
		//也就实现了注册驱动
		Class.forName("com.mysql.jdbc.Driver");


		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/querymany" +
						"?user=root&password=123"
		);


		Statement state =
				conn.createStatement();

		int i =
		state.executeUpdate(
				"INSERT INTO hw_user " +
					"VALUES (NULL ,'张一山',40,'北京')"
		);

		//受影响的行数
		System.out.println(i);

		state.close();
		conn.close();

	}
}
