package homework;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入用户名");
		String username = input.nextLine();
		System.out.println("请输入密码");
		String password = input.nextLine();
		
		//1，匿名对象
		//2，接口的引用指向了其实现类对象
		UserInter ui = 
			new Login().login(username, password);
		
		if(ui != null){
			Person p = (Person) ui;

			System.out.println("当前登录用户："+p.getName()+"	职业为："+p.getJob());
			long currentTime = System.currentTimeMillis();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			String time = sdf.format(currentTime);
			System.out.println("当前系统时间为："+time);
			
			System.out.println("是否开始工作？1，是		2，否");
			
			int choice = input.nextInt();
			
			switch (choice) {
			case 1:
				ui.onLine();
				break;
			case 2:
				ui.offLine();
				break;

			default:
				System.out.println("不好意思，拜拜");
				break;
			}

		}
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
