package com.lanou3g.study;

/**
 * Created by zyf on 2017/12/18.
 */
public class Test {
	private int c;

	public Test(int c) {
		this.c = c;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Test){
			Test t = (Test) obj;
			if (this.c == t.c){
				return true;
			}
		}
		return false;
	}
	private int a = 10;

	public static void main(String[] args) {
//		Test t1 = new Test(43);
//		Test t2 = new Test(43);
//		System.out.println(t1.equals(43));
		A a = new B();
		B b = new B();

		System.out.println(a.fun(100,50));
		System.out.println(b.fun(100,50));



	}


}

class A{
	public int fun(int a,int b){
		return a - b;
	}
}

class B extends A{
	public B(){
		super();
		System.out.println();

	}
	public int fun(int a,int b){
		return a + b;
	}
}

