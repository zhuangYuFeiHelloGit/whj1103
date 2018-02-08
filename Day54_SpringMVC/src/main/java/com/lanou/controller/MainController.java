package com.lanou.controller;

import com.lanou.domain.User;
import com.lanou.domain.UserWrap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zyf on 2018/2/5.
 */
@Controller
public class MainController {

	private String SUCCESS = "success";

	@RequestMapping(value = "/hello")
	public String hello(){

		System.out.println("---Hello SpringMVC---");

		return "success";
	}


	@RequestMapping("/login")
	public String login(String username,String password){
		System.out.println("username：---"+username);
		System.out.println("password：---"+password);

		return SUCCESS;
	}

	@RequestMapping("/login2")
	public String login2(User user){
		System.out.println(user);

		return SUCCESS;
	}

	@RequestMapping("/login3")
	public String login3(UserWrap userWrap){
		System.out.println(userWrap);

		Object o2 = userWrap.getUser().getMap().get("o2");
		UserWrap uw = (UserWrap) o2;
		System.out.println(uw);
		return SUCCESS;
	}

	@RequestMapping(value = "/login4")
	public String login4(User user, Model model){

		//相当于application域
		model.addAttribute("user",user);

		return SUCCESS;
	}


	@RequestMapping("/updateById/{id}")
	public String updateById(@PathVariable int id){

		System.out.println(id);
		return SUCCESS;
	}

	@RequestMapping("/redirect")
	public String redirect(){
		return "redirect:success";
	}


	//加/就表示要访问的是控制器，而不是jsp页面
	@RequestMapping("/rtc")
	public String redirectToController(){
		return "redirect:/updateById/3";
	}

	@RequestMapping("/register")
	@ResponseBody
	public UserWrap register(User user){

		//200表示访问成功
		//SUCCESS表示提示信息
		//user才是真正的数据
		UserWrap userWrap =
				new UserWrap(200,SUCCESS,user);
		//后端在传给前端json数据时
		//都会遵从上述格式
			//code：响应码，如果出错，设置对应的响应码
			//message：成功：success，出错：异常信息
			//user：真正的数据
		//也就是说，只要传给前端json数据，都需要将
		//真正的JavaBean包装一下
		return userWrap;
	}

}
