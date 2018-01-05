package service.exception;

/**
 * Created by zyf on 2018/1/5.
 */
public class InvalidUsernameException extends LoginException {
	@Override
	public String getMessage() {
		return "用户名错误";
	}
}
