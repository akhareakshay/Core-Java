package com.nt.justDemo;

public class JustDemo7 {
	
	static void m1(Object obj) {
		if(obj instanceof Object) {
			System.out.println("If ");
		}
		else {
			System.out.println("Else");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1(null);

	}

}
