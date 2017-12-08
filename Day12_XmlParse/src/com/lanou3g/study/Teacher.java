package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/8.
 */
public class Teacher {
	private String name;
	private String hobby;

	private Student student;


	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", hobby='" + hobby + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Teacher() {

	}
}
