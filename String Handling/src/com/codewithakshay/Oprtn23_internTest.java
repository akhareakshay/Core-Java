package com.codewithakshay;

public class Oprtn23_internTest {
	
	/*
	 * intern() method stores object in string pool
	 */

	public static void main(String[] args) {

		String s = "Akshay";
		String intern = s.intern();
		System.out.println(s.hashCode());
		System.out.println(intern.hashCode());
		System.out.println(s == intern);

	}

}
