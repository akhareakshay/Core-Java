package com.codewithakshay;

public class Oprtn4_hashCodeTest {
	
	/*
	 * hashCode() implementation
	 */

	public static void main(String[] args) {

		String s1 = new String("a");
		String s2 = new String("a");
		String s3 = new String("abc");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println();

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println();

		String s4 = "b";
		String s5 = "b";

		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println();

		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println();

		Example e1 = new Example(5);
		Example e2 = new Example(5);
		Example e3 = new Example(6);

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println();

		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
		System.out.println();

		e1.x = 101;
		e2.x = 102;
		e3.x = 103;

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println();

		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
		System.out.println();

	}

}

class Example {
	int x;

	Example(int x) {
		this.x = x;
	}

	public int hashCode() {
		return x;
	}
}
