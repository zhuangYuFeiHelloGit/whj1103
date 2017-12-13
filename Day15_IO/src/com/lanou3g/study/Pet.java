package com.lanou3g.study;

import java.io.Serializable;

/**
 * Created by zyf on 2017/12/12.
 */
public class Pet implements Serializable{
	private String name;
	private String gender;

	public Pet(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Pet{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}
