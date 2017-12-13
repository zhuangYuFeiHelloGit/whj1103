package dao.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by zyf on 2017/10/26.
 */
public class JdbcUtil {

	private static String url;
	private static String driverClass;
	private static String user;
	private static String password;

	static {
		try {

			//见名知意：类加载器
			//可以用它加载一些配置文件
			ClassLoader cl =
					JdbcUtil.class.getClassLoader();

			InputStream inputStream =
					cl.getResourceAsStream("dao/jdbc.properties");

			Properties info = new Properties();
			//将流中的内容，加载进info这个对象中
			//流指向了jdbc.properties这个配置文件
			//也就是说流中的内容就是文件中的内容
			info.load(inputStream);

			driverClass = info.getProperty("driverClass");
			user = info.getProperty("user");
			url = info.getProperty("url");
			password = info.getProperty("password");

			Class.forName(driverClass);


		} catch (ClassNotFoundException e) {
			throw new RuntimeException("你Driver类的路径写错了兄弟");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static Connection getConnection(){
		Connection conn = null;
		try {
				conn = 	DriverManager.getConnection(
							url,
							user,
							password
					);
		} catch (SQLException e) {
			e.printStackTrace();
//			throw new RuntimeException("错了错了");
//			System.err.println(e.getMessage());
		}
		return conn;
	}

	public static void close(ResultSet rs){
		close(rs,null,null);
	}

	public static void close(Statement stt){
		close(null,stt,null);
	}

	public static void close(Connection conn){
		close(null,null,conn);
	}


	public static void close(ResultSet rs, Statement stt, Connection conn){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(stt != null){
			try {
				stt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


}
