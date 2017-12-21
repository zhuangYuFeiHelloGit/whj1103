package com.lanou3g.study;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zyf on 2017/12/20.
 */
public class Main4 {
	public static void main(String[] args) {
		//调用JdbcUtil类时，该类会加载进内存
		//也就会执行静态代码块，获得配置文件中的数据

		//执行静态方法execute
		//传入的是ExecuteInter接口的一个匿名实现类对象
		//这里和我们学习线程时很类似

		//传进去的对象，我们先叫它e
		//在execute方法中（可以点进去看）
		//第一步：根据配置文件中的数据建立连接
		//第二步：调用e的execute方法，将连接传入
				//这里就会回来执行这个匿名实现类的execute方法
				//在这个方法中我们获得state，执行sql语句
				//并且，将state作为返回值返回
		//第三步：将e.execute()得到的返回值关闭
		//第四步：关闭连接


		//这种写法叫：接口回调
		JdbcUtil.execute(new ExecuteInter() {
			@Override
			public Statement execute(Connection conn) throws SQLException{

					Statement state =
							conn.createStatement();
					String sql =
							"select * from hw_user";
					ResultSet rs =
							state.executeQuery(sql);
					//接下来就是遍历rs
					JdbcUtil.showRS(rs);
					return state;

			}
		});
	}
}
