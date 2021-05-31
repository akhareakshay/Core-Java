package com.conOvrloading.polymorphism;

public class Example {
	
	public Example() {
		System.out.println("No arg Constructor");
	}
	Example(int a){
		System.out.println("int param Constructor");
	}
	Example(String s){
		System.out.println("String param Constructor");
	}

	public static void main(String[] args) {
		Example e1 = new Example();
		Example e2 = new Example(10);
		Example e3 = new Example("Akshay");
	}

}
