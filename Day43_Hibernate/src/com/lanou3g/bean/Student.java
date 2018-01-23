package com.lanou3g.bean;

/**
 * Created by zyf on 2018/1/19.
 */
public class Student {
	private int sid;
	private String sname;
	private Integer ccc;
	private Clazz clazz;

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public Student() {
	}

	public Student(String sname) {
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getCcc() {
		return ccc;
	}

	public void setCcc(Integer ccc) {
		this.ccc = ccc;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		if (sid != student.sid) return false;
		if (sname != null ? !sname.equals(student.sname) : student.sname != null) return false;
		if (ccc != null ? !ccc.equals(student.ccc) : student.ccc != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = sid;
		result = 31 * result + (sname != null ? sname.hashCode() : 0);
		result = 31 * result + (ccc != null ? ccc.hashCode() : 0);
		return result;
	}
}
