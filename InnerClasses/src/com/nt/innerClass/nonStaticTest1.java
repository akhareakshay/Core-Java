package com.nt.innerClass;

public class nonStaticTest1 {

	public static void main(String[] args) {
	//	B b = new B();
		nonStaticSample2.B b1 = new nonStaticSample2().new B();
		b1.m1();
		
		//Other ways of creation
		nonStaticSample2 s = new nonStaticSample2();
		nonStaticSample2.B b2 = s.new B();
		b2.m1();

	}

}
