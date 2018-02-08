package com.lanou.domain;

/**
 * Created by zyf on 2018/2/7.
 */
public class OrderDetail {
	private int id;
	private int orders_id;
	private int items_id;

	public OrderDetail() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrders_id() {
		return orders_id;
	}

	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}

	public int getItems_id() {
		return items_id;
	}

	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}

	@Override
	public String toString() {
		return "OrderDetail{" +
				"id=" + id +
				", orders_id=" + orders_id +
				", items_id=" + items_id +
				'}';
	}
}
