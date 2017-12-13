package study.decorator;

import study.component.饮品;

/**
 * Created by zyf on 2017/12/13.
 */
public class 兑水Decorator extends Decorator {
	public 兑水Decorator(饮品 yp) {
		super(yp);
	}


	int[] a = {1,2,3,4,5,6};
	@Override
	public int price() {
		return yp.price() - 5;
	}

	@Override
	public String getName() {
		return "兑水的"+yp.getName();
	}
}
