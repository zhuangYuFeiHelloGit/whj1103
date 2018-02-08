package com.lanou.domain;

/**
 * Created by zyf on 2018/2/8.
 */
public class Items {
	private int id;
	private String name;

	public Items() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Items{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
