package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesDemo {

	public static void main(String[] args) {
		
		//Set objects creation
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts = new TreeSet();
		
		//Printing intial size of collection objects
		System.out.println("hs length : "+hs.size());
		System.out.println("lhs length : "+lhs.size());
		System.out.println("ts length : "+ts.size());

	}

}
