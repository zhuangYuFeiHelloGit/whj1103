package com.lanou3g.homework.exception;

/**
 * Created by zyf on 2017/12/7.
 */
public class UsernameNotExistsException extends LoginException {
	@Override
	public String getMessage() {
		return "用户名不存在";
	}
}
