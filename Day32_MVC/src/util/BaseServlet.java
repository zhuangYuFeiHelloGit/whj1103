package util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zyf on 2018/1/5.
 */
public class BaseServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//我们自己定义一个叫method的请求参数
		//根据这个请求参数的值
		//来确定到底要执行哪个方法

		//获得请求参数method
		String methodName =
			req.getParameter("method");

		//要获得当前这个类的类型，应该怎么写？
		Class<? extends BaseServlet> servlet =
				this.getClass();

		//servlet的类型是class
		//这是一个类对象
		//通过类对象的getMethod方法，
		// 可以获得该类中的方法
		Method method = null;
		try {
			method = servlet.getMethod(
					methodName,
					HttpServletRequest.class,
					HttpServletResponse.class
			);
		} catch (NoSuchMethodException e) {
			//运行时异常，就是希望在运行时崩掉
			throw new RuntimeException(
			"sorry,there is not a method which name is "+methodName);
		}

		try {
			String result =
					(String)
					method.invoke(this, req, resp);

			String[] split = result.split(":");
			String type = split[0];
			String path = split[1];

			if(type.equals("f")){
				//说明要请求转发
				req.getRequestDispatcher(path)
						.forward(req,resp);
			}
			if(type.equals("r")){
				//说明要重定向
				resp.sendRedirect
						(req.getContextPath()+path);
			}



		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}


	}
}
