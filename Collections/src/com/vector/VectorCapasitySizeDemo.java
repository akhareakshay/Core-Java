package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorCapasitySizeDemo {

	public static void main(String[] args) {
		Vector v = new Vector(3);	
		
		System.out.println("Initial capacity and Size of vector is : ");
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		
		System.out.println();
		
		Customer c1 = new Customer("Supriya", 30, new Address("2-3-102/1", "Odisa","oriya", "12345"));
		
		Customer c2 = new Customer("Rahul", 25 , new Address("1-10-1022/3","Patna","Bihar", "22545"));
		
		Customer c3 = new Customer("Sank", 28 , new Address("8-20-1502/8","Kattak","Odisa", "89645"));
		
		Customer c4 = new Customer("Kanish", 52 , new Address("8-18-9856/8","Nagpur","MAharashtra", "85961"));
		
		Customer c5 = new Customer("Manisha", 51 , new Address("7-25-8752/4","Aurangabad","Maharashtra", "78459"));

		Customer c6 = new Customer("Oshi", 26 , new Address("3-09-8751/7","Jajpur","Odisa", "87965"));
		
		Customer c7 = new Customer("Akshay", 21 , new Address("9-7-4502/6","Rahur","Maharashtra", "445230")); 
		
		v.add(c1);
		v.add(c2);
		
		System.out.println("\nReached its capacity .. or not ?");
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		System.out.println();
		
		v.add(c3);
		System.out.println("\nReached its capacity .. or not ?");
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		System.out.println();
		
		v.add(c4);
		System.out.println("\nReached its capacity .. or not ?");
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		System.out.println();
		
		v.add(c5);
		System.out.println("\nReached its capacity .. or not ?");
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		System.out.println();
		
		v.add(c6);
		System.out.println("\nReached its capacity .. or not ?");
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		System.out.println();
		
		v.add(c7);
		System.out.println("\nReached its capacity .. or not ?");
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		System.out.println();
		
		System.out.println("\nThe Customer labels are : ");
		System.out.println();
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			System.out.println();
		}
		
	}
}


