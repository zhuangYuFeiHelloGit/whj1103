package com.lanou.dao;

import com.lanou.domain.Orders;
import com.lanou.domain.OrdersExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/2/7.
 */
public class OrdersMapperTest {
	private OrdersMapper mapper;

	@Before
	public void setUp() throws Exception {
		mapper =
		new SqlSessionFactoryBuilder().build(
				Resources.getResourceAsReader(
						"SqlMapCfg.xml"
				)
		).openSession().getMapper(
				OrdersMapper.class
		);

	}

	@Test
	public void findOrdersUser() throws Exception {
//		List<OrdersExt> ordersUser = mapper.findOrdersUser();

		List<Orders> ordersUser = mapper.findOrdersUser();
		for (Orders orders : ordersUser) {
			System.out.println(
					orders.getUser().getUsername()
			);
			System.out.println(
					orders.getNumber()
			);
		}
	}

	@Test
	public void findOrdersAll() throws Exception {
		List<Orders> ordersAll = mapper.findOrdersAll();
		for (Orders orders : ordersAll) {
			System.out.println(orders);
		}

	}
}