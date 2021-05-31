package com.vector;

public class Address {
	
	String hno;
	String street, city, ph;
	
	public Address(String hno, String street, String city, String ph) {
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.ph = ph;
		System.out.println("\nAddress Constructor");
	}

}
