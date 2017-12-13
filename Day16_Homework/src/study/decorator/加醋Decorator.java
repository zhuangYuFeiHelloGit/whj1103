package study.decorator;

import study.component.饮品;

/**
 * Created by zyf on 2017/12/13.
 */
public class 加醋Decorator extends Decorator{
	public 加醋Decorator(饮品 yp) {
		super(yp);
	}

	@Override
	public int price() {
		return yp.price()+2;
	}

	@Override
	public String getName() {
		return "加醋的"+yp.getName();
	}
}
