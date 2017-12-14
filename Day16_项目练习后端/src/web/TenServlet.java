package web;

import dao.UserDao;
import domain.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zyf on 2017/12/13.
 */
@WebServlet(name = "TenServlet",urlPatterns = "/ten")
public class TenServlet extends HttpServlet {
	private UserDao userDao = new UserDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




		response.setContentType("text/html;charset=utf-8");

		try {
			List<User> users = userDao.ten();

			if(users == null){
				response.getWriter().write("暂时还没有人员提交成绩信息");
				return;
			}
			JSONArray jsonArray = JSONArray.fromObject(users);
			String string = jsonArray.toString();
			response.getWriter().write(string);
		} catch (IOException e) {
			response.getWriter().write("==========如果老庄在，请呼叫老庄==========\n\t"+e.getMessage());
		}
	}
}
