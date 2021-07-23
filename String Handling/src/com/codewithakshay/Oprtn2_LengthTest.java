package com.codewithakshay;

import java.util.Scanner;

public class Oprtn2_LengthTest {

	/*
	 * In this program, we are going to see the use of length()
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "";
		String s2 = " ";
		String s3 = "a";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("ab");

		System.out.println("s1 Length : " + s1.length()); // 0
		System.out.println("s2 Length : " + s2.length()); // 1
		System.out.println("s3 Length : " + s3.length()); // 1
		System.out.println("s4 Length : " + s4.length()); // 0
		System.out.println("s5 Length : " + s5.length()); // 0
		System.out.println("s6 Length : " + s6.length()); // 1
		System.out.println("s7 Length : " + s7.length()); // 2

		String s8 = null;
		// System.out.println("s8 Length : " + s8.length()); //nullPointerException

		String s9;
		// System.out.println("s9 Length : " + s9.length()); //need to initialize s9

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String string1 = scn.nextLine();
		System.out.println("string 1 Length : " + string1.length());

		System.out.println("Enter String 2 : ");
		System.out.println(scn.nextLine().length());

		System.out.println("Enter String 3 : ");
		System.out.println(scn.nextLine().length());

	}

}
