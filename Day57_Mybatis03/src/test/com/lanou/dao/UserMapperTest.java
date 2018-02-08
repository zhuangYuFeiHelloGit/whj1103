package com.lanou.dao;

import com.lanou.domain.Orders;
import com.lanou.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/2/8.
 */
public class UserMapperTest {

	private UserMapper userMapper;
	private OrdersMapper ordersMapper;
	private SqlSession sqlSession;

	@Before
	public void setUp() throws Exception {

		sqlSession = new SqlSessionFactoryBuilder().build(
				Resources.getResourceAsReader("mybatis-config.xml")
		).openSession();
		userMapper =
				sqlSession.getMapper(UserMapper.class);
		ordersMapper = sqlSession.getMapper(OrdersMapper.class);
	}

	@Test
	public void findUser() throws Exception {
		List<User> users = userMapper.findUser();

		System.out.println(Arrays.toString(users.toArray()));
	}

	@Test
	public void insertUser() throws Exception {
		User user = new User();
		user.setUsername("马化腾");

		userMapper.insertUser(user);

		//先提交一次，将马化腾更新到数据库
		sqlSession.commit();

		Orders orders1 = new Orders();
		orders1.setNumber(1110);
		orders1.setUser_id(user.getId());
		ordersMapper.insertOrders(orders1);


		Orders orders2 = new Orders();
		orders2.setNumber(1111);
		orders2.setUser_id(user.getId());
		ordersMapper.insertOrders(orders2);

		Orders orders3 = new Orders();
		orders3.setNumber(1112);
		orders3.setUser_id(user.getId());
		ordersMapper.insertOrders(orders3);


		//提交插入的Orders
		sqlSession.commit();


		List<Orders> ordersList = new ArrayList<Orders>();
		ordersList.add(orders1);
		ordersList.add(orders2);
		ordersList.add(orders3);
		user.setOrdersList(ordersList);

		System.out.println(user);

	}

	@After
	public void tearDown() throws Exception {

		sqlSession.commit();
		sqlSession.close();

	}

	@Test
	public void test() throws Exception {
		UserMapper userMapper1 = sqlSession.getMapper(UserMapper.class);
		UserMapper userMapper2 = sqlSession.getMapper(UserMapper.class);
		UserMapper userMapper3 = sqlSession.getMapper(UserMapper.class);

		System.out.println(userMapper1);
		System.out.println(userMapper2);
		System.out.println(userMapper3);
	}
}