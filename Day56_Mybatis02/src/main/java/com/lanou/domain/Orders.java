package com.lanou.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by zyf on 2018/2/7.
 */
public class Orders {
	/**
	 * Orders.id,
	 Orders.user_id,
	 Orders.number,
	 Orders.createtime,
	 Orders.note,
	 User.username,
	 User.address
	 */

	private int id;
	private int user_id;
	private String number;

	private User user;

	private List<OrderDetail> orderDetails;

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Orders() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Orders{" +
				"id=" + id +
				", user_id=" + user_id +
				", number='" + number + '\'' +
				", user=" + user +
				", orderDetails=" + orderDetails +
				'}';
	}
}
