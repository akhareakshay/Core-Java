//Object Writing..

package com.akshay.bankingApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankTransaction {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// creating bank account object
		BankAccount acc = new BankAccount();

		// setting bank object data
		acc.setAccNo(565237439);
		acc.setAccHName("Akshay AKhare");
		acc.setUsername("Akshay");
		acc.setPassword("#Akshay4akhare");
		acc.setBalance(745588);

		// printing bank object state
		System.out.println(acc);

		// creating ObjectOuputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankAccount.txt"));

		oos.writeObject(acc);

		System.out.println("Object is written to file.. ");

	}

}
