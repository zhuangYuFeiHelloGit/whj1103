package com.lanou3g.change;

public class Main {

	public static void main(String[] args) {
		//父类的引用指向了子类的对象
		KongFu kf = new 跆拳道();
		
//		kf = new 象形拳();
		
		//父类的引用，只能找到父类的方法
		//找不到子类独有的方法
		kf.prepare();
		
		if(kf instanceof 跆拳道){
			//如果kf这个引用指向的对象类型为跆拳道
			//那么我们可以进行强制类型转换
			
			//()中写的就是要强转的类型
			跆拳道 泰森 = (跆拳道)kf;
			泰森.侧踢();
		}
		
		
		
		
	}

}
