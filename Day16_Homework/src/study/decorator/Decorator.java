package study.decorator;

import study.component.饮品;

/**
 * Created by zyf on 2017/12/13.
 */
public abstract class Decorator extends 饮品 {
	饮品 yp;

	public Decorator(饮品 yp) {
		this.yp = yp;

	}
}
