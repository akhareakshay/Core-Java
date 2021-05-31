package com.nt.innerClass;

public class A2 {
	static int a = 10;
	int x = 20;
	
	static class B{
		static int a = 50;
		int x = 60;
		
		void m1() {
			System.out.println(a); 
			System.out.println(x);
			
			A2 a = new A2();
			System.out.println(A2.a);
			System.out.println(a.x);
		}
	}
	
	void m2() {
		System.out.println(a);
		System.out.println(x);
		
		B b = new B();
		System.out.println(B.a);
		System.out.println(b.x);
	}

	public static void main(String[] args) {
		A2 a = new A2();
		a.m2();
		
		B b = new B();
		b.m1();

	}

}
