package test;

public class Student {
	
	//封装
	private String name = "天山童姥";
	
	
	//暴露出一个公共的方法去设置/获得
	public void setName(String g){
		name = g;
	}
	
	public String getName(){
		return name;
	}
	
	public void smile(){
		System.out.println("心里是乐开了花啊");
	}
	
	private void cry(){
		System.out.println("哭的像一个可怜的人儿");
	}
	
	protected void angry(){
		System.out.println("气的像一只dog");
	}
	
	String sad(){
		return "爱是一道光";
	}
	
	
	
	
}
