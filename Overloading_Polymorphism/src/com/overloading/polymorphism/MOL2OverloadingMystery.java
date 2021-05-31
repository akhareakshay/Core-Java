package com.overloading.polymorphism;

public class MOL2OverloadingMystery {

	public static void main(String[] args) {
		CalleeImpl cl = new CalleeImpl();
		Object ob1 = new Object();
		Object ob2 = "Akshay";
		Object ob3 = new Integer(7729);
		
		cl.foo(ob1);
		cl.foo(ob2);
		cl.foo(ob3);
		
		System.out.println();
		
		cl.foo("Akshay");
		cl.foo(7729);
		
		System.out.println();
		
		cl.foo((String)ob2);
		cl.foo((Integer)7729);
		
		System.out.println();
		
		cl.foo((String)ob1);
		cl.foo((Integer)ob1);
		cl.foo((String)ob3);
		cl.foo((Integer)ob2);
		

	}

}
