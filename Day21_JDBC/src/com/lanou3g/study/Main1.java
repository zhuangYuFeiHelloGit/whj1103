package com.lanou3g.study;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * Created by zyf on 2017/12/20.
 */
public class Main1 {
	/*
		JDBC，全称：
			Java Database Connection
			java对数据库的连接规范

			mysql-connector-java-5.1.18-bin.jar
			这个jar包，我们叫它驱动

			JDBC是规范，那么不同的数据库厂商可以对该规范
			有不同的实现。

			所以使用不同的数据库的时候，
			只需要更换不同的jar包（也就是驱动）即可
	 */

	public static void main(String[] args) throws SQLException {

		//1，注册驱动
		DriverManager.registerDriver(new Driver());

		//2，获得连接
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/querymany"
				, "root"
				, "123"

		);

		System.out.println(
				connection.getClass().getName()
		);

		//3，找个对象给我们干活
		//statement
		//这个接口，用来声明要执行的sql语句

		String sql =
				"select * from hw_user";

		Statement statement =
			connection.createStatement();

		//4，让这个对象去执行sql语句
		//执行查询语句时，得到的返回值类型为ResultSet
		//也就是我们常说的结果集
		ResultSet resultSet =
				statement.executeQuery(sql);


		//5，从ResultSet中取出数据


		while (resultSet.next()){
			System.out.print(resultSet.getInt("uid")+"\t");
			System.out.print(resultSet.getString("uname")+"\t");
			System.out.print(resultSet.getString(3)+"\t");
			System.out.print(resultSet.getString(4)+"\t");
			System.out.println();

		}
		//6，关闭资源
		resultSet.close();
		statement.close();
		connection.close();


	}

}
