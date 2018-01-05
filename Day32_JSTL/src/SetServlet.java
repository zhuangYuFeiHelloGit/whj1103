import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2018/1/5.
 */
@WebServlet(name = "SetServlet",urlPatterns = "/set")
public class SetServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 10; i++) {

			User user = new User();
			user.setName("李四"+i);
			user.setGender("男"+i);

			users.add(user);
		}

		request.setAttribute("users",users);
		request.getRequestDispatcher("/2_core.jsp")
				.forward(request,response);
	}
}
