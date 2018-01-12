import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2018/1/12.
 */
@WebServlet(name = "ShowServlet",
		urlPatterns = "/show")
public class ShowServlet extends HttpServlet {

	private List<Book> books;


	private void initBooks(){
		for (int i = 0; i < 30; i++) {
			Book book = new Book(
					"bbb" + i,
					"www",
					i + "",
					"武侠小说"
			);
			books.add(book);
		}
	}

	@Override
	public void init() throws ServletException {
		books = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			initBooks();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//获得前端给我的页码参数
		//pc=pageCode
		String pc = request.getParameter("pc");

		//？？
		//一页取八个
		//第八页是从哪儿到哪儿
		//56-63
		//0-7
		//8-15
		// 从哪儿：(pc - 1)*pageSize
		// 到哪儿：pc*pageSize

		PageBean pageBean = new PageBean();

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
		System.out.println(params);

		pageBean.setParams(params);







		sb.append("select * from book");
		if(name != null || author != null || price!=null || category!= null){
			sb.append(" where ");
			boolean shouldAnd = false;

			for (int i = 0; i < ps.length; i++) {
				if(pv[i] != null){
					if(shouldAnd){
						sb.append(" and ");
					}
					sb.append(ps[i]+"="+pv[i]);
					shouldAnd = true;

				}
			}
		}

		System.out.println(sb.toString());


		String sql =
				"select * from book where age=19 limit ?,?";

//		qr.query(connection,sb.toString(),begin,end);


		List<Book> paramBooks = new ArrayList<>();
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			//如果这个book满足条件
			//则要把这个book加入到paramBooks中
			if(name != null){
				if(book.getBookName().equals(name)){
					paramBooks.add(book);
				}
			}
			if(price != null){
				if(book.getPrice().equals(price)){
					paramBooks.add(book);
				}
			}
		}

		if(paramBooks.size() == 0){
			paramBooks = books;
		}

		List<Book> bookList =
				paramBooks.subList(begin, end);
		System.out.println(bookList.size());

		pageBean.setBooks(bookList);
		//select count(*) from xxx;
		pageBean.setTotalData(200);
		pageBean.setPageCode(p);

		request.setAttribute("pageBean", pageBean);

		request.getRequestDispatcher(
				"index.jsp"
		).forward(request, response);


	}
}
