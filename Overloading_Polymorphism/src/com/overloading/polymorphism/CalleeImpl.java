package com.overloading.polymorphism;

public class CalleeImpl {
	public void foo(Object o) {
		System.out.println("Object parameter");
	}
	public void food(String st) {
		System.out.println("String parameter");
	}
	public void foo(Integer i) {
		System.out.println("Integer parameter");
	}

}
