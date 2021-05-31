package com.nt.innerClass;

public class Example5 {
	static {
		System.out.println("Outer class is loaded");
	}
	static class A{
		static {
			System.out.println("Inner class is loaded");
		}
		public static void main(String[] args) {
			System.out.println("Inner class main method");
		}
	}

	public static void main(String[] args) {
		System.out.println("Outer class main method");

	}

}
