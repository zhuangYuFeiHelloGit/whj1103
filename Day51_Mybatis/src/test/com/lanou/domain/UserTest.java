package com.lanou.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/31.
 */
public class UserTest {


	@Test
	public void insertUser() throws Exception {
		User user = new User(0,"李国易","男",new Date(),"中南海");

		InputStream inputStream =
				Resources.getResourceAsStream("SqlMapConfig.xml");


		//把配置文件中的信息封装成一个对象
		SqlSessionFactory sessionFactory =
				new SqlSessionFactoryBuilder()
				.build(inputStream);


		SqlSession sqlSession =
				 sessionFactory.openSession();

		sqlSession.insert("user.insertUser",user);

		sqlSession.commit();

		sqlSession.close();
	}

	@Test
	public void selectByName() throws Exception {
		SqlSessionFactory sessionFactory =
				new SqlSessionFactoryBuilder().
				build(
					Resources.getResourceAsReader(
							"SqlMapConfig.xml"
					)
				);
		SqlSession sqlSession =
				sessionFactory.openSession();
		List<Object> objects =
				sqlSession.selectList("user.selectByName", "王");
		System.out.println(
				Arrays.toString(
						objects.toArray()
				)
		);

	}
}