package com.nt.innerClass;

public class Example6 {
	static {
		System.out.println("Outer class is loaded");
	}

	public Example6() {
		System.out.println("Outer class Constructor");
	}

	static class A {
		static {
			System.out.println("Inner class is loaded");
		}

		public A() {
			System.out.println("Inner class Constructor");
		}

		static void m1() {
			System.out.println("Inner class Static method");
		}

		void m2() {
			System.out.println("Inner class Non static method");
		}

		public static void main(String[] args) {
			System.out.println("inner class main method");
			Example6.m1();
			Example6 e = new Example6();
			e.m1();

		}

	}

	static void m3() {
		System.out.println("Outer class static method");
	}

	void m4() {
		System.out.println("Outer class non static method");
	}

	public static void main(String[] args) {
		System.out.println("Outer class main method");
		A.m3();
		A a = new A();
		a.m4();

	}

}
