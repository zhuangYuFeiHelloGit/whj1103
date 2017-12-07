package com.lanou3g.homework.exception;

/**
 * Created by zyf on 2017/12/7.
 */
public class PasswordNoNumberException extends RegisterException {
	@Override
	public String getMessage() {
		return "密码中没有数字，过于简单";
	}
}
