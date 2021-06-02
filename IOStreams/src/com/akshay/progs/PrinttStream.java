//storing data in file using PrintStream class
package com.akshay.progs;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrinttStream {

	public static void main(String[] args) throws FileNotFoundException {

		// create object for printstream class
		PrintStream ps = new PrintStream("PrintStream.txt");

		ps.print("Akshay");
		ps.println(true);
		ps.println('s');
		ps.println(455.44);
		ps.println(44.4f);
		ps.println(584);

		System.out.println("Data Stored into file");
	}

}
