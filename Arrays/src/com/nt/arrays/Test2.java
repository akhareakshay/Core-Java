//Rule 13

package com.nt.arrays;

class A2{
	void m1(long... ia) {
		System.out.println("A long arg");
	}
}

class B2 extends A2{
	void m1(int... ia) {
		System.out.println("B int arg");
	}
}

public class Test2 {

	public static void main(String[] args) {
		B2 b1 = new B2();
		b1.m1();
		b1.m1(5);
		b1.m1(5L);
		
		System.out.println();
		
		A2 a1 = new B2();
		a1.m1();
		a1.m1(5);
		a1.m1(5L);

	}

}
