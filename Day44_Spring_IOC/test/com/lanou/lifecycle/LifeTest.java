package com.lanou.lifecycle;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/22.
 */
public class LifeTest {

	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new
			ClassPathXmlApplicationContext(
				"spring-config.xml"
		);
	}

	@Test
	public void life() throws Exception {
		Object per = context.getBean("per");

		((ClassPathXmlApplicationContext) context)
				.close();
	}
}