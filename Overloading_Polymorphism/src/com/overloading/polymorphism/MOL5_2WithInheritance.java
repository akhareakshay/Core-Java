package com.overloading.polymorphism;

public class MOL5_2WithInheritance {

	public static void main(String[] args) {
		B3 b = new B3();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A3 a = new B3();
		a.m1(50);
		a.m1('a');
	//	a.m1(50L);

	}

}
