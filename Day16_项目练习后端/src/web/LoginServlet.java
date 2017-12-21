package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by zyf on 2017/12/21.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] username = request.getParameterValues("username");
		System.out.println(Arrays.toString(username));
		String password = request.getParameter("password");
		System.out.println("获得用户名："+username+"\t获得密码："+password);
		System.out.println(request.getRemoteAddr());
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("SUCCESS");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
