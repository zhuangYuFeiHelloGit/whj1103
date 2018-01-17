package com.lanou3g.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/17.
 */
public class LoginAction extends ActionSupport {
	public String add(){
		System.out.println("执行add---");
		return "add";
	}

	public String update(){
		System.out.println("执行update---");
		return "update";
	}

	public String login(){
		return SUCCESS;
	}
}
