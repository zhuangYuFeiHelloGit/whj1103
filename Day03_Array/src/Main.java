import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = 
				new Scanner(System.in);
		
		int sum = input.nextInt();
		
		//将输入进来的数值，作为循环的判断条件
		for(int i = 0;i<=sum;i++){
			/*
			 * 0+6=6		i+sum=sum
			 * 1+5=6		i+sum=sum
			 * 2+4=6		i+(sum-i)=sum
			 */
			
//			System.out.println(i+"+"+(sum-i)+"="+sum);
		}
		
		for(int i=0,j=sum;i<=sum && j>8;i++,j--){
//			System.out.println(i+"+"+j+"="+sum);
		}
		
		for(int i=0;i<0;i++){
			//循环接收成绩
			int score = 
					input.nextInt();
			//做一个判断是否为负
			if(score < 0){
				System.out.println("不好意思我蹦了");
				//使用break语句跳出循环
				break;
			}
		}
		
		int people = 0;
		for(int i=0;i<10;i++){
			/*
			 * 循环输入成绩，
			 * 如果成绩大于80分，
			 * 则计入人数people中
			 */
			int score = 
					input.nextInt();
			if(score < 80){
				continue;
			}
			people++;
		}
		
		System.out.println("八十分以上的人有："+people);
		
	}
}
