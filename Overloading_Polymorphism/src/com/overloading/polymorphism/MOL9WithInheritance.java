package com.overloading.polymorphism;

public class MOL9WithInheritance {

	public static void main(String[] args) {
		B8 b = new B8();
		b.m1("a");
		b.m1(50);
		System.out.println();
		A8 a = new B8();
		a.m1("a");
		a.m1(50);

	}

}
