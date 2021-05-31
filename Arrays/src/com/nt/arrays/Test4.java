//Rule 15

package com.nt.arrays;

class A4{
	void m1(int... ia) {
		System.out.println("A int arg");
	}
}

class B4 extends A4{
	void m1(int[] ia) { 
		System.out.println("B int arary");
	}
}

public class Test4 {

	public static void main(String[] args) {
		B4 b1 = new B4();
//		b1.m1();
//		b1.m1(5);
		b1.m1(new int[] {5});
		
		System.out.println();
		
		A4 a1 = new B4();
		a1.m1();
		a1.m1(5);
		a1.m1(new int[] {5});

	}

}
