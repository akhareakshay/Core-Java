package com.overloading.polymorphism;

public class MOL8WithInheritance {

	public static void main(String[] args) {
		B7 b = new B7();
		b.m1("a");
		b.m1(50);
		System.out.println();
		A7 a = new B7();
		a.m1("a");
		a.m1(50);

	}

}
