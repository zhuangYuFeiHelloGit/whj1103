package com.lanou.dao;

import com.lanou.domain.Classes;
import com.lanou.domain.ClassesQueryParam;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/2/7.
 */
public class ClassesMapperTest {

	private SqlSessionFactory ssf;
	private SqlSession sqlSession;

	@Before
	public void setUp() throws Exception {
		ssf = new SqlSessionFactoryBuilder().build(
				Resources.getResourceAsReader("SqlMapCfg.xml")
		);
		sqlSession = ssf.openSession();
	}

	@Test
	public void insertClasses() throws Exception {
		SqlSession sqlSession = ssf.openSession();
		ClassesMapper mapper = sqlSession.getMapper(ClassesMapper.class);
		Classes classes = new Classes("JAVA1103班","男");
		mapper.insertClasses(classes);
	}

	@Test
	public void findByCondition() throws Exception {
		ClassesMapper mapper = sqlSession.getMapper(ClassesMapper.class);
		Classes condition = new Classes("1103");
		List<Classes> byCondition =
				mapper.findByCondition(condition);

		System.out.println(Arrays.toString(byCondition.toArray()));

	}

	@Test
	public void findByIds() throws Exception {
		ClassesMapper mapper =
				sqlSession.getMapper(ClassesMapper.class);

		List<Integer> ids =
				new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ClassesQueryParam cqp =
				new ClassesQueryParam();
		cqp.setClassesIds(ids);

		List<Classes> byIds =
				mapper.findByIds(cqp);
		System.out.println(
				Arrays.toString(
						byIds.toArray()
				)
		);

	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();

	}
}