package com.nt.java;

public class _2StringRules {

	public static void main(String[] args) {
		
		//Rule 1:
		//for char[] and byte[] parameter constructors the given offset and count arguments 
		//must be within the range of [0 to string length-1], else it leads to 
		//RE : java.lang.StringIndexOutOfBoundsException
		
		byte[] b = {97, 98, 99};
		/*
		 * String s1 = new String(b, 1, 3); System.out.println(s1);
		 * System.out.println(s1.length());
		 */ 
		char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
		String s2 = new String(ch, 2, 4);
		System.out.println("\n"+s2);
		System.out.println("\n"+s2.length());
		
		//Rule 2:
		//We can not pass null as an argument directly to constructor, it leads 
		//CE : ambiguous error
		//because it matched with all parameters of string class constructors
		
	    //	String s3 = new String(null); //ambiguous error
		
		//Rule 3:
		//We cannot create string object with null. It leads 
		//RE : java.lang.NullPointerException
		
		String s4 = null;
	    //	String s5 = new String(s4); // NullPointerException
		
	    //	String s5 = new String((StringBuffer)null); //NullPointerException
		
	    //	String s6 = new String(null);
	    //	String s7 = new String((String)null);
		
		String s8 = null;
		System.out.println("\n"+s8);
	    //	System.out.println(s8.length());   
		
		String s9 = "null";
		System.out.println("\nchars : "+s9);
		System.out.println("\ns9 length : "+s9.length());
		
		String s10 = new String("null");
		System.out.println("\nchars : "+s10);
		System.out.println("\ns10 length : "+s10.length());]
		
	}

}
