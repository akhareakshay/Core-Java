package com.codewithakshay;

public class Oprtn7_contentEqualsTest {

	/*
	 * contentEquals(StringBuffer sb) avail from 1.4
	 * 
	 * contentEquals(charSequence cs) avail from 1.5
	 * 
	 * contentEquals() checks the given string data whether is is equal or not..
	 * 
	 */

	public static void main(String[] args) {

		String s1 = new String("a");
		String s2 = new String("a");
		StringBuffer sb1 = new StringBuffer("a");

		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println();

		System.out.println(s1.equals(sb1));
		System.out.println(s1.contentEquals(sb1));

		/*
		 * System.out.println(sb1.contentEquals(s1)); // method not available in
		 * Stringbuffer System.out.println(s1 == sb1); //Incompatible operand types
		 * String and StringBuffer
		 */
	}

}
