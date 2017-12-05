package com.lanou3g.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by zyf on 2017/12/5.
 */
public class Main {

	private static final int REGISTER_CODE = 1;
	private static final int LOGIN_CODE = 2;

	private static final int WORKER = 1;
	private static final int DOCTOR = 2;
	private static final int COOKER = 3;
	private static final int BOSS = 4;




	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1，注册	2，登录");
			int choice = input.nextInt();
			input.nextLine();
			switch (choice) {
				case REGISTER_CODE:

					System.out.println("请输入姓名：");
					String name = input.nextLine();
					System.out.println("请输入用户名：");
					String username = input.nextLine();
					System.out.println("请输入密码：");
					String password = input.nextLine();
					System.out.println("请选择职业：");
					System.out.println("1，工人	2，医生	3，厨师	4，老板");
					int job = input.nextInt();

					Person person = null;
					switch (job){
						case WORKER:
							person = new Worker(name,username,password,"Worker");
							break;
						case DOCTOR:
							break;
						case COOKER:
							break;
						case BOSS:
							break;
					}

					UserOperate.register(person);
					System.out.println("注册成功");

					System.out.println(Arrays.toString(UserData.users.toArray()));
					break;
				case LOGIN_CODE:
					break;

			}
		}


	}
}
