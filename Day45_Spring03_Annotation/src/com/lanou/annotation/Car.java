package com.lanou.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zyf on 2018/1/23.
 */
@Component("car1")
public class Car {

	@Value("张三")
	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}
}
