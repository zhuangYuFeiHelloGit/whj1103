package com.lanou3g.normal;

import java.util.Arrays;

public class 二维数组示例 {
	public static void main(String[] args) {
		//正常一维数组，里面就装个数，或者装个字符串
		//二维数组的意思就是
		//在每一个元素的位置，都装着一个数组
		//可以理解为，一个大箱子，箱子里面又有一些小格子
		//二维数组就是这个大箱子，里面每个格子，就是
		//里面的一个个一维数组
		
		//一维数组是一个中括号
		//二维数组就是两个中括号
		//后面new String[x][y]
		//x就表示这个二维数组的长度是多少
		//y就表示二维数组中，第一个元素的长度是多少
		
		String[][] users = new String[4][6];
		String[][] user1 = {{"1","1","1"},{"1","1","1"},{"1","1","1"},{"1","1","1"},{"1","1","1"}};
		
		System.out.println("二维数组的长度："+users.length);
		//这里就是取二维数组中第0个位置的一维数组的长度
		System.out.println("二维数组中的一维数组的长度："+users[0].length);
		//添加值
		for(int i=0;i<user1.length;i++){
			//i用来表示二维数组的元素的角标
			//users.length是二维数组的长度
			//也就是4	
			for(int j=0;j<user1[i].length;j++){
				//j用来表示二维数组中第i个元素(是个一维数组)中的元素的角标
				String a  = user1[i][j];
				System.out.println(a);
			}
		}
		
		//输出看看
		//这里输出的每个元素的值，就是这个元素的二维角标
		//可以想想学生时代学的xy坐标系，由xy两个值可以定位一个点
		showTwoArray(user1);
		
	}
	
	public static void showTwoArray(String[][] twoArr){
		for(int i=0;i<twoArr.length;i++){
			System.out.println(Arrays.toString(twoArr[i]));
		}
	}
}
