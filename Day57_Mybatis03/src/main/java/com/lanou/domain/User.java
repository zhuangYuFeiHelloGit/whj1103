package com.lanou.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zyf on 2018/2/8.
 */
public class User implements Serializable{
	private int id;
	private String username;
	private List<Orders> ordersList;

	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", ordersList=" + ordersList +
				'}';
	}
}
