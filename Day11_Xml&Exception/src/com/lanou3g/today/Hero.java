package com.lanou3g.today;

/**
 * Created by zyf on 2017/12/6.
 */
public class Hero {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void skill(){
		System.out.println("释放了技能");
	}

	private void show(String what){
		System.out.println("show："+what);
	}

	@Override
	public String toString() {
		return "Hero{" +
				"name='" + name + '\'' +
				'}';
	}
}
