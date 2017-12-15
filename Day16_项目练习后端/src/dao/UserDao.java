package dao;

import dao.util.JdbcUtil;
import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2017/12/13.
 */
public class UserDao {

	private Connection connection;

	public void insert(String username, int score){
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			connection = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/day16","root","123"
//			);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}


		QueryRunner qr = new QueryRunner();
		String insert = "insert into userscore values(?,?,?)";
		try {
			Connection conn = JdbcUtil.getConnection();
			qr.update(conn, insert, username, score,System.currentTimeMillis());
			JdbcUtil.close(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public User first(){
		QueryRunner qr = new QueryRunner();
		String first = "select * from  userscore order by score ASC , time ASC limit 0,1";
		try {
			Connection conn = JdbcUtil.getConnection();

			User user = qr.query(conn, first, new BeanHandler<>(User.class));
			JdbcUtil.close(conn);
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<User> ten(){
		QueryRunner qr = new QueryRunner();
		String first = "select * from  userscore order by score ASC , time ASC limit 0,10";
		try {
			Connection conn = JdbcUtil.getConnection();

			List<User> user = qr.query(conn, first, new BeanListHandler<User>(User.class));
			JdbcUtil.close(conn);
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
