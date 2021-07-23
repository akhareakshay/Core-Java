package com.codewithakshay;

public class Oprtn12_substringTest {

	/*
	 * substring(int start) method Returns a string that is a substring of this
	 * string. The substring begins with the character at the specified index
	 * andextends to the end of this string.
	 * 
	 * substring(int start, int end) method Returns a string that is a substring of
	 * this string. The substring begins at the specified beginIndex and extends to
	 * the character at index endIndex - 1.Thus the length of the substring is
	 * endIndex-beginIndex.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String str = "welcome to codewithakshay";

		System.out.println(str.substring(4));
		System.out.println(str.substring(8, 21));

	}

}
