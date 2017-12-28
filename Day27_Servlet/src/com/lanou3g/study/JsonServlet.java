package com.lanou3g.study;

import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zyf on 2017/12/28.
 */
public class JsonServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=utf-8");

		//每次一接收到请求，就返回一个JSON数据

		List<User> users = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 20; i++) {
			User u = new User();
			u.setUsername("user："+i);
			u.setGender(random.nextBoolean()?"男":"女");
			u.setAge(i+"");

			users.add(u);
		}

		//使用json-lib包中的工具类
		//将集合users转换为一个JSON数组
		JSONArray jsonArray =
				JSONArray.fromObject(users);
		resp.getWriter().write(jsonArray.toString());


	}
}
