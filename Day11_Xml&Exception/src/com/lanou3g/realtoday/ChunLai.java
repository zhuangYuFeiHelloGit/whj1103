package com.lanou3g.realtoday;

import com.lanou3g.realtoday.exception.EatException;
import com.lanou3g.realtoday.exception.NotEnoughException;
import com.lanou3g.realtoday.exception.TooMuchException;

/**
 * Created by zyf on 2017/12/6.
 */
public class ChunLai {

	/*
		throw	在方法的内部，抛出一个异常对象时使用
		throws	在方法的声明上，声明这个方法会抛出的异常类型

					这里声明的是会抛出EatException
					因为NotEnoughException和TooMuchException
					都是EatException的子类
	 */


	public void eat(int weight) throws EatException {
		if(weight < 200){
			//表示春来还没吃饱
			//我们就抛出一个异常，告诉调用eat方法的地方
			//说你上的有点少，再来点
			throw new NotEnoughException();
		}

		if(weight>300){
			//表示吃的有点多了
			throw new TooMuchException();
		}
	}








}
