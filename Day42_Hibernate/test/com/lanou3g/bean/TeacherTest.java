package com.lanou3g.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/18.
 */
public class TeacherTest {

	@Test
	public void save(){
		//创建一个装载配置信息的对象
		Configuration config =
				new Configuration();
		//将hibernate.cfg.xml中的信息装进去
		config.configure();

		//根据配置信息创建一个sessionFactory
		//sessionFactory负责创建Session
		SessionFactory sf =
				config.buildSessionFactory();

		//开启一个session
		//在hibernate中，session就相当于
		//jdbc中的connection
		Session session = sf.openSession();

		//获取事务对象
		Transaction transaction =
				session.getTransaction();

		//hibernate默认是不自动提交事务的
		//先开启事务
		transaction.begin();

		//构建一个要保存的teacher对象
		//因为tid是主键，并且设置了自增长
		//所以我们不需要设置主键
		Teacher teacher = new Teacher();
		teacher.setName("菩提老祖");
		teacher.setAge(9999);
		teacher.setSubject("七十二变");

		//session就相当于connection
		//也就是说增删改查方法都是session调用的
		session.save(teacher);

		//提交事务
		//如果不提交事务，则上述保存操作
		//并不会被更新到数据库
		transaction.commit();
		//session相当于连接，使用后需要关闭
		session.close();

	}

}