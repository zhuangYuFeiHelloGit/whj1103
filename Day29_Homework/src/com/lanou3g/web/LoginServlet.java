package com.lanou3g.web;

import com.lanou3g.bean.User;
import com.lanou3g.dao.UserDao;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by zyf on 2018/1/3.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	private UserDao userDao;

	@Override
	public void init() throws ServletException {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Map<String, String[]> parameterMap =
				request.getParameterMap();
		User user = new User();
		try {
			BeanUtils.populate(user,parameterMap);

			User u = userDao.queryByUsername(user.getUsername());



			if(user.getUsername().equals(u.getUsername())){
				if(user.getPassword().equals(u.getPassword())){
						//成功

						//存在哪儿，访问index时可以获取到
						//存到ServletContext中
						getServletContext().setAttribute("user",user);

//						request.getRequestDispatcher("/index.jsp")
//								.forward(request,response);
						response.sendRedirect("/day29/index");
						return;




				}else {
					System.out.println("密码错误");
				}
			}else {
				System.out.println("无用户名");
			}

			System.out.println("哈哈哈哈哈哈");

			response.sendRedirect("/day29/login.html");

		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
