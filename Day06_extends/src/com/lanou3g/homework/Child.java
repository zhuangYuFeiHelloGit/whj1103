package com.lanou3g.homework;

public class Child {
	private String name;
	private Father father;
	private Mother mother;
	
	public void setFather(Father father){
		this.father = father;
	}
	
	public void setMother(Mother mother){
		this.mother = mother;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showFamily(){
		System.out.println(
		name+"的父亲为"+father.getName()
		+"，母亲为"+mother.getName());
	}
	
	
}
