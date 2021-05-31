package com.overloading.polymorphism;

class A12 {
	static int x = m1();
	static int m1() {
		System.out.println("A m1");
		x = 50;
		return 60;
	}
}
class B12 extends A12 {
	static int x;
	static int m1() {
		System.out.println("B m1");
		x = 70; 
		return 80;
	}
}

public class TestAB3 {

	public static void main(String[] args) {
		B12 b = new B12();
		A12 a = b;
		System.out.println("x : "+b.x);
		System.out.println("x : "+a.x);

	}

}
