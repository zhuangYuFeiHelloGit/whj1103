
public class Hero {
	String name;
	String country;
	String race;
	String gender;
	
	//没有参数，没有返回值的方法
	public void choiced(){
		System.out.println(name+"被选择了");
	}
	
	public void playWith(String n){
		System.out.println(name+"和"+n+"去玩了");
	}
	
	public String getMessage(){
		return "姓名："+name+" 国家："+country;
	}
	
	public int add(int a,int b){
		return a * b;
	}
	
	
	public void doSomething(Hero h){
		System.out.println(
				name+"和"
				+h.name+"正在做某些事情");
	}
	
	
	
	
	
	
	
	
	
	
	
}
