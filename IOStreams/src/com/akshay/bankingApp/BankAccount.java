package com.akshay.bankingApp;

import java.io.Serializable;

public class BankAccount implements Serializable {

	static double minBalance = 5000;

	private long accNo;
	private String accHName;
	private String username;
	private transient String password;
	private transient double balance;

	public static double getMinBalance() {
		return minBalance;
	}

	public static void setMinBalance(double minBalance) {
		BankAccount.minBalance = minBalance;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accHName=" + accHName + ", username=" + username + ", password="
				+ password + ", balance=" + balance + "]";
	}

}
