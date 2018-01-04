package com.lanou3g.study;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zyf on 2018/1/4.
 */
@WebServlet(name = "CookieServlet",urlPatterns = "/cookie")
public class CookieServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("====开始输出CookieServlet接收到的Cookie=====");
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(
					cookie.getName()
					+"-"+
					cookie.getValue());
		}


		response.addHeader("Set-Cookie","gender=男");
		response.addHeader("Set-Cookie","age=18");
		//Set-Cookie：响应头
		//gender=男：对应响应头的值

		Cookie user = new Cookie("user","cookie");

		user.setPath("/day31/cookie");

		user.setMaxAge(60*60*24*30);
		//设置为0，则表示销毁该cookie

		response.addCookie(user);
	}
}
