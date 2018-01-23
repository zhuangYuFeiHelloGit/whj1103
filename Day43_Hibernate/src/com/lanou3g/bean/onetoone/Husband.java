package com.lanou3g.bean.onetoone;

/**
 * Created by zyf on 2018/1/19.
 */
public class Husband {
	private Integer hid;
	private String hname;
	private Wife wife;

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Husband husband = (Husband) o;

		if (hid != husband.hid) return false;
		if (hname != null ? !hname.equals(husband.hname) : husband.hname != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = hid;
		result = 31 * result + (hname != null ? hname.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Husband{" +
				"hid=" + hid +
				", hname='" + hname + '\'' +
				'}';
	}
}
