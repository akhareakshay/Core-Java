package com.SuperWork.inheritance;

public class B4 extends A4 {
	static int a = 50;
	int x = 60;
	
	static void m1() {
		System.out.println("B class m1");
	}
	void m2() {
		System.out.println("B class m2");
	}

	public static void main(String[] args) {
		System.out.println("a : "+a);
		m1();
		
		B4 b = new B4();
		System.out.println("x : "+b.x);
		b.m2();
		b.m3();

	}

}
