//Write a program to write data to a file

package com.akshay.progs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputtStream {

	public static void main(String[] args) throws IOException {

		// create FileOutputStream class object
		FileOutputStream fos = new FileOutputStream("src/com/akshay/res/FileOutputStream.txt");

		// write data to file
		fos.write('a');
		fos.write(759);
		fos.write(45);
		fos.write(98);
		fos.write('k');

		fos.flush();

	}

}
