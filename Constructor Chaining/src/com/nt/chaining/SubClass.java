package com.nt.chaining;

public class SubClass extends SuperClass {
	public SubClass() {
		this(10);
		System.out.println("subclass no arg constructor");
	}
	SubClass(int a){
		this("abc");
		System.out.println("subclass int arg constructro");
	}
	SubClass(String s){
		System.out.println("subclass string arg");
	}

}
