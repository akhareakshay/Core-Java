package com.overloading.polymorphism;

public class B8 extends A8 {
	void m1(Object obj) {
		System.out.println("B object arg");
	}
	void m1(String s) {
		System.out.println("B string arg");
	}

}
