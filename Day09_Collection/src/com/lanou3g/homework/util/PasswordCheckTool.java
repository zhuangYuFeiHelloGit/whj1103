package com.lanou3g.homework.util;

import com.lanou3g.homework.exception.PasswordNoCharException;
import com.lanou3g.homework.exception.PasswordNoNumberException;
import com.lanou3g.homework.exception.RegisterException;

/**
 * Created by zyf on 2017/12/7.
 */
public class PasswordCheckTool {

	public static boolean isNotEasy(String password)throws RegisterException {
		int isEasy = 0;
		//如果isEasy最后等于2，那么说明这个字符串中
		//既包含数字也包含字母

		for (int i = 0; i <= 9; i++) {
			String a = i + "";//"0"  "1"  "2" "3"
			//0		1	2	3
			if (password.contains(a)) {
				if (isEasy == 0) {
					isEasy++;
				}
			}
		}

		if (isEasy == 0) {

			throw new PasswordNoNumberException();

		}

		for (char i = 'a'; i <= 'z'; i++) {


			if (password.contains(Character.toString(i))) {
				if (isEasy == 1) {
					isEasy++;
				}
			}

		}
		if(isEasy != 2){
			throw new PasswordNoCharException();
		}
		return true;

	}

}
