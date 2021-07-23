package com.codewithakshay;

import java.util.Scanner;

public class Oprtn1_IsEmptyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "";
		String s2 = " ";
		String s3 = "a";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("a");

		System.out.println("is s1 empty : " + s1.isEmpty()); // true
		System.out.println("is s2 empty : " + s2.isEmpty()); // false
		System.out.println("is s3 empty : " + s3.isEmpty()); // false
		System.out.println("is s4 empty : " + s4.isEmpty()); // true
		System.out.println("is s5 empty : " + s5.isEmpty()); // true
		System.out.println("is s6 empty : " + s6.isEmpty()); // false
		System.out.println("is s7 empty : " + s7.isEmpty()); // false

		String s8 = null;
		// System.out.println("is s8 empty : " + s8.isEmpty()); //nullPointerException

		String s9;
		// System.out.println("is s9 empty : " + s9.isEmpty()); //need to initialize s9

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String string1 = scn.nextLine();
		System.out.println("is string 1 empty : " + string1.isEmpty());

		System.out.println("Enter String 2 : ");
		System.out.println(scn.nextLine().isEmpty());

		System.out.println("Enter String 3 : ");
		System.out.println(scn.nextLine().isEmpty());

	}

}
