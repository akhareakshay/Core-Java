package com.nt.innerClass;

public class A {
	int a = 10;
	
	
	class B {
		int a = 50;
	
		void m1() {
	
			System.out.println(a);
	
			System.out.println(this.a);
			System.out.println(A.this.a);
		}
		void m2() {
			int a = 65;
			System.out.println(a);
	
			System.out.println(this.a);
			System.out.println(A.this.a);
	}
	}

	void m3() {
		System.out.println(a);
		B b = new B();
		System.out.println(b.a);
	}
	public static void main(String[] args) {
		A a = new A();
		a.m3();
		A.B b = a.new B();
		b.m1();
		b.m2();

	}

}


