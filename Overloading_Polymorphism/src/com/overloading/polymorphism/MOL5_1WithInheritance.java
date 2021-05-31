package com.overloading.polymorphism;

public class MOL5_1WithInheritance {

	public static void main(String[] args) {
		B2 b = new B2();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A2 a = new B2();
		a.m1(50);
		a.m1('a');
	//	a.m1(50L);

	}

}
