package com.polymorphism;

public class Sample4 extends Example4 {
	static void m1() {
		System.out.println("Sample m1");
	}
	void m2() {
		System.out.println("Sample m2");
	}
	void m4(String s) {
		System.out.println("Sample m4(string param)");
	}

	public static void main(String[] args) {
		Sample4 s = new Sample4();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m4("Akshay");
		
		Example4 e = new Sample4();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
	//	e.m4("Akshay");


	}

}
