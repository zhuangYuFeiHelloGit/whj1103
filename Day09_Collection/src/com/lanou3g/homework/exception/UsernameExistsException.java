package com.lanou3g.homework.exception;

/**
 * Created by zyf on 2017/12/7.
 */
public class UsernameExistsException extends RegisterException {
	@Override
	public String getMessage() {
		return "用户名已存在";
	}
}
