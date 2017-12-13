package study.component;

/**
 * Created by zyf on 2017/12/13.
 */
public class 啤酒Component extends 饮品 {

	public 啤酒Component() {
		name = "啤酒";
	}

	@Override
	public int price() {
		return 1000;
	}
}
