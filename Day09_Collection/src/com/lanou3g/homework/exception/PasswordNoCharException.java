package com.lanou3g.homework.exception;

/**
 * Created by zyf on 2017/12/7.
 */
public class PasswordNoCharException extends RegisterException {
	@Override
	public String getMessage() {
		return "密码没有字母";
	}
}
