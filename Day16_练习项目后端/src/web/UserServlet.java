package web;

import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zyf on 2017/12/13.
 */
@WebServlet(name = "UserServlet",urlPatterns = "/us")
public class UserServlet extends HttpServlet {
	private UserDao userDao = new UserDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		if(username == null){
			response.getWriter().write("错误提示：请填写username参数\n示例：\n\t");
			return;
		}

		String s = request.getParameter("score");
		if(s == null){
			response.getWriter().write("错误提示：请填写score参数\n示例：\n\t");
		}

		int score = 0;
		try {
			score = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			response.getWriter().write("错误提示：请填写整形的毫秒值");
		}

		userDao.insert(username,score);
		response.getWriter().write("SUCCESS");
	}
}
