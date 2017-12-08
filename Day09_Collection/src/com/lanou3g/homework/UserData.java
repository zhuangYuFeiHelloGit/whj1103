package com.lanou3g.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2017/12/5.
 */
public class UserData {

	public static List<Person> users
			= new ArrayList<>();


	//String：key的类型：我们用来装用户名
	//Person：value的类型：我们用来装一个用户对象
	public static Map<String,Person> userMap
			= new HashMap<>();

	public static Person getPerson(String username){

		return new Person();
	}

	public static void insertPerson(Person person){
		//要插入到xml文件中


	}


}
