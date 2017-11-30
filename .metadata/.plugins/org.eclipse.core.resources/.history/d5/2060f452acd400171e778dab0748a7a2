package com.lanou3g.homework;

public class HomeMain {
	public static void main(String[] args) {
		Father father = new Father();
		//创建好father之后，给他一个名字
		father.setName("马云爸爸");
		Mother mother = new Mother();
		mother.setName("围裙妈妈");
		Child child = new Child();
		child.setName("毛新宇");
		
		
		father.setWife(mother);
		father.setChild(child);
		mother.setHusband(father);
		child.setFather(father);
		mother.setChild(child);
		child.setMother(mother);
		
		
		father.showFamily();
		mother.showFamily();
		child.showFamily();
	}
}
