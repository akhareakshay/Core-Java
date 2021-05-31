package com.nt.innerClass;

public class nonStaticA {
	int x = 20;
	
	class B{
		int x = 50;
		
		void m1() {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(nonStaticA.this.x);
		}

		void m2() {
			int x = 60;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(nonStaticA.this.x);
			
		}
	}
	void m3() {
		System.out.println(x);
		B b = new B();
		System.out.println(b.x);
	}
	
	public static void main(String[] args) {
		nonStaticA a = new nonStaticA();
		a.m3();
		
		nonStaticA.B b = new nonStaticA().new B();
		b.m1();
		b.m2();

	}

}
