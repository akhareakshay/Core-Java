//Rule 16

package com.nt.arrays;

class A5{
	void m1(int[] ia) {
		System.out.println("A int array");
	}
}

class B5 extends A5{
	void m1(int... ia) {
		System.out.println("B int arg");
	}
}

public class Test5 {

	public static void main(String[] args) {
		B5 b1 = new B5();
		b1.m1();
		b1.m1(5);
		b1.m1(new int[] {5});
		
		System.out.println();
		
		A5 a1 = new B5();
		a1.m1();
		a1.m1(5);
		a1.m1(new int[] {5});

	}

}
