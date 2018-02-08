package com.lanou.dao;

import com.lanou.domain.Orders;
import com.lanou.domain.OrdersExt;

import java.util.List;

/**
 * Created by zyf on 2018/2/7.
 */
public interface OrdersMapper {
	List<Orders> findOrdersUser();

	List<Orders> findOrdersAll();
}
