package web.exception;

/**
 * Created by zyf on 2017/12/13.
 */
public class NotParamException extends Exception {

	@Override
	public String getMessage() {
		return "请填写username参数";
	}
}
