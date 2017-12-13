package dao;

import dao.util.JdbcUtil;
import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by zyf on 2017/12/13.
 */
public class UserDao {
	public void insert(String username,int score){
		QueryRunner qr = new QueryRunner();
		String insert = "insert into userscore values(?,?)";
		try {
			User user = qr.query(JdbcUtil.getConnection(), insert, new BeanHandler<>(User.class), username, score);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
