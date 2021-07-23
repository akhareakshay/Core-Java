package com.codewithakshay;

public class Oprtn5_equalsTest {

	/*
	 * equals() and equalsIgnoreCase() method Implementation
	 * 
	 * equals() method checks whether the content is same or not
	 * 
	 * == operator checks whether the reference is same or not
	 * 
	 * equalsIgnoreCase() method ignores the case.. it just checks the data without
	 * case
	 */

	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		String s4 = new String("a");

		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");

		System.out.println(s1 == s2); // false
		System.out.println(s3 == s4); // false
		System.out.println(sb1 == sb2); // false
		System.out.println();

		System.out.println(s1.equals(s2)); // true
		System.out.println(s3.equals(s4)); // true
		System.out.println(sb1.equals(sb2)); // true
		System.out.println();

		String s5 = "a";
		String s6 = "A";

		System.out.println(s5 == s6); // false
		System.out.println(s5.equals(s6)); // false
		System.out.println(s5.equalsIgnoreCase(s6)); // trye

	}

}
