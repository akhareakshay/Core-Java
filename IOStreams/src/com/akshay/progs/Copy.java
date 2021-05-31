//Copy data from one file to another

package com.akshay.progs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {

		// create FileInputStream class object
		FileInputStream fis = new FileInputStream("src/com/akshay/res/FileInputStream.txt");

		// Create FileOutputStream class object
		FileOutputStream fos = new FileOutputStream("src/com/akshay/res/FileOutputStream.txt");

		// FileOutputStream fos = new
		// FileOutputStream("src/com/akshay/res/FileOutputStream.txt",true);

		int i;
		// To copy from one file to another, needs to iterate all chars avail in source
		// file and then have to copy to destination file
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}

	}

}
