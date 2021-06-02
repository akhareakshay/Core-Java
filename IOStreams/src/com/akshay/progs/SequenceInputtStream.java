//Read data from two inputstreams

package com.akshay.progs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputtStream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = new FileInputStream("SequenceInputStream1.txt");
		FileInputStream fis2 = new FileInputStream("SequenceInputStream2.txt");

		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

		int read;

		while ((read = sis.read()) != -1) {
			System.out.print(read+" -- ");
			System.out.println((char)read);
		}

	}

}
