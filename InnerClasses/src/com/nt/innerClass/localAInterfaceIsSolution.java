package com.nt.innerClass;

interface Example0 {
	void m3();
}

public class localAInterfaceIsSolution {
	Example0 m1() {
		class B implements Example0 {
			public void m3() {
				System.out.println("B m3");
			}
		}
		B b = new B();

		m2(b);
		return b;
	}

	void m2(Example0 e) {
		e.m3();
	}

}
