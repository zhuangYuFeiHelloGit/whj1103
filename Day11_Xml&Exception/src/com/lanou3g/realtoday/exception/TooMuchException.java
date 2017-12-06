package com.lanou3g.realtoday.exception;

/**
 * Created by zyf on 2017/12/6.
 */
public class TooMuchException extends EatException{

	@Override
	public String getMessage() {
		return "不知不觉，撑死了";
	}
}
