//Rule 13

package com.nt.arrays;

class A3{
	void m1(int... ia) {
		System.out.println("A int arg");
	}
}

class B3 extends A3{
	void m1(int... ia) {
		System.out.println("B int arg");
	}
}

public class Test3 {

	public static void main(String[] args) {
		B3 b1 = new B3();
		b1.m1();
		b1.m1(5);
	//	b1.m1(5L);
		
		System.out.println();
		
		A3 a1 = new B3();
		a1.m1();
		a1.m1(5);
	//	a1.m1(5L);

	}

}
