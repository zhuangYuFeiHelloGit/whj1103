package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/28.
 */
public class User {
	private String username;
	private String gender;
	private String age;

	public User() {
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", gender='" + gender + '\'' +
				", age='" + age + '\'' +
				'}';
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
