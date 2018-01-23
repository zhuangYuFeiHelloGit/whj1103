package com.lanou3g;

import com.lanou3g.bean.Student;
import org.hibernate.Session;
import org.junit.Test;

/**
 * Created by zyf on 2018/1/18.
 */
public class HibernateUtilTest {

	@Test
	public void t(){
		Student student = HibernateUtil.handle(new HibernateUtil.ResultHandler<Student>() {

			@Override
			public Student handle(Session session) {

				return session.get(Student.class, 1L);
			}
		});

		System.out.println(student);
	}


	@Test
	public void showLambda(){
		Student handle = HibernateUtil.handle(session -> {
			return session.get(Student.class, 1L);
		});
		System.out.println(handle);

		HibernateUtil.handle(session -> session.get(Student.class,1L));
	}

}