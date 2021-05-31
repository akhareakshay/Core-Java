package com.overloading.polymorphism;

class A11 {
	int x = m1();
	int m1() {
		System.out.println("A m1");
		x = 50;
		return 60;
	}
}
class B11 extends A11 {
	int x;
	int m1() {
		System.out.println("B m1");
		x = 70; 
		return 80;
	}
}

public class TestAB2 {

	public static void main(String[] args) {
		B11 b = new B11();
		A11 a = b;
		System.out.println("x : "+b.x);
		System.out.println("x : "+a.x);

	}

}
