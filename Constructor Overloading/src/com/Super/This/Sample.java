package com.Super.This;

public class Sample extends Example {
	public Sample() {
		System.out.println("Sample No arg constructor");
	}
	Sample(String s){
		super(10);
		System.out.println("sample string arg constructor");
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample("abc");

	}

}
