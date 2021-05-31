package com.nt.chaining;

public class SuperClass {
	public SuperClass() {
		this(10);
		System.out.println("Super Class no arg constructor");
	}
	SuperClass(int a){
		this("abc");
		System.out.println("super class int arg constructor");
	}
	SuperClass(String s){
		System.out.println("super class string arg constructor");
	}

}
