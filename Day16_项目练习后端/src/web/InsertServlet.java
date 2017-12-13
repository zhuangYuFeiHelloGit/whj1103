package web;

import dao.UserDao;
import util.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Created by zyf on 2017/12/13.
 */
@WebServlet(name = "InsertServlet",urlPatterns = "/insert")
public class InsertServlet extends HttpServlet {
	private UserDao userDao = new UserDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		try {

			String username = request.getParameter("username");

			if (username == null || username.isEmpty()) {
				response.getWriter().write("错误提示：请填写username参数\n示例：\n\t" + Constants.DEMO);
				return;
			}

			String s = request.getParameter("score");
			if (s == null || s.isEmpty()) {
				response.getWriter().write("错误提示：请填写score参数\n示例：\n\t" + Constants.DEMO);
				return;
			}

			int score = 0;
			try {
				score = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				response.getWriter().write("错误提示：请填写整形的毫秒值");
				return;
			}


			System.out.println(username);

			userDao.insert(username, score);
			response.getWriter().write("SUCCESS");
		}catch (Exception e){
			response.getWriter().write("==========如果老庄在，请呼叫老庄==========\n\t"+e.getMessage());
		}
	}
}
