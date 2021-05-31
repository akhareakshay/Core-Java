package com.overloading.polymorphism;

public class MOL7WithInheritance {

	public static void main(String[] args) {
		B4 b = new B4();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A4 a = new B4();
		a.m1(50);
		a.m1('a');
		a.m1(50L);

	}

}
