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
@WebServlet(name = "ShowServlet",
		urlPatterns = "/show")
public class ShowServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("====开始输出ShowServlet接收到的Cookie=====");

		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(
					cookie.getName()
							+"-"+
							cookie.getValue());
		}
	}
}
