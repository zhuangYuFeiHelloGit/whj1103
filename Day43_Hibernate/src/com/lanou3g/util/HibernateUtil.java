package com.lanou3g.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by zyf on 2018/1/18.
 */
public class HibernateUtil {

	private static SessionFactory SF;

	static {
		SF = new Configuration().configure().buildSessionFactory();
	}

	public static <T> T handle(ResultHandler<T> rh){
		Session session = SF.openSession();
		Transaction transaction =
				session.getTransaction();
		transaction.begin();

		T handle = rh.handle(session);

		transaction.commit();
		session.close();
		return handle;
	}

	public interface ResultHandler<T>{
		T handle(Session session);
	}




}
