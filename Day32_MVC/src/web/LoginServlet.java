package web;

import domain.User;
import service.UserService;
import service.exception.LoginException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zyf on 2018/1/5.
 */
@WebServlet(name = "LoginServlet",
		urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	private UserService userService
			= new UserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//formU表示是从表单提交上来的
		//fromDb表示是从数据库中查出来的
		User formU = new User();
		formU.setUsername(username);
		formU.setPassword(password);

		try {
			User login =
					userService.login(formU);
			request.getSession().setAttribute(
					"user",login
			);
			response.sendRedirect(
					request.getContextPath()
							+"/index.jsp"
			);
		} catch (LoginException e) {
			request.setAttribute(
					"errorMsg",e.getMessage()
			);

			request.getRequestDispatcher("/login.jsp")
					.forward(request,response);
		}



	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
