package com.lanou3g.homework.exception;

/**
 * Created by zyf on 2017/12/7.
 */
public class UsernamePasswordNotMatchedException extends LoginException {
	@Override
	public String getMessage() {
		return "用户名与密码不匹配";
	}
}
