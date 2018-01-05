package util;

/**
 * Created by zyf on 2018/1/4.
 */
public class ELUtil {
	/**
	 * 1，必须是静态方法
	 * 2，方法必须有返回值
	 * @param input
	 * @return
	 */
	public static String reverse(String input){
		if(input.length() == 1 ){
			return input;
		}
		String behind = input.substring(0,input.length() - 1);
		String last = input.charAt(input.length() - 1) + "";

		return last+reverse(behind);
	}

}
