package com.nt.innerClass;

public class localAFinalProg {
	static int a = 10;
	int b = 10;
	
	static void m1(final int c, int d) {
		final int e = 10;
		int f = 10;
		
		class B{
			void m1() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
				
			}
		}
		void m2() {
			class C{
				void m2() {
					System.out.println(a);
					System.out.println(b);
				}
			}
		}
	}

	public static void main(String[] args) {
		localAFinalProg a1 = new localAFinalProg();
		a1.a = 5;
		a1.b = 6;
		a1.m1();
		a1.m2();
		
		localAFinalProg a2 = new localAFinalProg();
		a2.a = 7;
		a2.b = 8;
		a2.m1();
		a2.m2();
	}

}
