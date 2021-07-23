package com.codewithakshay;

public class Oprtn8_charAt {

	/*
	 * charAt() method returns the character present in the given index position..
	 */

	public static void main(String[] args) {

		String s = "Akshay";
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(4));
//		System.out.println(s.charAt(7));		//StringIndexOutOfBoundException
		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(-1));	//StringIndexOutOfBoundException
//		System.out.println(s.charAt(-4));	//StringIndexOutOfBoundException

	}

}
