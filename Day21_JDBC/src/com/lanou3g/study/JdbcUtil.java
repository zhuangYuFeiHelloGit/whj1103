package com.lanou3g.study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by zyf on 2017/12/20.
 */
public class JdbcUtil {

	static {
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("src/jdbc.properties"));
			String driverName =
					prop.getProperty("driverName");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			database = prop.getProperty("database");
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println(
					e.getMessage()
					+"\n\t\t"
					+"请将配置文件jdbc.properties放置到src目录下");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String url;
	private static String user;
	private static String password;
	private static String database;


	public static Connection getConnection(){
		try {
			Connection conn = DriverManager.getConnection(
					url+database,
					user,
					password
			);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
