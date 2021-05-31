package com.nt.innerClass;

public class localAObjectClassProblem {
	Object m1() {
		class B{
			void m3() {
				System.out.println("B m3");
			}
		}
		B b = new B();
		
		m2(b);
		return b;
	}
	
	void m2(Object obj) {
		obj.m3();
	}

}
