//Write a program to read complete data from abc.txt 

package com.akshay.progs;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputtStream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/com/akshay/res/FileInputStream.txt");

		int i;

		while ((i = fis.read()) != -1) {
			System.out.print(i + " -- ");
			System.out.println((char) i);
		}

	}

}
