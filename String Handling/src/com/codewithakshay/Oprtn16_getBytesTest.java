package com.codewithakshay;

import java.util.Arrays;

public class Oprtn16_getBytesTest {

	/*
	 * getBytes() method converts and returns the given string into byte[]
	 */

	public static void main(String[] args) {

		String s = "Akshay";

		System.out.println("Given String : " + s);

		byte[] toBytes = s.getBytes();
		System.out.println(Arrays.toString(toBytes));

	}

}
