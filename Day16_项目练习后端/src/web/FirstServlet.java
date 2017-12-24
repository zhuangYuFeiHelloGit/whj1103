package web;

import com.thoughtworks.xstream.XStream;
import dao.UserDao;
import domain.User;
import net.sf.json.JSONObject;
import net.sf.json.JSONString;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zyf on 2017/12/13.
 */
@WebServlet(name = "FirstServlet",urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
	private UserDao userDao = new UserDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.addHeader("Access-Control-Allow-Origin","*");
		/*星号表示所有的域都可以接受，*/
		response.addHeader("Access-Control-Allow-Methods","GET,POST");
		String level = request.getParameter("level");

		try {
			User first = userDao.first();

			if(first == null){
				response.getWriter().write("暂时还没有人员提交成绩信息");
				return;
			}

			XStream xStream = new XStream();
			xStream.alias("User",User.class);
			String fx = xStream.toXML(first);
			System.out.println(fx);
			JSONObject jsonObject = JSONObject.fromObject(first);
			String string = jsonObject.toString();
//			response.getWriter().write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+fx);
			response.getWriter().write(string);
		} catch (IOException e) {
			response.getWriter().write("==========如果老庄在，请呼叫老庄==========\n\t"+e.getMessage());

		}
	}
}
