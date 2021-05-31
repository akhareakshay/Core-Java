package com.nt.justDemo;

public class JustDemo5 {
	static void m1(int[] ia) {
		ia[1] = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] ia = {10,20,30,40};
//		m1(ia);
		
		int[] ia = {1,2};
		m1(ia);
		
		for(int i = 0; i<ia.length; i++) {
			System.out.println(ia[i]+"\t");
			
		}
		}

}
