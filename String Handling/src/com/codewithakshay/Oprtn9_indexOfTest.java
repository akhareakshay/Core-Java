package com.codewithakshay;

public class Oprtn9_indexOfTest {

	/*
	 * indexOf(char ch) returns the character present at given index
	 * 
	 * indexOf(char ch, int fromIndex) returns the character from specific index
	 * 
	 * lastIndexOf(char ch) returns the character at given index from last
	 * occurence.. it searches from end of the stering..
	 * 
	 * lastIndexOf(char ch, int fromIndex) returns the character from specific index
	 * from last index
	 *
	 * 
	 */

	public static void main(String[] args) {

		String s1 = "welcome to codewithakshay";
		System.out.println(s1.length());

		System.out.println(s1.indexOf('c'));
		System.out.println(s1.lastIndexOf('a'));

		System.out.println(s1.indexOf('a', 1));
		System.out.println(s1.lastIndexOf('a', 1));

	}

}
