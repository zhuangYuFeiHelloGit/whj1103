package com.lanou3g.study;

import java.sql.*;

/**
 * Created by zyf on 2017/12/20.
 */
public class Main5 {
	/**
	 * 1，PrepareStatement可以使用动态参数
	 * 		Statement只能执行静态的sql语句
	 *
	 * 2，防止sql注入
	 * 		什么是sql注入？
	 */



	public static void main(String[] args) {
		JdbcUtil.execute(conn -> {

			try {
				PreparedStatement pstate = conn.prepareStatement(
						"select * from hw_user " +
								"WHERE loc=? " +
								"AND age>?;");
				pstate.setString(1,"北京");
				pstate.setInt(2,20);


				ResultSet rs = pstate.executeQuery();

				JdbcUtil.showRS(rs);

				return pstate;
			} catch (SQLException e) {
				e.printStackTrace();
			}


			return null;
		});


	}




}
