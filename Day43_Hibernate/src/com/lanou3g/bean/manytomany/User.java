package com.lanou3g.bean.manytomany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zyf on 2018/1/19.
 */
public class User {
	private String uid;
	private String uname;
	private Set<Role> roles =
			new HashSet<>();

	public User() {
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
