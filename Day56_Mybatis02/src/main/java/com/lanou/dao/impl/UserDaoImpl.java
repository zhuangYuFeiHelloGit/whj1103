package com.lanou.dao.impl;

import com.lanou.dao.UserDao;
import com.lanou.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 * Created by zyf on 2018/2/7.
 */
public class UserDaoImpl implements UserDao {

	private SqlSessionFactory ssf;



	public User findById(int id) throws IOException {
		ssf = new SqlSessionFactoryBuilder().build(
				Resources.getResourceAsReader(
						"SqlMapCfg.xml"
				)
		);

		SqlSession sqlSession =
				ssf.openSession();

		User user =
			sqlSession.selectOne(
					"user.findById", id
			);

		return user;
	}

	public List<User> findAll() {
		return null;
	}

	public void insertUser(User user) {

	}
}
