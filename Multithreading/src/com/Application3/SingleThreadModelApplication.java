package com.Application3;

public class SingleThreadModelApplication {

	public static void main(String[] args) {
		
		PrintNumbers num = new PrintNumbers();
		long time1 = System.currentTimeMillis();
		num.print1To50();
		System.out.println();
		num.print50To1();
		long time2 = System.currentTimeMillis();
		System.out.println("Time taken to complete both tasks : "+((time2-time1)/1000)+" /sec");

	}

}
