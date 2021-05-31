package com.overloading.polymorphism;

class A10 {
	int x = m1();
	static int m1() {
		System.out.println("A m1");
		return 50;
	}
}
class B10 extends A10 {
	int y = m1();
	static int m1() {
		System.out.println("B m1");
		return 60;
	}
}

public class TestAB1 {

	public static void main(String[] args) {
		B10 b = new B10();
		System.out.println("x : "+b.x);
		System.out.println("y : "+b.y);

	}

}
