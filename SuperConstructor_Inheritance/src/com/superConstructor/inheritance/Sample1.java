package com.superConstructor.inheritance;

public class Sample1 extends Example1 {
	Sample1(){
		System.out.println("Sample zero-Param constructor");
	}
	Sample1(int a){
		System.out.println("Sample int param constructor");
	}

	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1(10);

	}

}
