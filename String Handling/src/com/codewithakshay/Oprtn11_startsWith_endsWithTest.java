package com.codewithakshay;

public class Oprtn11_startsWith_endsWithTest {

	/*
	 * startsWith(String s) returns true if the given param string is available at
	 * the starting position in the string
	 * 
	 * endsWith(String s) returns true if the given param string is avaialble at the
	 * ending position in the string
	 */

	public static void main(String[] args) {

		String str = "welcome to codewithakshay";

		System.out.println(str.startsWith("wel"));// true
		System.out.println(str.startsWith("come"));// false

		System.out.println(str.endsWith("akshay"));// true
		System.out.println(str.endsWith("aks")); // false

	}

}
