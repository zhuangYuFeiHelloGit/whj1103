package com.lanou3g.yesterday;

import com.lanou3g.yesterday.one.DatabaseUtil;
import com.lanou3g.yesterday.one.Student;
import com.lanou3g.yesterday.one.Teacher;

/**
 * Created by zyf on 2017/12/6.
 */
public class Main {
	public static void main(String[] args) {

		DatabaseUtil<Student> dbu
				= new DatabaseUtil<>();


		dbu.save(new Student());

		DatabaseUtil<Teacher> dbu2
				= new DatabaseUtil<>();

		dbu2.save(new Teacher());

	}

	//两个在方法中使用的例子
	public static <T> void test(T t){

	}

	public static <E> E test2(){
		return null;
	}
}
