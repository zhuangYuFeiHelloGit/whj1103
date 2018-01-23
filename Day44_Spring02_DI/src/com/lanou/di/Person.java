package com.lanou.di;

/**
 * Created by zyf on 2018/1/22.
 */
public class Person {
	private String name;
	private Car car;

	public Person(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", car=" + car +
				'}';
	}
}
