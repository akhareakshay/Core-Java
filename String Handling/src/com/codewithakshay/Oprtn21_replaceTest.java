package com.codewithakshay;

public class Oprtn21_replaceTest {

	/*
	 * replace(oldChar, newChar) method replaces the old character with new
	 * character
	 * 
	 * charSequence replace(target, replacement) method replaces the the string with
	 * replacements
	 * 
	 * replaceAll(regex, replacement)
	 * 
	 * replaceFirst
	 */

	public static void main(String[] args) {

		String s1 = "abc abc abc";
		System.out.println("original string : " + s1);
		System.out.println();

		String replace = s1.replace('a', 'b');
		System.out.println("after replacing the String : " + replace);
		System.out.println();

		String replaceSequence = s1.replace("bbc", "abc");
		System.out.println("After replacing the sequence of characters/string : " + replaceSequence);
		System.out.println();

		String s2 = "akhareakshay2@gmail.com";

		String replace2 = s2.replace(".", "#");
		System.out.println("replacing dot(.) with # : " + replace2);

		String replaceAll = s2.replaceAll(".", "#");
		System.out.println("Replace All : " + replaceAll);

		/*
		 * String s3 = "akshayakhare@gmail.com"; String replaceFirst =
		 * s3.replaceFirst("\\", "#"); System.out.println("replace first method : " +
		 * replaceFirst);
		 */

	}

}
