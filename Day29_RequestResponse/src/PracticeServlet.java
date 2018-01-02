import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zyf on 2018/1/2.
 */
@WebServlet(name = "PracticeServlet",urlPatterns = "/practice")
public class PracticeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Long
		Object count =
				getServletContext().getAttribute("count");

		if(count == null){
			//说明是第一次访问
			getServletContext().setAttribute("count",1L);
			System.out.println("这是第1次");
		}else {

//			long l = Long.parseLong(count.toString());
			long l = (long) count;
			l++;
			System.out.println("这是第"+l+"次");

//			String c = String.valueOf(l);

			//自动装箱-----Long
			getServletContext().setAttribute("count",l);

		}


	}
}
