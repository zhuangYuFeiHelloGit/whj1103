package com.lanou.domain;

/**
 * Created by zyf on 2018/2/7.
 */
public class OrdersExt extends Orders{
	private String username;
	private String address;

	public OrdersExt() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
