package com.nt.innerClass;

public class nonStaticTest {

	public static void main(String[] args) {
		nonStaticA a = new nonStaticA();
		a.m3();
		
		nonStaticA.B b = new nonStaticA().new B();
		b.m1();
		b.m2();

	}

}
