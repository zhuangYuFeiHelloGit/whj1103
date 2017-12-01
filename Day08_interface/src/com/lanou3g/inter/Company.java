package com.lanou3g.inter;

public class Company {
	
	
	//Work是一个接口
	//这里就是创建了一个接口的引用
	private Work work;
	
	public void setWork(Work work){
		this.work = work;
	}
	
	public void startWork(){
		//work这个接口的引用
		//会指向一个实现类对象
		//这里就是调用这个实现类对象的work方法
		this.work.work();
	}
	
	
	public void endWork(){
		this.work.goHome();
	}
	
	
	
	
	
	

}
