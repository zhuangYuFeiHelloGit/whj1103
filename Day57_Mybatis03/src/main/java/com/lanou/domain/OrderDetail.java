package com.lanou.domain;

/**
 * Created by zyf on 2018/2/8.
 */
public class OrderDetail {
	private Items items;
	private int id;

	public OrderDetail() {
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "OrderDetail{" +
				"items=" + items +
				", id=" + id +
				'}';
	}
}
