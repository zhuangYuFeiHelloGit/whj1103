import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		
		int[] scores = 
			{98,99,94,56,87};
		/*
		 * scores就是标识符，是这个数组的名字
		 * int表示这个数组中可以装载的类型
		 * int[] 表示这个数组的类型
		 * 
		 * {}中的内容，就是数组的内容
		 * 98：数组中的元素，就是数组中的内容
		 * 下标：
		 * 		元素在数组中的位置，
		 * 		从0开始计数。
		 * 数组中最后一个元素的下标：
		 * 		数组长度-1
		 */
		
		//取出数组中下标为0的元素
		//赋值给一个变量b
		int b = scores[0];
//		int a = 98;
		
		System.out.println(b);
		
		//创建数组的第二种方式
		//死记硬背记住了就行
		int[] d = new int[3];
		
		Scanner input = 
			new Scanner(System.in);
		//d.length：表示数组d的长度
		
		for(int i=0;i<d.length;i++){
			//接收输入进来的数值
			//赋值给r
//			int r = input.nextInt();
			
			//把r的值赋值给数组中第i位置的元素
//			d[i] = r;
			
			System.out.println("请录入第"+i+"个成绩：");
			d[i] = input.nextInt();
		}
		
		//固定写法可以直接输出d的内容
		System.out.println(Arrays.toString(d));
		
		d[4] = 100;
		
		
	}
}
