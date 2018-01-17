package com.lanou3g.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.CompoundRoot;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zyf on 2018/1/17.
 */
public class OgnlAction extends ActionSupport implements ServletRequestAware{

	private HttpServletRequest request;
	private String name = "李小璐";

	public String hello(){

		System.out.println("hello struts2-tags");
		request.setAttribute(
				"hello","oh pretty baby"
		);
		return SUCCESS;
	}


	public String show(){
		ActionContext context =
				ActionContext.getContext();

		CompoundRoot root =
				context.getValueStack().getRoot();
		root.push("hahahah");
		context.put(
				"show",
				"获得ActionContext中的值"
		);
		return SUCCESS;
	}


	public String el(){
//
//		ActionContext
//				.getContext()
//				.put("name","PGOne");

		ActionContext.getContext()
				.getSession()
				.put("name","凉凉");
		return SUCCESS;
	}

//	public String getName() {
//		return name;
//	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}
}
