import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zyf on 2018/1/2.
 */
@WebServlet(name = "ContextParamServlet",
		urlPatterns = "/cp",
		initParams = {
			@WebInitParam(
				name = "username",
				value = "王五"),
			@WebInitParam(
					name = "age",
					value = "18"
			)})
public class ContextParamServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println(getServletConfig()
				.getInitParameter("username"));
		System.out.println(getServletConfig()
				.getInitParameter("age"));


		//获得在web.xml中配置的全局参数
		String username = getServletContext()
				.getInitParameter("username");

		System.out.println(username);
	}
}
