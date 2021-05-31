package com.nt.java;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

		
		/*
		 * String s1 = ""; String s2 = " "; String s3 = "a"; String s4 = new String();
		 * String s5 = new String(""); String s6 = new String(" "); String s7 = new
		 * String("a");
		 * 
		 * System.out.println("is s1 empty : "+s1.isEmpty());
		 * System.out.println("is s2 empty : "+s2.isEmpty());
		 * System.out.println("is s3 empty : "+s3.isEmpty());
		 * System.out.println("is s4 empty : "+s4.isEmpty());
		 * System.out.println("is s5 empty : "+s5.isEmpty());
		 * System.out.println("is s6 empty : "+s6.isEmpty());
		 * System.out.println("is s7 empty : "+s7.isEmpty());
		 */
		  
		/*
		 * StringBuffer bf = new StringBuffer("Akshay Akhare"); System.out.println(bf);
		 * 
		 * bf.insert(4,"Akshay Akhare"); System.out.println(bf);
		 */
		  
		/*
		 * Scanner scn = new Scanner(System.in); System.out.print("Enter your name : ");
		 * String usn = scn.nextLine();
		 * 
		 * if(usn.equals("akshay")) { System.out.println("Welcome to Code with akshay");
		 * } else { System.out.println("Who the fucking you're ?"); }
		 */
		
		/*
		 * String s8 = null; System.out.println("is s8 empty : "+s8.isEmpty());
		 */
		  
		  
		   
		/*
		 * String s9; System.out.println("is s9 empty");
		 * 
		 * Scanner scn = new Scanner(System.in);
		 * System.out.println("\n Enter String1 : ");
		 * System.out.print(scn.nextLine().isEmpty());
		 * 
		 * System.out.println("\n Enter String2 : ");
		 * System.out.println(scn.nextLine().isEmpty());
		 * 
		 * System.out.println("\n Enter String3 : ");
		 * System.out.println(scn.nextLine().isEmpty());
		 */
		  
		  
		  
		/*
		 * String s10 = "abc"; String s11 = "abcde";
		 * System.out.println(s11.compareTo(s10));
		 * System.out.println(s11.compareToIgnoreCase(s10));
		 */
		  
			/*
			 * String s = "Java Programming Language";
			 * 
			 * System.out.println(s.startsWith("Java"));
			 * System.out.println(s.startsWith("java"));
			 * System.out.println(s.startsWith("hari"));
			 * 
			 * 
			 * 
			 * System.out.println(s.endsWith("hari"));
			 * System.out.println(s.endsWith("Language"));
			 */
		  
		  
		  
			/*
			 * String s1 = new String("Java Programming Language");
			 * 
			 * // System.out.println("Characrter at 10th indext in string s1 :"
			 * +s1.charAt(9));
			 */
		  
		  
			/*
			 * for(int i = 0; i < s1.length() ; i++) {
			 * System.out.println("character at index : "+i+" is : "+s1.charAt(i)); }
			 * 
			 * 
			 * System.out.println(s1.indexOf('L')); // public int indexOf(String str);
			 */
		  
			/*
			 * StringBuffer br1 = new StringBuffer(); // br1.ensureCapacity(19);
			 * System.out.println(br1.length()); for(int i = 1; i<=17; i++) { //
			 * br1.append(i); System.out.println(br1.length()); }
			 */
			//  System.out.println(br1.capacity());
			 // System.out.println(br1.length());
			 
		  
				
			/*
			 * StringBuffer sb1 = new StringBuffer(); System.out.println(sb1.capacity());
			 * System.out.println(sb1.length());
			 * 
			 * sb1.trimToSize();
			 * 
			 * System.out.println(sb1.capacity()); System.out.println(sb1.length());
			 */
				 
		
		
			/*
			 * StringBuffer sb1 = new StringBuffer("a"); StringBuffer sb2 = sb1.append("b");
			 * 
			 * System.out.println(sb1); //a System.out.println(sb2); //ab
			 * System.out.println(sb1==sb2); //false
			 * 
			 * sb2.append("b"); System.out.println(sb2);
			 */
		
			/*
			 * String s1 = "a"; String s2 = "a"; System.out.println(s1==s2);
			 * System.out.println(s1.equals(s2));
			 */
		
			/*
			 * String s3 = new String("b"); String s4 = new String("b");
			 * System.out.println(s3==s4); System.out.println(s3.equals(s4));
			 */
		
		  
//		String s1 = "a";
//		String s2 = "a";
//		String s3 = "b";
//		String s4 = "ab";
//		String s5 = "a"+"b";
//		String s6 = s1+"b";
//		String s7 = s1+s2;
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s4==s5);
//		System.out.println(s4.equals(s5));
//		System.out.println(s6.hashCode()==s4.hashCode());
//		System.out.println(s7.hashCode());
//		
	}

}
