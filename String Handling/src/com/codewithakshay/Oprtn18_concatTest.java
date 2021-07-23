package com.codewithakshay;

public class Oprtn18_concatTest {

	/*
	 * concat() method is used to concats the given string objects..
	 * 
	 * when we concats the numbers and strings.. that time, if first first and
	 * second operand is int, then its additions will happen.. if first operand is
	 * int/string and second operand is string/int then directly it will concat...
	 * into string.. no addition
	 */

	public static void main(String[] args) {

		String s1 = "Akshay";
		String concat = s1.concat("Akhare");
		System.out.println(s1);
		System.out.println(concat);

		System.out.println(1 + s1);
		System.out.println(1 + 2 + s1);
		System.out.println(1 + 2 + s1 + 3 + 4);
		System.out.println((1 + 2) + s1 + (3 + 4));
		System.out.println(1 + 2 + 3 + s1 + 3 + 2 + 1);
		System.out.println(1 + 2 + 3 + s1 + (3 + 2 + 1));
		System.out.println(1 + 2 + 3 + s1 + 3 + (2 + 1));
		System.out.println((1 + 2) + 3 + s1 + 3 + 2 + 1);
		System.out.println(s1 + 1 + 2);

	}

}
