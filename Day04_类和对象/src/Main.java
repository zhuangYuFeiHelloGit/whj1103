
public class Main {
	public static void main(
			String[] args){
		
		//这就是创建对象的过程
		//然后我们来说一下什么是对象
		Car car = new Car();
		
		//这里是将car的地址传给了c2
		Car c2 = car;
		c2.showInfo();
		
		//Car就是类
		//car就是对象，
		//是根据Car这个类创建出来的
		
	
//		car.showInfo();
		System.out.println(car == c2);
		
	}
}
