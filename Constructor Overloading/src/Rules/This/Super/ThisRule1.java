package Rules.This.Super;

public class ThisRule1 {
	
	ThisRule1(){
		this(10); //this is right.... this must be placed in a constructor in the first line 
		System.out.println("no param");
	}
	ThisRule1(int a){
		System.out.println("int param");
	//	this("abc");  //this keyword must be placed first in the constructor
	}
	ThisRule1(String s){
		System.out.println("String param");
	}
	void m1() {
	//	this("abc"); //in method body we cannot use this keyword
		System.out.println("m1");
	}

}
