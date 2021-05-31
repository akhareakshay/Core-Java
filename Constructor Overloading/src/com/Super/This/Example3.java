package com.Super.This;

public class Example3 {
	int x = m1();
	{
		System.out.println("NSB ");
	}
	int m1() {
		System.out.println("m1 : x");
		return 10;
	}
	
	public Example3() {
		this(10);
		x = 50;
		System.out.println("Example No arg Constructor");
	}
	Example3(int a){
		this("abc");
		x = 60;
		System.out.println("Example int param Constructor");
	}
	Example3(String s){
		x = 70;
		System.out.println("Example String param Constructor");
	}
	
	public static void main(String[] args) {
		Example3 e1 = new Example3();
		System.out.println("e1.x : "+e1.x);
		Example3 e2 = new Example3(10);
		System.out.println("e2.x : "+e2.x);
		Example3 e3 = new Example3("abc");
		System.out.println("e3.x : "+e3.x);
	}

}
