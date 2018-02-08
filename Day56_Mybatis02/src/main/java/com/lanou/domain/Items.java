package com.lanou.domain;

/**
 * Created by zyf on 2018/2/7.
 */
public class Items {
	private int id;
	private String name;

	public Items() {
	}

	@Override
	public String toString() {
		return "Items{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
