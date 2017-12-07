package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/7.
 */
public class Main4 {

	public static void main(String[] args) {

		System.out.println(反转("abcde"));


	}


	public static String 反转(String target){
		int length = target.length();
		char c = target.charAt(length - 1);
		if(length == 1){
			return c+"";
		}
		String last =
				target.substring(0,length - 1);
		return c+反转(last);

	}
}
