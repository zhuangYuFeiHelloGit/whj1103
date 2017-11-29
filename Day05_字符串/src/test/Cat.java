package test;

public class Cat {
	private String name;
	private Dog dog = new Dog();
	private int age;
	
	

	public String getName(){
		return name;
	}
	
	
	
	private String gender;
	public void setName(String n){
		
		name = n;
	}
	
	
	private String owner;
	private String ownerName(){
		return owner;
	}
	
	
}
