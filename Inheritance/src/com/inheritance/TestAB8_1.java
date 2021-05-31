package com.inheritance;

public class TestAB8_1 {

	public static void main(String[] args) {
		B8 b = new B8();
		A8 a = new A8();
		
		System.out.println(b.a+"......."+b.y);
		System.out.println(a.a+"......."+a.y);
		System.out.println(B8.a+"......"+A8.a);
		
		b.a = 5;
		a.a = 6;
		
		System.out.println(b.a+"......."+b.y);
		System.out.println(a.a+"......."+a.y);
		System.out.println(B8.a+"......"+A8.a);
	}

}
