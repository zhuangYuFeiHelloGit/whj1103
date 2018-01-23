package com.lanou.annotation;

import org.springframework.stereotype.Controller;

/**
 * Created by zyf on 2018/1/23.
 */
@Controller
//struts2中的action
//使用这个注解
public class LoginAction {

	public String login(){
		return "success";
	}

}
