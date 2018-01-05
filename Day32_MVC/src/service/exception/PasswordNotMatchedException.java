package service.exception;

/**
 * Created by zyf on 2018/1/5.
 */
public class PasswordNotMatchedException extends LoginException {
	@Override
	public String getMessage() {
		return "密码错误";
	}
}
