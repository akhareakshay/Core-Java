package com.nt.innerClass;

public class localA2{
	static void m1() {
	// 	B b1 = new B();
		
		class B{
			int x = 10;
		}
		B b2 = new B();
	}
	public static void main(String[] args) {
		m1();
	}

}
