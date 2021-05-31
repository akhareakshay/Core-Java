package com.Super.This;

public class Example2 {
	
	public Example2() {
		this(10);
		System.out.println("Example No arg Constructor");
	}
	Example2(int a){
		this("abc");
		System.out.println("Example int param Constructor");
	}
	Example2(String s){
		System.out.println("Example String param Constructor");
	}
	
	public static void main(String[] args) {
		Example2 e1 = new Example2();
		System.out.println();
		Example2 e2 = new Example2(10);
		System.out.println();
		Example2 e3 = new Example2("abc");
	}

}
