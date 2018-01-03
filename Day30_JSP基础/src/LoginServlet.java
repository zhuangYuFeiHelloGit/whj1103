import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by zyf on 2018/1/3.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String username =
				request.getParameter("username");
		String password =
				request.getParameter("password");
		//获得session
		HttpSession session =
				request.getSession();

		session.setAttribute("username",username);
		request.setAttribute(
				"username",username
		);

		request.getRequestDispatcher("/index.jsp")
				.forward(request,response);


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
