package com.nt.innerClass;

public class Example4 {
	static class A4{
		private int y = 320;
		static void m1() {
			System.out.println("inner class Static method m1");
		}
		public void m2() {
			System.out.println("inner class Non static method m2");
		}
		
	}
	public static void main(String[] args) {
		A4.m1();
		A4 a = new A4();
		System.out.println(a.y);
		a.m2();
	}

}
