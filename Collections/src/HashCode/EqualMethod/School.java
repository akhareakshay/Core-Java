package HashCode.EqualMethod;

import java.util.HashSet;

public class School {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(new Student(1, "KAnish", 1));
		hs.add(new Student(1, "MAnsoori", 1));
		
		hs.add(new Student(2, "Rahul", 2));
		hs.add(new Student(2, "Supriya", 2));
		hs.add(new Student(2, "SAnk", 1));
		hs.add(new Student(2, "Akshay", 1));
		
		hs.add(new Integer(8));
		hs.add(new Integer(10));
		hs.add(new String("a"));
		
		System.out.println(hs);
		
		hs.remove(new Student(2, "Akshay", 1));
		System.out.println("\nAfter removing");
		System.out.println(hs);
		
	}

}
