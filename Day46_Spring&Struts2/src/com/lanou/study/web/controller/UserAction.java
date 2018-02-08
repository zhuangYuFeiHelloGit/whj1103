package com.lanou.study.web.controller;

import com.lanou.study.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/24.
 */
public class UserAction extends ActionSupport {

	private UserService userService;


	public String register(){
		userService.register();
		return SUCCESS;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
