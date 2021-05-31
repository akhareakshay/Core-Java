package com.overloading.polymorphism;

class A9 {
	int x = m1();
	int m1() {
		System.out.println("A m1");
		return 50;
	}
}
class B9 extends A9 {
	int y = m1();
	int m1() {
		System.out.println("B m1");
		return 60;
	}
}

public class TestAB {

	public static void main(String[] args) {
		B9 b = new B9();
		System.out.println("x : "+b.x);
		System.out.println("y : "+b.y);

	}

}
