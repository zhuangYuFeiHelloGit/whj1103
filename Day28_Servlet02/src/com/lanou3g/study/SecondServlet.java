package com.lanou3g.study;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zyf on 2017/12/29.
 */
public class SecondServlet extends GenericServlet {
	/**
	 * Servlet在web.xml中的配置内容
	 * 会被抽象成一个ServletConfig对象
	 * 这个对象会在tomcat帮我们调用
	 * init(ServletConfig)的时候传入
	 *
	 * GenericServlet帮我们封装好了一步：
	 * 		this.servletConfig = servletConfig;
	 *
	 * init()不是生命周期！！
	 *
	 *
	 */




	@Override
	public void init() throws ServletException {
	}


	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

	}
}
