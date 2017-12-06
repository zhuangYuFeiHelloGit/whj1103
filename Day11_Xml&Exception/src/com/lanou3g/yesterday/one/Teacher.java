package com.lanou3g.yesterday.one;

/**
 * Created by zyf on 2017/12/6.
 */
public class Teacher {

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//教师编号
	private int tid;

	private String name;
	private String gender;
	private int age;


	public Teacher() {
	}


}
