
public class Main {
	
	public static final int g = 10;
	public static final int h = 11;
	
	public static void main(String[] args){
		
		//定义一个变量，表示你的java成绩
		int javaScore = 90;
		
		if(javaScore > 90){
			System.out.println("成绩优秀");
		}
		
		if(javaScore > 700){
			System.out.println("厉害了厉害了，你跳级把");
		}else{
			System.out.println("不好意思，再多学一遍把");
		}
		
		//当要执行的语句只有一条时
		//if语句后面可以不写{}
		if(javaScore < 60)
			System.out.println("gg了兄弟，拉倒吧");
		
		//当成绩大于80并且小于100的时候
		//会进入{}中执行语句
		//同时成立则执行
		
		//&&：当左侧判断条件不成立时，
				//不会判断右侧条件
		//&：当左侧判断条件不成立时，
				//依然会判断右侧条件
		if(--javaScore > 90 
				&
				--javaScore < 100){
			
			System.out.println("这就比较厉害了");
		}
		System.out.println("javaScore:"+javaScore);
		
		//		||和|
		
		if(javaScore > 60 || javaScore < 90){
			//左右的表达式，只要有一个为true
			//那么if判断的结果就是true
			//||和|的区别
			//||：如果左侧为true，则不会判断右侧
			//|：不管左侧是什么，都会判断右侧
		}
		
		//!：非 !true = false
		//		!false = true
		if(!(javaScore < 60)){
			System.out.println("说明》=60");
		}
		
		//如何交换两个变量的值？
		int a = 10;
		int b = 20;
		
		//第一种方法
		//1，定义一个新的变量c
		//2，将a的值赋值给c
		//3，将b的值赋值给a
		//4，将c的值赋值给b
		
		//把馒头给c
		int c = a;
		
		//把包子给a
		a = b;
		
		//把馒头给b
		b = c;
		
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
		//第二种方法
		//不使用第三方变量，直接使用加减法运算
		
		
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
		//第三种方法
		//不使用第三方变量，使用异或^
		//一个数异或另一个数两次，结果还是这个数
		//    5^6^6 = 5
		/*
		 * |操作二进制
		 * 有一个是1，则结果就是1
		 * 
		 * ^异或操作二进制
		 * 两者不相等，则为1，相等则为0
		 * 也就是不同时为1或0
		 */
		System.out.println(26^23);
		/* 26的二进制是多少？
		 * 0
		 * 1
		 * 0
		 * 1
		 * 1
		 * 11010 26
		 * 10111 23
		 * 01101 13
		 * 11010
		 * 1+0+4+8 = 13
		 * 
		 * 
		 * 	  11	
		 * ------
		 * 11010
		 */
		//假设a原本 = 26
		//假设b原本 = 23
	
			
		a = a ^ b;//a = 13
		//a = 13 b = 23
		b = a ^ b;//26
		// a = 13 b = 26
		a = a ^ b;//23
		
		//a = 23 b = 26

		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
		//else if(){}
		
		int score = 90;
		
		if(score >= 80){
			System.out.println("成绩优秀");
		}else if(score >= 60){
			System.out.println("成绩及格");
		}else{
			System.out.println("成绩不及格");
		}
		
		
		//一秒跑十五米
		int speed = 15;
		
		//1表示男，0表示女
		int gender = 3;
		
		if(speed > 10){
			//说明跑100米用不上10秒
			System.out.println("进决赛");
			
			if(gender == 0){
				System.out.println("进入女生组");
			}else if(gender == 1){
				System.out.println("进入男生组");
			}else{
				System.out.println("人妖太猛了，pass");
			}
			
			int n = 4;
			switch(n){
			default:
				System.out.println("我是默认值");
				break;
			case 2:
				//如果switch后面的括号中的内容
				//等于2的话，那么就执行下面的语句
				System.out.println("没错，是2");
				break;
			case 3:
				System.out.println("没错，是3");
				break;
			}
			
			//也支持字符型
			char ch = 'a';
			switch(ch){
			case 'a':
				break;
			case 'b':
				break;
			}
			
			
			
			
			
		}
		
		
	}
}
