import java.util.Scanner;

public class Main2 {
	public static void main(String[] args){
		
		//System.out.println("1");
		
		/*
		 * while循环
		 * 先判断括号中的内容，是否为true
		 * 如果为true则执行
		 * 大括号里面的内容，然后
		 * 		再判断括号里面的内容是否为true，
		 * 		如果.....一遍遍
		 * 			当括号内容为false时
		 * 			while循环停止
		 */
		
		int i = 51;
		while(i < 50){
			//小括号中的内容叫循环条件
			//大括号中的内容叫循环体
			System.out.println(i);
			
			//循环增量
			//为了跳出循环，防止出现死循环
			//i = i + 1;
			//i++;
			//++i;
			//i = i * 7;
			i*=7;
//			i-=7;
//			i+=4;
//			i/=6;
		}
		
		int progress = 1;
		
		do{
//			System.out.println(progress);
			progress+=2;
		}while(progress > 10);
		
		
		/* do-while与while的区别
		 * do-while是先执行一次循环体，然后在
		 * 判断
		 * 
		 * while是先判断然后在执行循环体
		 */
		
		
		/*
		 * int k = 0;设置初始条件
		 * k<100;循环条件
		 * k++;循环增量
		 * {}中的内容：循环体
		 */
		for(int k = 100;k<100;k++){
			System.out.println("好好学习，天天向上!");
		}
		//下面这俩是一样的
		//for(;;){
			
		//}
		//while(true){
			
		//}
		
		int f = 0;
		for(;f<10;f++){
			
		}
		
		for(;f<10;f+=5){
			
		}
		
		//固定格式，就是一个工具
		Scanner input 
			= new Scanner(System.in);
		//下面这句话，会得到控制台输入的内容
		//我们建立一个变量去接收得到的内容
		System.out.println("阻塞之前");
		String c = input.nextLine();
		
		System.out.println("我们得到了c："+c);
		
		/*
		 * import
		 * Scanner
		 * Console
		 * Debug
		 * 阻塞式
		 */
		
//		while(true){
//			String result = input.nextLine();
//			System.out.println("输入了："+result);
//		}
		
		
	}
}




