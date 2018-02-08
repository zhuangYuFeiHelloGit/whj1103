package com.lanou.domain;

import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2018/2/5.
 */
public class User {
	private int id;
	private String username;
	private String password;

	private List<String> list;
	private Map<String,UserWrap> map;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, UserWrap> getMap() {
		return map;
	}

	public void setMap(Map<String, UserWrap> map) {
		this.map = map;
	}

	public User() {
	}

	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", list=" + list +
				", map=" + map +
				'}';
	}
}
