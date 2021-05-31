//Rule 13

package com.nt.arrays;

class A1{
	void m1(int... ia) {
		System.out.println("A int arg");
	}
}

class B1 extends A1{
	void m1(long... ia) {
		System.out.println("B long arg");
	}
}

public class Test1 {

	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.m1();
		b1.m1(5);
		b1.m1(5L);
		
		System.out.println();
		
		A1 a1 = new B1();
		a1.m1();
		a1.m1(5);
	//	a1.m1(5L);

	}

}
