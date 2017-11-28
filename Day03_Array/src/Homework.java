
public class Homework {
	public static void main(String[] args){
		int money = 189;
		
		int hundred = 189/100;//得到几个100
		int r1 = 189%100;//得到89
		int fifty = r1/50;//得到几个50
		int r2 = r1%50;//得到39
		int twenty = r2/20;//得到几个20
		int r3 = r2%20;//得到19
		int ten = r3/10;//得到几个10
		int r4 = r3%10;//得到9
		int five = r4/5;//得到几个5
		int r5 = r4%5;//得到4
		int one = r5/1;//得到几个1
		
		
//		System.out.println(hundred);
//		System.out.println(fifty);
//		System.out.println(twenty);
//		System.out.println(ten);
//		System.out.println(five);
//		System.out.println(one);
		
		/*
		 * 第二题，判断奇数偶数
		 */
		
		int m = 7;
		
		if(m % 2 == 0){
			//整除2则为偶数
			System.out.println("m是偶数");
		}else{
			System.out.println("m是奇数");
		}
		
		/*
		 * 第三题，行李相关
		 */
		int weight = 50;
		
		if(weight <= 50){
			System.out.println("这批货值："+weight*0.15);
		}else{
			double price = (weight - 50)*0.25 + 50 * 0.15;
			System.out.println("价格为："+price);
		}
		
		/*
		 * 第四题：闰年与否
		 */
		int year = 2000;
		
		if((year % 4 == 0 && year % 100 !=0) || year % 400 ==0){
			System.out.println(year+"年是闰年");
		}else{
			System.out.println("sorry");
		}
		
		
		
		
		
	}
}
