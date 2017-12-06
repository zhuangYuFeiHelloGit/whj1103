package com.lanou3g.realtoday.exception;

/**
 * Created by zyf on 2017/12/6.
 */
public class NotEnoughException extends EatException {
	/**
	 * 现在我们就是，自定义异常
	 * 自己定义了一个异常类，继承Exception
	 */

	@Override
	public String getMessage() {
		return "我是真的没吃饱，我还要";
	}


}
