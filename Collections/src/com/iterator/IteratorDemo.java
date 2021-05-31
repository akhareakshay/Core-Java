package com.iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("abc");
		lhs.add(10);
		lhs.add(20);
		lhs.add(40);
		lhs.add("akks");
		
		Iterator lhsiterator = lhs.iterator();
		
		while(lhsiterator.hasNext())
		{
			Object obj = lhsiterator.next();
			
			if(obj instanceof String)
			{
				String str = ((String) obj).toUpperCase();
				System.out.println("Modified string : "+str);
			}
			else
			{
				System.out.println("Object : "+obj);
			}
		}

	}

}
