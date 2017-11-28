import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		/* 有四个班级，每个班级有5名同学
		 * 所以一个每个班级都要循环一次
		 * 		在这个班级的循环中
		 * 			再循环接收每名同学的成绩
		 */
		
		//第一层循环，每次循环都表示一个班级
		for(int i=1;i<5;i++){
			//第二层循环，每次循环都表示要
			//接收一个学生的成绩
			
			//用于存储班级成绩的变量
			int classScore = 0;
			for(int j=1;j<6;j++){
				//当两层循环都执行完毕时
				//下面的输出语句执行了多少次？
				System.out.println("请输入第"+i+"班的第"+j+"位同学的成绩：");
				int score = 
						input.nextInt();
				//怎么能把接收到的成绩保存起来，
				//用于求班级平均分？
				classScore = classScore + score;
			}
			System.out.println("第"+i
						+"班的平均分为："
						+(classScore/5));
			System.out.print("1 * 1= 1");

			System.out.print("1 * 2= 2");
			System.out.print("2 * 2= 4");
			
		}
		
		
		
		
	}
}
