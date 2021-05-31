package com.iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorMethodsRulesDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		
		Iterator itr = lhs.iterator();
		
		// itr.remove();  //RE: java.lang.IllegalStateExcetion
		
		Object obj1 = itr.next();
		System.out.println(obj1);
		
		itr.remove();
		
		System.out.println(obj1);
		//lhs.add("d");
		
		/*
		 * Object obj2 = itr.next(); System.out.println(obj2);
		 */
		
		
		

	}

}
