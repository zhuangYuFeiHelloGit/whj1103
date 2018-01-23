package com.lanou.annotation;

/**
 * Created by zyf on 2018/1/23.
 */
public class People {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println(this.getClass().getName());
		return "People{" +
				"name='" + this.name + '\'' +
				'}';
	}
}
