package com.codewithakshay;

public class Oprtn6_compareTo {
	
	/*
	 * compareTo() compares given string lexicographically
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";
		String s3 = "A";

		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println();
		
		
		String s4="akshay";
		String s5="AKSHAY";
		System.out.println(s4.equals(s5));
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareToIgnoreCase(s5));

	}

}
