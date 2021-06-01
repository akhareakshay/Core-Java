//Write a program to read data in primitive type size bytes using DataInputStream class..

package com.akshay.progs;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputtStream {

	public static void main(String[] args) throws IOException {

		// Create FileInputStream class object
		FileInputStream fis = new FileInputStream("src/com/akshay/res/DataOutputStream.txt");
		// Create DataInputStream class object
		DataInputStream dis = new DataInputStream(fis);

		// reading data
		int readInt = dis.readInt();
		char readChar = dis.readChar();
		float readFloat = dis.readFloat();
		boolean readBoolean = dis.readBoolean();
	//	String readUTF = dis.readUTF();

		System.out.println(readInt);
		System.out.println(readChar);
		System.out.println(readFloat);
		System.out.println(readBoolean);
	//	System.out.println(readUTF);

	}

}
