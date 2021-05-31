package com.nt.innerClass;

public class nonStaticSample2 {
	class B{
		void m1() {
			System.out.println("B m1");
		}
	}
	 void m2() {
		B b = new B();
		b.m1();
	}
	 public static void main(String args[]) {
		// B b = new B();
		 nonStaticSample2.B b = new nonStaticSample2().new B();
		 b.m1();
	 }

}
