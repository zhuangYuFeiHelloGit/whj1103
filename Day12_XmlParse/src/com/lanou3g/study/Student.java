package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/7.
 */
public class Student {
	private String name;
	private int score;

	private Cat cat;

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", score=" + score +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int score) {

		this.name = name;
		this.score = score;
	}

	public Student() {
	}
}







