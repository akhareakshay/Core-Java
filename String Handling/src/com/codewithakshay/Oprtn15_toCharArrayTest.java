package com.codewithakshay;

import java.util.Arrays;

public class Oprtn15_toCharArrayTest {

	/*
	 * toCharArray() method returns and convert the given string into char[]
	 */

	public static void main(String[] args) {

		String s = "Akshay";

		System.out.println("Given String : " + s);
		char[] toChar = s.toCharArray();
		System.out.println("String After Converting into char[] : " + Arrays.toString(toChar));

	}

}
