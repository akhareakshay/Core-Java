package com.vector;

public class Customer {
	
	String name; 
	int age;
	Address address;
	
	public Customer(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("Custome constructor");
	}
	@Override
	public String toString() {
		return ("Name : " +name+ " \nAge : "+age+" \nHno : "+address.hno+" \nStreet : "+address.street+" \nCity : "+address.city+" \nPh :"+address.ph);
	}

}
