package com.codewithakshay;

public class Oprtn22_trimTest {

	/*
	 * trim() method removes leading and trailing spaces..
	 */

	public static void main(String[] args) {

		String s1 = "			abc abc     ";
		System.out.println("Original String : " + s1);
		System.out.println("length : " + s1.length());
		String trim = s1.trim();
		System.out.println(trim);
		System.out.println("after trime string legth : " + trim.length());

	}

}
