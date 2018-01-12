import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2018/1/12.
 */
@WebServlet(name = "ParamsServlet",urlPatterns = "/params")
public class ParamsServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pc = request.getParameter("pc");
		PageBean pageBean = new PageBean();
		if(pc == null){
			pc="1";
		}
		System.out.println(pc);
		int p = Integer.parseInt(pc);

		int begin = (p - 1) * pageBean.getPageSize();
		int end = p * pageBean.getPageSize();

		StringBuilder sb = new StringBuilder();

		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String price = request.getParameter("price");
		String category = request.getParameter("category");

		String[] ps = {"name","author","price","category"};
		String[] pv = {name,author,price,category};


		String params = "";
		for (int i = 0; i < pv.length; i++) {
			if(pv[i] != null){
				params +="&"+ps[i]+"="+pv[i];
			}
		}
		pageBean.setParams(params);


		List<String> pl = new ArrayList<>();
		sb.append("select * from book");
		if(name != null || author != null || price!=null || category!= null){
			sb.append(" where ");
			boolean shouldAnd = false;

			for (int i = 0; i < ps.length; i++) {
				if(pv[i] != null){
					if(shouldAnd){
						sb.append(" and ");
					}
					sb.append(ps[i]+"='"+pv[i]+"'");
					shouldAnd = true;
					pl.add(ps[i]);
				}
			}
		}

		sb.append(" limit "+begin+",10");

		System.out.println(sb.toString());
		Connection connection = JdbcUtil.getConnection();
		QueryRunner qr = new QueryRunner();
		try {
			List<Book> books = qr.query(connection, sb.toString(), new BeanListHandler<Book>(Book.class));

			pageBean.setBooks(books);
			pageBean.setTotalData(200);
			pageBean.setPageCode(p);


			request.setAttribute("pageBean", pageBean);

			request.getRequestDispatcher(
					"index.jsp"
			).forward(request, response);



		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
