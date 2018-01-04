package com.lanou3g.web;

import com.lanou3g.bean.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2018/1/4.
 */
@WebServlet(name = "IndexServlet",urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> books = new ArrayList<>();
		books.add(new Book("飞升之后","黄埔奇","10"));
		books.add(new Book("斗破苍穹","天蚕土豆","1"));
		books.add(new Book("西游记","吴承恩","1000"));
		books.add(new Book("步步惊心","春来","500"));

		System.out.println("哈哈哈哈哈");
		//模拟，这个集合中的内容，就是从数据库中获取来的

		request.setAttribute("books",books);
		request.getRequestDispatcher("/index.jsp")
				.forward(request,response);
	}
}
