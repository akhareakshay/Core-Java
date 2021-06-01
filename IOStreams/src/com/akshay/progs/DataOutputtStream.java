//Write a program to write data in primitive type size bytes using DataOutputStream class

package com.akshay.progs;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputtStream {

	public static void main(String[] args) throws IOException {

		// Create fileoutputstream class
		FileOutputStream fos = new FileOutputStream("src/com/akshay/res/DataOutputStream.txt");
		// crewate DataOutputStream class
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeBoolean(true);
		dos.writeInt(97);
		dos.writeDouble(78.41);
		dos.writeChar('a');
		dos.writeFloat(44.8f);
		dos.writeUTF("Akshay");
                                                                                                                                                                  
	}

}
