package com.lanou.mvc.action;

import com.lanou.mvc.bean.User;
import com.lanou.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by zyf on 2018/1/23.
 */
@Controller
public class UserAction {

	@Autowired
	private UserService userService;

	public String login(){

		User login =
				userService.login();
		System.out.println(login);

		return "success";
	}

}
