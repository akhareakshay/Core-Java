package com.codewithakshay;

public class Oprtn3_toStringTest {
	
	/*
	 * toString() implementation
	 * 
	 * it returns/gives the content/string data present in the object 
	 */

	public static void main(String[] args) {

		String s1 = "Akshay";
		System.out.println("s1 : " + s1); // Akshay
		System.out.println("s1 : " + s1.toString()); // Akshay
		System.out.println();

		String s2 = new String("welcome to codewithakshay");
		System.out.println("s2 : " + s2); // welcome to codewithakshay
		System.out.println("s2 : " + s2.toString()); // welcome to codewithakshay
		System.out.println();

		String s3 = null;
		System.out.println("s3 : " + s3); // null
		// System.out.println("s3 : " + s3.toString()); // nullPointerException
		System.out.println();

		/*
		 * String s4; 
		 * System.out.println("s4 : "+s4);
		 * System.out.println("s4 : "+s4.toString()); 
		 * System.out.println();
		 */		
		
	}

}
