import java.util.Scanner;

public class Main6Practice {
	public static void main(String[] args) {
		int[] scores = new int[5];
		
		Scanner input = new Scanner(System.in);
		int max = 0;
		for(int i=0;i<scores.length;i++){
			int r = input.nextInt();
			if(r > max){
				max = r;
			}
			scores[i] = r;
		}
		System.out.println("最大值为："+max);
		
		
		
	}
}
