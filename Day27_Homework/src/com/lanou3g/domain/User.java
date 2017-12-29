package com.lanou3g.domain;

/**
 * Created by zyf on 2017/12/29.
 */
public class User {
	private String username;
	private String gender;

	@Override
	public String toString() {
		return "UserDao{" +
				"username='" + username + '\'' +
				", gender='" + gender + '\'' +
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

	public User(String username, String gender) {
	
		this.username = username;
		this.gender = gender;
	}

	public User() {
	
	}
}
