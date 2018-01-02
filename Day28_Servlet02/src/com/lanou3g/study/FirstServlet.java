package com.lanou3g.study;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zyf on 2017/12/29.
 */
public class FirstServlet implements Servlet{

	private ServletConfig config;

	/**
	 * 当第一次被访问时
	 * 会执行init方法
	 * @param servletConfig
	 * @throws ServletException
	 */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		this.config = servletConfig;
		System.out.println("看我什么时候被执行----我出生了");
	}


	/**
	 * 需要获得servletConfig时，手动调用
	 * @return
	 */
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig----");
		return null;
	}


	/**
	 * 每次被访问时，会执行
	 * @param servletRequest
	 * @param servletResponse
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		System.out.println("service----");
	}

	/**
	 * 当需要获得servletInfo时，手动调用
	 * 基本没啥用
	 * @return
	 */
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo----");

		return null;
	}

	/**
	 * 服务器关闭前，会调用这个方法，
	 * 可以用来释放一些资源
	 */
	@Override
	public void destroy() {
		System.out.println("destroy----");

	}
	/**
	 * 刚刚设置的：context path = day28
	 * 就是设置了我们当前应用的项目名
	 * 也就是说：
	 * 	ContextPath就是项目名
	 *
	 *
	 * 最原始的创建Servlet的方法：
	 * 	实现Servlet接口
	 */
}
