package com.codewithakshay;

import java.util.StringTokenizer;

public class Oprtn14_StringTockenizerTest {

	/*
	 * StringTokenizer have 3 constructors
	 * 
	 * it has countTokens(), hasMoreTokens(), nextToken() methods
	 * 
	 * first constructor split the given string into mulitple strings and return in
	 * multiple lines.. it separates the string based on the spaces available in
	 * given string
	 * 
	 * second constructor takes two param.. one in string and another is the string
	 * from which we want to make separation
	 * 
	 * third constructor take three parama... one in string, second param take
	 * string from which we want to separate.. and third one is boolean.. if we took
	 * 'true' then we get whole string and other tokenizer string...and if we take
	 * 'false' then it wont give complete string.. it directly gives tokeniser
	 * string
	 * 
	 * by default, false will be there..
	 */

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Hello coders welcome to code with akshay");
		// new StringTokenizer("Hello coders welcome to code with akshay", "e");
		// new StringTokenizer("Hello coders welcome to code with akshay", "e", true);
		// new StringTokenizer("Hello coders welcome to code with akshay", "e", false);

		System.out.println("Number of Tockens : " + st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
