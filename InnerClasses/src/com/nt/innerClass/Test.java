package com.nt.innerClass;

public class Test {

	public static void main(String[] args) {
		A a1 = new A();
		A.B b1 = new A.B();
		
		System.out.println(A.a);
		System.out.println(A.B.a);
		System.out.println(b1.x);
		System.out.println(b1.x);
		

	}

}
