package com.lanou.domain;

/**
 * Created by zyf on 2018/2/7.
 */
public class Classes {
	private int id;
	private String name;
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Classes(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public Classes() {
	}

	public Classes(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Classes{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}
