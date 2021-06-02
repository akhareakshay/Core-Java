//Read Object

package com.akshay.bankingApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BankUser {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// Creating ObjectInputStream Object
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankAccount.txt"));

		BankAccount accDetails = (BankAccount) ois.readObject();

		System.out.println(accDetails.getAccHName() + "'s Details");
		System.out.println(accDetails);

	}

}
