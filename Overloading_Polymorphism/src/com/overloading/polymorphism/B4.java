package com.overloading.polymorphism;

public class B4 extends A4 {
	void m1(int a) {
		System.out.println("B int arg");
	}
	void m1(long l) {
		System.out.println("B long arg");
	}
	void m1(float f) {
		System.out.println("B float arg");
	}

}
