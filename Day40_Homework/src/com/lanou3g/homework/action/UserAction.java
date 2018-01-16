package com.lanou3g.homework.action;

import com.lanou3g.homework.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zyf on 2018/1/16.
 */
public class UserAction extends ActionSupport implements ServletRequestAware,ServletContextAware{
	private HttpServletRequest request;
	private ServletContext servletContext;

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

	public String login(){
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if(username == null || password == null){
			return ERROR;
		}

		User user = (User) this.servletContext.getAttribute("user");

		if (user == null){
			return ERROR;
		}


		if(username.equals(user.getUsername())
				&& password.equals(user.getPassword())){

			return SUCCESS;
		}

		return ERROR;
	}

	public String register(){
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if(username == null || password == null){
			return ERROR;
		}

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);


		this.servletContext.setAttribute("user",user);

		return SUCCESS;
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
}
