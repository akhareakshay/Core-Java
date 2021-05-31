package HashCode.EqualMethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;

public class College {

	public static void main(String[] args) throws Exception {
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put(new Student(11, "Rahul", 11), new Address(1,2,"Patna"));
		lhm.put(new Student(11, "Kanish", 12), new Address(1,3,"nagpur"));
		
		lhm.put(new Student(12, "Akshay", 11), new Address(12,30,"Rahur"));
		lhm.put(new Student(12, "Sank", 12), new Address(14,30,"Odisa"));
		
		//storing student information in file
		FileOutputStream fos = new FileOutputStream("studentinformation.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lhm);
		System.out.println("\n Student info is saved"+lhm);

	}

}
