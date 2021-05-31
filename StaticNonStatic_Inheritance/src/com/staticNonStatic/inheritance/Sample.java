package com.staticNonStatic.inheritance;

public class Sample extends Example {
	
	static int b = m3();
	static {
		System.out.println("Sample SB");
	}
	int y = m4();
	{
		System.out.println("Sample SNB");
	}
	Sample(){
		System.out.println("Sample Constructor");
	}
	static int m3() {
		System.out.println("Sample SV is Created");
		return 30;
	}
	int m4() {
		System.out.println("Sample NSV is created ");
		return 40;
	}
	void abc() {
		System.out.println("Sample abc");
	}

	public static void main(String[] args) {
		System.out.println("Sample main");
		Sample s = new Sample();
		s.abc();
		s.bbc();

	}

}
