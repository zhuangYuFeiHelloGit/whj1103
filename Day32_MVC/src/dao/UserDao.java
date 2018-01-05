package dao;

import domain.User;

/**
 * Created by zyf on 2018/1/5.
 */
public class UserDao {
	public User queryByUsername(
			String username){

		if(username.equals("123")){

			//假装我们去数据库中拿了数据
			User user = new User();
			user.setUsername("123");
			user.setPassword("666");
			return user;
		}else {
			return null;
		}



	}
}
