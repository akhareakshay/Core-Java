package com.codewithakshay;

import java.util.Arrays;

public class Oprtn13_splitTest {

	/*
	 * split(String delim) returns the string[] it removes the given param and place
	 * comma(,) and then returns the string..
	 */

	public static void main(String[] args) {

		String str = "welcome to code with akshay";

		String[] split = str.split(" ");
		System.out.println(split.length);
		System.out.println(Arrays.toString(split));

		String strr = "Hello coders how are you ?";
		System.out.println(Arrays.toString(strr.split("o")));
		System.out.println();

	}

}
