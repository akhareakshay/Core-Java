package com.nt.innerClass;

public class nonStaticExample1 {
	static int a = 10;
	int x = 20;
	private int y = 30;

	class A { 
		void m1() {
			System.out.println(a);
			System.out.println(x);
			System.out.println(y);
		}
		

	}

}
