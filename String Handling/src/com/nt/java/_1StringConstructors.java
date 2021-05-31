package com.nt.java;

public class _1StringConstructors {

	public static void main(String[] args) {
		
		//String() 
		//Creating Empty String object, not null string Object
		String s1 = new String();
		System.out.println(s1);
		
		//String(String value)
		//Creating string object with the given string object characters
		//It performs string copy operation
		
		String s2 = "abc";
		
		//string copy
		String s3 = new String(s2);
		
		//creating string with direct literals
		String s4 = new String("bas");
		
		//String assignments
		String s5 = s4;
		
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println(s2==s3);
		System.out.println(s4==s5);
		
		//String(StringBuffer sb)
		//creates string object with StringBuffer object data
		//performs string copy operation from StringBuffer object to string object
		
		//String(StringBuilder sf)
		//creates string object with StringBuilder object data
		//performs string copy operation from StringBuilder object to string object
		
		//String(char[] ch)
		//creates string object with the given char array values
		//performs string copy operation from the char[] object to string object
		char[] ch = {'a','b','c','d','e','f'};
		String s6 = new String(ch);
		System.out.println("\n"+s6);
		
		//String(char[] ch, int offset, int count)
		//Creates new string object with the given count number of characters from the given offset in the char[] object. 
		//Here offset is the starting index from which characters must be copied\
		char[] ch1 = {'a','b','c','d','e','f'};
		String s7 = new String(ch,2,3);
		System.out.println("\n"+s7);
		
		//String(byte[] b)
		//creates new string object by copying the given byte[] numbers by converting them into ASCII characters
		byte[] b = {97, 98, 99};
		String s8 = new String(b);
		System.out.println("\n"+s8);
		
		//String(byte[] b, int offset, int count)
		//creates new string object with the given count number of bytes from the given offset in the byte[].
		//All bytes are allowed to store in the ASCII character form
		byte[] b1 = {97, 98, 99, 100, 101};
		String s9 = new String(b1, 1, 3);
		System.out.println("\n"+s9);
		

	}

}
