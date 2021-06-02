//Read data from three inputstreams

package com.akshay.progs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputtStream2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = new FileInputStream("SequenceInputStream1.txt");
		FileInputStream fis2 = new FileInputStream("SequenceInputStream2.txt");
		FileInputStream fis3 = new FileInputStream("SequenceInputStream3.txt");

		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);

		Enumeration<FileInputStream> e = v.elements();

		SequenceInputStream sis = new SequenceInputStream(e);

		int read;

		while ((read = sis.read()) != -1) {
			System.out.print(read + " -- ");
			System.out.println((char) read);
		}

	}

}
