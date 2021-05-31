package com.superConstructor.inheritance;

public class Sample2 extends Example2 {
	Sample2(){
		System.out.println("Sample zero param");
	}
	Sample2(int a){
		super(50);
		System.out.println("Sample int param");
	}

	public static void main(String[] args) {
		Sample2 s1 = new Sample2();
		Sample2 s2 = new Sample2(10);

	}

}
