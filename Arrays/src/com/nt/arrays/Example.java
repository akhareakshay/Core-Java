package com.nt.arrays;

public class Example {
	static void m1(int[] ia) {
		ia[2] = 5;
	}
	
	public static void main(String[] args) {
		
		//int[] ia = {10,20,30,40};
		//m1(ia);
		int[] ia2 = {1,2,3};
		m1(ia2);
		
		for(int i=0; i<ia2.length; i++) {
			System.out.println(ia2[i]+"\t");
		}
		
		
		
	

	}

}
