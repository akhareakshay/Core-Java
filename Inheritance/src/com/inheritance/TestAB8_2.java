package com.inheritance;

public class TestAB8_2 {

	public static void main(String[] args) {
		B8 b = new B8();
		A8 a = b;
		
		System.out.println("a : "+b.a);
		System.out.println("a : "+a.a);
		
		System.out.println("x : "+b.y);
		System.out.println("x : "+a.y);
	}

}
