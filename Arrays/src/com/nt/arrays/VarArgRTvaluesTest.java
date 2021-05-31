package com.nt.arrays;

import java.util.Scanner;

class A{
	void m1(int... ia) {
		System.out.println(ia.length+"values are passed");
		for(int i : ia) {
			System.out.println(" "+i);
		}
	}
}

public class VarArgRTvaluesTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter numbers with space seperator : ");
		String input = scn.nextLine();
		int[] iNums = null;
		
		if(input.isEmpty()) {
			iNums = new int[0];
		}
		else {
			String[] sNums = input.split(" ");
			
			iNums = new int[sNums.length];
			
			if(sNums.length != 0) {
				
				for(int i = 0; i<sNums.length; i++) {
					iNums[i] = Integer.parseInt(sNums[i]);
				}
			}
		}
		A a1 = new A();
		a1.m1(iNums );

	}

}
