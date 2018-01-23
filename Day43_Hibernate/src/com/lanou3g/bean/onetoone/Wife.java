package com.lanou3g.bean.onetoone;

/**
 * Created by zyf on 2018/1/19.
 */
public class Wife {
	private Integer wid;
	private String wname;
	private Husband husband;

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Wife wife = (Wife) o;

		if (wid != wife.wid) return false;
		if (wname != null ? !wname.equals(wife.wname) : wife.wname != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = wid;
		result = 31 * result + (wname != null ? wname.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Wife{" +
				"wid=" + wid +
				", wname='" + wname + '\'' +
				'}';
	}
}
