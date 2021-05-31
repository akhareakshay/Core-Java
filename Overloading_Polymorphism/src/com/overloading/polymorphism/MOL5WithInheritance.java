package com.overloading.polymorphism;

public class MOL5WithInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A a = new B();
		a.m1(50);
		a.m1('a');
	//	a.m1(50L);

	}

}
