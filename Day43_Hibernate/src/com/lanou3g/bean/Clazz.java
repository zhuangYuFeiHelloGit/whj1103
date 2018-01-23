package com.lanou3g.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zyf on 2018/1/19.
 */
public class Clazz {
	private int cid;
	private String cname;
	private Set<Student> students = new HashSet<>();

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Clazz clazz = (Clazz) o;

		if (cid != clazz.cid) return false;
		if (cname != null ? !cname.equals(clazz.cname) : clazz.cname != null) return false;
		return students != null ? students.equals(clazz.students) : clazz.students == null;
	}

	@Override
	public int hashCode() {
		int result = cid;
		result = 31 * result + (cname != null ? cname.hashCode() : 0);
		result = 31 * result + (students != null ? students.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Clazz{" +
				"cid=" + cid +
				", cname='" + cname + '\'' +
				", students=" + students +
				'}';
	}
}
