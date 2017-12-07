package com.lanou3g.homework.exception;

/**
 * Created by zyf on 2017/12/7.
 */
public class PasswordNotMatchedException extends LoginException {
	@Override
	public String getMessage() {
		return "密码与用户名不匹配";
	}
}
