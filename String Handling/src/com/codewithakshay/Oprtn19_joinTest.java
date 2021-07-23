package com.codewithakshay;

public class Oprtn19_joinTest {

	/*
	 * join() method can take multiple string parameters...
	 * 
	 * first param always will be delimeter..
	 * 
	 * and other parameters will be getting joined along with delimeter..
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String s1 = String.join("-", "Hey", "Guys", "Welcome", "To", "CodeWithAkshay");
		System.out.println(s1); // Hey-Guys-Welcome-To-CodeWithAkshay

		String s2 = String.join(" ", "Hey", "Guys", "Welcome", "To", "CodeWithAkshay");
		System.out.println(s2); // Hey Guys Welcome To CodeWithAkshay

	}

}
