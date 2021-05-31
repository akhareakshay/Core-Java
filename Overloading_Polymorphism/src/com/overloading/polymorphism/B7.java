package com.overloading.polymorphism;

public class B7 extends A7 {
	void m1(Object obj) {
		System.out.println("B object arg");
	}
	void m1(String s) {
		System.out.println("B string arg");
	}
	void m1(Integer io) {
		System.out.println("B integer io");
	}

}
