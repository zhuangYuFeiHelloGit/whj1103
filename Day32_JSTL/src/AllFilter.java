import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zyf on 2018/1/5.
 */
@WebFilter(filterName = "AllFilter"
			,urlPatterns = {"/pic","/set"})
public class AllFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
		//单一职责原则
		//一个类，只有一个功能
		//开闭原则
		//对扩展开放，对修改关闭
		//依赖倒置原则

		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		HttpServletRequest request =
				(HttpServletRequest) req;
		HttpServletResponse response =
				(HttpServletResponse) resp;
		Object username = 
			request.getSession()
				.getAttribute("username");
		if(username != null){
			chain.doFilter(req, resp);
			return;
		}
		//重定向是要加上项目名的
		response.sendRedirect(
//				request.getContextPath()
						"/login.html");
	}

	public void init(FilterConfig config) throws ServletException {

	}

}
