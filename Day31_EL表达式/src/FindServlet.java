import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by zyf on 2018/1/4.
 */
@WebServlet(name = "FindServlet",urlPatterns = "/find")
public class FindServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute(
				"name","request"
		);
		HttpSession session =
				request.getSession();
		session.setAttribute(
				"name","session"
		);

		getServletContext().setAttribute(
				"name","servletContext"
		);

		request.getRequestDispatcher("/1_hello.jsp")
				.forward(request,response);
	}
}
