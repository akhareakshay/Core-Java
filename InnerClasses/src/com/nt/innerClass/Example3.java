package com.nt.innerClass;

public class Example3 {
	int x = 10;
	
	static class A3{
		static void m1() {
			A3 a = new A3();
	//		System.out.println(a.x);
			
			Example3 e = new Example3();
			System.out.println(e.x);
		}
	}

}
