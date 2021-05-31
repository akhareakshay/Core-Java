package com.nt.innerClass;

public class Test2 {

	public static void main(String[] args) {
		A2 a1 = new A2();
		A2.B b1 = new A2.B();
		
		System.out.println(A2.a);
		System.out.println(A2.B.a);
		
		System.out.println(b1.x);
		System.out.println(b1.x);

	}

}
