import java.util.Scanner;

public class Main3 {

	public static void main(String[] args){
		/*
		 * 分析题意：
		 * 输入：肯定要用Scanner这个工具
		 * 循环5门课成绩：
		 * 		使用循环，循环条件应该会成功5次
		 * 每次输入一门课的成绩
		 */
		
		//快捷键导入工具：ctrl+1  然后回车
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入五门课成绩：");
		
		//定义一个变量，用来存储用户输入的值
		int sum = 0;
		for(int i = 1;i<=5;i++){
//			Scanner input = new Scanner(System.in);
			System.out.println("第"+i+"门：");
			
			//给提示后，就要接收用户的输入了
			//alt+shift+左右方向键可以选择一行内容
			//home键 end键 可以将光标移到行首或行尾
//			String content = input.nextLine();
			int content = input.nextInt();
			//sum = sum + content;
			sum+=content;
			System.out.println("第"+i+"门的成绩为："+content);
		}
		int averageValue = sum / 5;
		System.out.println("平均值为："+averageValue);
	}
}
