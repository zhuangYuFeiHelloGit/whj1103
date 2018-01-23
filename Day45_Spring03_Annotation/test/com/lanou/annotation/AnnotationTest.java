package com.lanou.annotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/23.
 */
public class AnnotationTest {

	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context =
		new ClassPathXmlApplicationContext(
				"spring-config.xml"
		);
	}

	@Test
	public void person() throws Exception {
		Person person = (Person)
				context.getBean("p");
		System.out.println(person);

		((ClassPathXmlApplicationContext) context)
				.close();
	}

	@Test
	public void extendsTest() throws Exception {
//
		Object student =
				context.getBean("student");
//		Object people =
//				context.getBean("people");
		System.out.println(student.toString());

//		System.out.println(people);
	}
}