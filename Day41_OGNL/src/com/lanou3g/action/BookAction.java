package com.lanou3g.action;

import com.lanou3g.Book;
import com.lanou3g.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2018/1/17.
 */
public class BookAction extends ActionSupport {
	private String username;
	private String sex;
	private User user;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String books(){

		System.out.println(sex);
		System.out.println(username);

		List<Book> books = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Book book = new Book();
			book.setName("侠客行"+i);
			book.setAuthor("金庸"+i);
			book.setCategory("武侠"+i);
			books.add(book);
		}

		ActionContext.getContext()
				.put("books",books);

		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
