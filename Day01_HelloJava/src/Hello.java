
public class Hello {
	
	public static void main(String[] args){
		
		//我是注释
		
		/*
		 * 我是多行注释
		 */
		
		/**
		 * 我是文档注释
		 */
		
		System.out.println("第二个java程序");
		
		//定义一个变量
		//这个变量的值就是18
		
		//18是在内存中的，我们如果使用
		//内存地址去找18的话，太费劲了
		//所以我们使用一个变量去找到它
		//age就是变量名
		int age = 18;
		
		//下面这行代码，就会将括号中的内容
		//输出到控制台
		//输出的是18，不是age
		//因为会根据age这个变量，找到18这个值
		System.out.println(age);
		
		
		double score = 91.72;
		
		int increment = 2;
		
		double secondScore = 
				score + increment;
		
		int d = 1;
		long l = d;
		
		//强制转换：
		//将long类型的l强制转换成int类型的i
		//简称强转
		int i = (int) (l+2);
		
		//定义一个字符
		char c = 'a';
		
		//使用int类型的变量ic接收c的值
		int ic = c;
		
		System.out.println(ic);
		
		//字符串
		//一块羊肉是羊肉，
		//多块羊肉串起来就是羊肉串
		//多个字符串起来就是字符串
		String yourName = "儿童节";
		
		//初始化：就是给一个变量赋值的过程
		//如果只创建了变量，但是没有给这个变量赋值
		//那么这个过程叫声明
		String myName;//这就是声明
		
		myName = "小王";
		System.out.println(yourName);
		
		
		float f = 1.98989898989898f;
		float f2 = 22424.23425425f;
		double d1 = 23.23424325325346476;
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d1);
		
		
		int big = 5;
		/*
		 * big是int类型
		 * 2也是int类型
		 * 所以big/2得到的也就是int类型
		 * 就会将2.5取整，得到2
		 * 
		 * big是int类型
		 * 2.0是浮点型
		 * 这时候big/2.0得到的就是带
		 * 小数点的浮点型
		 * 也就是2.5
		 */
		double result = big / 2.0;
		System.out.println(result);
		
		
		int high = 180;
		System.out.println(high);
		
		//让high这个变量，自增
		//自加1
		//效果等同：high = high + 1;
		
//		high++;//181
//		++high;//182
		
		
		/*
		 * ++在前，是先自加，再使用
		 * ++在后，是先使用，再自加
		 */
		System.out.println(high++);
		
		int i1 = 5;
		int i2 = 10;
		int y1 = 20;
		int y2 = 40;
		
		int r = i1++ + --i2 + ++y1 + y2--;
		
		boolean b = true;
		boolean bo = false;
		
		//布尔类型
		System.out.println(r == i1);		
//		System.out.println(2 = 6);
		System.out.println(i2);
		System.out.println(y1);
		System.out.println(y2);
		
		

	}
	
	
	
}
