package service;

import dao.UserDao;
import domain.User;
import service.exception.InvalidUsernameException;
import service.exception.LoginException;
import service.exception.PasswordNotMatchedException;

/**
 * Created by zyf on 2018/1/5.
 */
public class UserService {

	private UserDao userDao = new UserDao();

	public User login(User user) throws LoginException {

		User fromDb =
			userDao.queryByUsername(user.getUsername());

		if(fromDb == null){
			throw new InvalidUsernameException();
		}

		//如果查出的用户名与输入的用户名不相同
		if(!fromDb.getPassword().equals(
				user.getPassword()
		)){
			//抛出密码不匹配异常
			throw new PasswordNotMatchedException();
		}

		return fromDb;

	}


}
