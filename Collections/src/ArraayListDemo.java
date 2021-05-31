import java.util.ArrayList;

public class ArraayListDemo {

	public static void main(String[] args) {
		
		//Creating an ArrayList
		ArrayList al = new ArrayList();
		System.out.println("Initial size of ArrayList : "+al.size());
		
		
		  //Add elements to the ArrayList 
		  al.add("Red"); 
		  al.add("Green");
		  al.add("Blue");
		  al.add("Pink"); 
		  al.add("Orange");
		  System.out.println("\nSize of ArrayList after Additions : "+al.size());
	
		 
		  //Display the ArrayList
		  System.out.println("\nContents of ArrayList after Add : "+al);
	
		     
		  //Removes the 4th index elements from ArrayList 
		  al.remove(4);
		  System.out.println("\nContents of ArrayList after remove index : "+al);
		 
		   
		  
		 //Remove "Pink" elements from ArrayList 
		  al.remove("Pink");
		  System.out.println("\nContents of ArrayList after remove Object : "+al);
		  System.out.println("\nSize of ArrayList after Deletion : "+al.size());
		 
		  
		  //Retrieving 1st index element 
		  String alElement = (String) (al.get(1));
		  System.out.println("alElement :"+alElement);
		  
		  
		  //Inserting at 2nd index 
		  al.add(2,alElement+" Rose"); 
		  System.out.println(al);
		 	
	}

}
