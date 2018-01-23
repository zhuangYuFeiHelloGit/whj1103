package com.lanou.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zyf on 2018/1/23.
 */
@Component("p")
//一般就是不知道这个类有什么具体的作用时
//就用这个注解
public class Person {

	@Qualifier("car1")
	@Autowired
	private Car car;

	@Value("王二麻子")
	private String name;


	@Value("男？")
	private String gender;


	@PostConstruct
	public void showPost(){
		System.out.println("初始化了----");
	}

	@PreDestroy
	public void showPre(){
		System.out.println("销毁了-----");
	}


	public Car getCar() {
		return car;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	@Value("女？")
	@Required
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person{" +
				"car=" + car +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}
